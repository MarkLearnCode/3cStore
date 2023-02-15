package Controller.client;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JScrollPane;

import Dao.OtherFunction.AutoID;
import Dao.items.ImplItems;
import Dao.itemsOut.ImplItemsOut;
import Dao.orders.ImplOrders;
import Module.Items;
import Module.ItemsOut;
import Module.Member;
import Module.Orders;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Profile extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
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
		
		JLabel lblNewLabel_2 = new JLabel("\u6703\u54E1\u8CC7\u6599");
		lblNewLabel_2.setFont(new Font("標楷體", Font.BOLD, 62));
		lblNewLabel_2.setBounds(493, 51, 279, 62);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u59D3\u540D :");
		lblNewLabel_2_1.setFont(new Font("標楷體", Font.BOLD, 32));
		lblNewLabel_2_1.setBounds(82, 152, 133, 62);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\u96FB\u8A71 :");
		lblNewLabel_2_1_1.setFont(new Font("標楷體", Font.BOLD, 32));
		lblNewLabel_2_1_1.setBounds(82, 224, 133, 62);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\u5730\u5740 :");
		lblNewLabel_2_1_1_1.setFont(new Font("標楷體", Font.BOLD, 32));
		lblNewLabel_2_1_1_1.setBounds(82, 296, 133, 62);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("\u6B77\u53F2\u8A02\u55AE :");
		lblNewLabel_2_1_1_1_1.setFont(new Font("標楷體", Font.BOLD, 32));
		lblNewLabel_2_1_1_1_1.setBounds(82, 368, 190, 62);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(82, 426, 1081, 325);
		panel.add(scrollPane);
		
		JLabel toShopTag = new JLabel("\u56DE\u5230\u8CFC\u7269\u9801\u9762");
		toShopTag.setFont(new Font("標楷體", Font.PLAIN, 32));
		toShopTag.setBounds(54, 51, 218, 45);
		panel.add(toShopTag);
		
		JLabel nameLable = new JLabel("");
		nameLable.setFont(new Font("標楷體", Font.BOLD, 32));
		nameLable.setBounds(204, 152, 927, 62);
		panel.add(nameLable);
		
		JLabel phoneLable = new JLabel("");
		phoneLable.setFont(new Font("標楷體", Font.BOLD, 32));
		phoneLable.setBounds(204, 224, 927, 62);
		panel.add(phoneLable);
		
		JLabel addressLable = new JLabel("");
		addressLable.setFont(new Font("標楷體", Font.BOLD, 32));
		addressLable.setBounds(204, 296, 927, 62);
		panel.add(addressLable);
		
		//take data
		
		Member m = Index.getMb();
		nameLable.setText(m.getName());
		phoneLable.setText(m.getPhone());
		addressLable.setText(m.getAddress());
		List<ItemsOut> itemsOutData = new ArrayList<>();		
		List<Orders> order = new ImplOrders().queryOrderUsername(m.getUsername());
		for (Orders o : order) {
			itemsOutData.addAll(new ImplItemsOut().queryItemOutOrder(o.getOrderID()));
		}
		
		
		String[] column = new String[] { "項次", "訂單號","產品名稱" ,"總購買數量" ,"總金額" };
		String tableDate[][] = new String[itemsOutData.size() ][5];
		for (int i = 0; i < itemsOutData.size(); i++) {
			for (int j = 0; j < 5; j++) {

				if (j == 0) {
					tableDate[i][j] = "" + (i + 1);
				}
				if (j == 1) {
					tableDate[i][j] = itemsOutData.get(i).getOrderID();
				}
				if (j == 2) {
					Items item = new ImplItems().queryItemID(itemsOutData.get(i).getItemID());
					tableDate[i][j] = item.getItemName();
				}
				if (j == 3) {
					tableDate[i][j] = ""+itemsOutData.get(i).getCount();
				}
				if (j == 4) {
					tableDate[i][j] = ""+itemsOutData.get(i).getAllPrice();
				}
			}
		}
				
			
			table = new JTable(tableDate,column);
			scrollPane.setViewportView(table);
			
			
			
		
			toShopTag.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					clientPage frame = new clientPage();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					toShopTag.setForeground(new Color(159, 53, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					toShopTag.setForeground(new Color(0, 0, 0));
				}
			});
		
		
	}
}
