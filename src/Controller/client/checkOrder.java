package Controller.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Dao.OtherFunction.AutoID;
import Dao.items.ImplItems;
import Dao.itemsOut.ImplItemsOut;
import Dao.orders.ImplOrders;
import Module.Items;
import Module.ItemsOut;
import Module.Member;
import Module.Orders;

public class checkOrder extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField phoneField;
	private JTextField addressField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkOrder frame = new checkOrder();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public checkOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 134, 153));
		panel.setBounds(0, 0, 1184, 761);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("\u611F\u8B1D\u60A8\u7684\u8A02\u8CFC");
		lblNewLabel_2.setFont(new Font("標楷體", Font.BOLD, 64));
		lblNewLabel_2.setBounds(358, 49, 433, 106);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel(
				"\u8ACB\u78BA\u5B9A\u662F\u5426\u9700\u8981\u66F4\u6539\u806F\u7D61\u8CC7\u6599");
		lblNewLabel_2_1.setFont(new Font("標楷體", Font.BOLD, 64));
		lblNewLabel_2_1.setBounds(119, 180, 922, 106);
		panel.add(lblNewLabel_2_1);

		JRadioButton defaultRdbtn = new JRadioButton("\u540C\u6703\u54E1\u8CC7\u6599");

		defaultRdbtn.setFont(new Font("標楷體", Font.PLAIN, 28));
		buttonGroup.add(defaultRdbtn);
		defaultRdbtn.setBounds(333, 309, 190, 43);
		panel.add(defaultRdbtn);

		JRadioButton editRdbtn = new JRadioButton("\u66F4\u6539\u806F\u7D61\u8CC7\u6599");

		editRdbtn.setFont(new Font("標楷體", Font.PLAIN, 28));
		buttonGroup.add(editRdbtn);
		editRdbtn.setBounds(569, 309, 234, 43);
		panel.add(editRdbtn);

		JButton orderBtn = new JButton("\u9001\u51FA\u8A02\u55AE");
		
		orderBtn.setFont(new Font("標楷體", Font.PLAIN, 34));
		orderBtn.setBounds(461, 634, 216, 53);
		panel.add(orderBtn);

		JLabel lblNewLabel_2_2 = new JLabel("\u9023\u7D61\u96FB\u8A71 :");
		lblNewLabel_2_2.setFont(new Font("標楷體", Font.PLAIN, 34));
		lblNewLabel_2_2.setBounds(332, 368, 205, 70);
		panel.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_2_1 = new JLabel("\u5BC4\u4EF6\u5730\u5740 :");
		lblNewLabel_2_2_1.setFont(new Font("標楷體", Font.PLAIN, 34));
		lblNewLabel_2_2_1.setBounds(333, 448, 205, 70);
		panel.add(lblNewLabel_2_2_1);

		phoneField = new JTextField();
		phoneField.setEditable(false);
		phoneField.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		phoneField.setBounds(529, 385, 354, 40);
		panel.add(phoneField);
		phoneField.setColumns(10);

		addressField = new JTextField();
		addressField.setEditable(false);
		addressField.setFont(new Font("標楷體", Font.PLAIN, 28));
		addressField.setColumns(10);
		addressField.setBounds(529, 462, 551, 40);
		panel.add(addressField);

		// take data
		Member m = Index.getMb();
		List<Items> datas = clientPage.takeData();
		

		// check

		defaultRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phoneField.setText(m.getPhone());
				addressField.setText(m.getAddress());
//				phoneField.setText("default");
//				addressField.setText("default");

			}
		});

		editRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addressField.setEditable(true);
				phoneField.setEditable(true);
				phoneField.setText("");
				addressField.setText("");
			}
		});
		
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String orderID = AutoID.orderAutoID();
				
				LocalDateTime date = LocalDateTime.now();
				Timestamp tDate = Timestamp.valueOf(date);
				int price = 0;
				int count = 0;
				for (Items items : datas) {
					price = price+items.getStock()*items.getPrice();
					count = count + items.getStock();
				}
				if(defaultRdbtn.isSelected()) {
					Orders o = new Orders(orderID, tDate, m.getUsername(), m.getAddress(), m.getPhone(), count, price);
					new ImplOrders().add(o);
					for (Items items : datas) {
						String shipID = AutoID.itemOutAutoID();
						ItemsOut io = new ItemsOut(orderID, shipID, tDate,items.getItemID(), items.getStock(), items.getPrice(),items.getStock()*items.getPrice());
						new ImplItemsOut().add(io);
						Items rowItem = new ImplItems().queryItemID(items.getItemID());
						rowItem.setStock(rowItem.getStock()-items.getStock());
						new ImplItems().update(rowItem);
						
					}		

					clientPage.clearData();
					
					JFrame jFrame = new JFrame();
			        JOptionPane.showMessageDialog(jFrame, "下單成功 返回購物頁面");
			        clientPage frame = new clientPage();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
					
					
				}else if (editRdbtn.isSelected()) {
					System.out.println("999");
					Orders o = new Orders(orderID, tDate, m.getUsername(), addressField.getText(), phoneField.getText(), count, price);
					new ImplOrders().add(o);
					for (Items items : datas) {
						
						String shipID = AutoID.itemOutAutoID();
						ItemsOut io = new ItemsOut(orderID, shipID, tDate,items.getItemID(), items.getStock(), items.getPrice(),items.getStock()*items.getPrice());
						new ImplItemsOut().add(io);
						
						Items rowItem = new ImplItems().queryItemID(items.getItemID());
						System.out.println("rowItem = "+rowItem.getStock());
						rowItem.setStock(rowItem.getStock()-items.getStock());
						
						new ImplItems().update(rowItem);
					}	
					
					clientPage.clearData();
					
					JFrame jFrame = new JFrame();
			        JOptionPane.showMessageDialog(jFrame, "下單成功 返回購物頁面");
			        clientPage frame = new clientPage();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
				}
			
				
				
				
				
			}
		});
	}
}
