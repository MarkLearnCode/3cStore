package Controller.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Dao.items.ImplItems;
import Dao.member.ImplMember;
import Module.Items;
import Module.Member;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class clientPage extends JFrame {

	private JPanel contentPane;

	private static List<Items> dataList = new ArrayList<>();

	public static List<Items> takeData() {
		return dataList;
	}
	public static void clearData() {
		clientPage.dataList.clear();
	}

	private JTable table1;
	private static String[] column = new String[] { "項次", "品名", "數量", "金額" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clientPage frame = new clientPage();
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
	public clientPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 134, 156));
		panel.setBounds(0, 0, 1234, 761);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("1. CPU");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel.setBounds(58, 116, 165, 40);
		panel.add(lblNewLabel);

		JLabel top = new JLabel("歡迎會員進入購物網");
		top.setFont(new Font("標楷體", Font.PLAIN, 32));
		top.setBounds(450, 23, 406, 39);
		panel.add(top);

		JLabel lblNewLabel_2 = new JLabel("2. \u4E3B\u6A5F\u677F");
		lblNewLabel_2.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_2.setBounds(58, 176, 165, 40);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("3. SSD");
		lblNewLabel_2_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_2_1.setBounds(58, 236, 165, 40);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("4. RAM");
		lblNewLabel_2_1_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_2_1_1.setBounds(58, 296, 165, 40);
		panel.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("5. \u986F\u793A\u5361");
		lblNewLabel_2_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_2_1_1_1.setBounds(58, 356, 165, 40);
		panel.add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("6. \u96FB\u4F9B");
		lblNewLabel_2_1_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_2_1_1_1_1.setBounds(58, 416, 165, 40);
		panel.add(lblNewLabel_2_1_1_1_1);

		JComboBox cpuBox = new JComboBox();
		cpuBox.setFont(new Font("標楷體", Font.PLAIN, 20));

		cpuBox.setToolTipText("");
		cpuBox.setBounds(233, 116, 600, 40);
		panel.add(cpuBox);

		JComboBox boardBox = new JComboBox();
		boardBox.setFont(new Font("標楷體", Font.PLAIN, 20));
		boardBox.setToolTipText("");
		boardBox.setBounds(233, 176, 600, 40);
		panel.add(boardBox);

		JComboBox ssdBox = new JComboBox();
		ssdBox.setFont(new Font("標楷體", Font.PLAIN, 20));
		ssdBox.setToolTipText("");
		ssdBox.setBounds(233, 236, 600, 40);
		panel.add(ssdBox);

		JComboBox ramBox = new JComboBox();
		ramBox.setFont(new Font("標楷體", Font.PLAIN, 20));
		ramBox.setToolTipText("");
		ramBox.setBounds(233, 296, 600, 40);
		panel.add(ramBox);

		JComboBox vgaBox = new JComboBox();
		vgaBox.setFont(new Font("標楷體", Font.PLAIN, 20));
		vgaBox.setToolTipText("");
		vgaBox.setBounds(233, 356, 600, 40);
		panel.add(vgaBox);

		JComboBox powerBox = new JComboBox();
		powerBox.setFont(new Font("標楷體", Font.PLAIN, 20));
		powerBox.setToolTipText("");
		powerBox.setBounds(233, 416, 600, 40);
		panel.add(powerBox);

		JComboBox cpuStockBox = new JComboBox();

		cpuStockBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		cpuStockBox.setToolTipText("");
		cpuStockBox.setBounds(853, 116, 70, 40);
		panel.add(cpuStockBox);

		JComboBox boardStockBox = new JComboBox();
		boardStockBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		boardStockBox.setToolTipText("");
		boardStockBox.setBounds(853, 176, 70, 40);
		panel.add(boardStockBox);

		JComboBox ssdStockBox = new JComboBox();
		ssdStockBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		ssdStockBox.setToolTipText("");
		ssdStockBox.setBounds(853, 236, 70, 40);
		panel.add(ssdStockBox);

		JComboBox ramStockBox = new JComboBox();
		ramStockBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		ramStockBox.setToolTipText("");
		ramStockBox.setBounds(853, 296, 70, 40);
		panel.add(ramStockBox);

		JComboBox vgaStockBox = new JComboBox();
		vgaStockBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		vgaStockBox.setToolTipText("");
		vgaStockBox.setBounds(853, 356, 70, 40);
		panel.add(vgaStockBox);

		JComboBox powerStockBox = new JComboBox();
		powerStockBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		powerStockBox.setToolTipText("");
		powerStockBox.setBounds(853, 416, 70, 40);
		panel.add(powerStockBox);

		JTextArea cpuBoxPrice = new JTextArea();
		cpuBoxPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		cpuBoxPrice.setEditable(false);
		cpuBoxPrice.setBounds(940, 116, 130, 40);
		panel.add(cpuBoxPrice);

		JTextArea boardBoxPrice = new JTextArea();
		boardBoxPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		boardBoxPrice.setEditable(false);
		boardBoxPrice.setBounds(940, 176, 130, 40);
		panel.add(boardBoxPrice);

		JTextArea ssdBoxPrice = new JTextArea();
		ssdBoxPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		ssdBoxPrice.setEditable(false);
		ssdBoxPrice.setBounds(940, 236, 130, 40);
		panel.add(ssdBoxPrice);

		JTextArea ramBoxPrice = new JTextArea();
		ramBoxPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		ramBoxPrice.setEditable(false);
		ramBoxPrice.setBounds(940, 296, 130, 40);
		panel.add(ramBoxPrice);

		JTextArea vgaBoxPrice = new JTextArea();
		vgaBoxPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		vgaBoxPrice.setEditable(false);
		vgaBoxPrice.setBounds(940, 356, 130, 40);
		panel.add(vgaBoxPrice);

		JTextArea powerBoxPrice = new JTextArea();
		powerBoxPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		powerBoxPrice.setEditable(false);
		powerBoxPrice.setBounds(940, 416, 130, 40);
		panel.add(powerBoxPrice);

		JButton cpuAddBtn = new JButton("Add");

		cpuAddBtn.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		cpuAddBtn.setBounds(1087, 116, 85, 40);
		panel.add(cpuAddBtn);

		JButton boardAddBtn = new JButton("Add");

		boardAddBtn.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		boardAddBtn.setBounds(1087, 176, 85, 40);
		panel.add(boardAddBtn);

		JButton ssdAddBtn = new JButton("Add");

		ssdAddBtn.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		ssdAddBtn.setBounds(1087, 236, 85, 40);
		panel.add(ssdAddBtn);

		JButton ramAddBtn = new JButton("Add");

		ramAddBtn.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		ramAddBtn.setBounds(1087, 296, 85, 40);
		panel.add(ramAddBtn);

		JButton vgaAddBtn = new JButton("Add");

		vgaAddBtn.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		vgaAddBtn.setBounds(1087, 356, 85, 40);
		panel.add(vgaAddBtn);

		JButton powerAddBtn = new JButton("Add");

		powerAddBtn.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		powerAddBtn.setBounds(1087, 416, 85, 40);
		panel.add(powerAddBtn);

		JButton orderSubmitBtn = new JButton("\u4E0B\u55AE");

		orderSubmitBtn.setFont(new Font("標楷體", Font.PLAIN, 26));
		orderSubmitBtn.setBounds(523, 696, 190, 40);
		panel.add(orderSubmitBtn);

		JLabel lblNewLabel_1_1 = new JLabel("\u8A73\u60C5");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_1_1.setBounds(491, 79, 85, 39);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("\u5EAB\u5B58");
		lblNewLabel_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_1_1_1.setBounds(855, 79, 85, 39);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("\u5C0F\u8A08");
		lblNewLabel_1_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_1_1_1_1.setBounds(972, 79, 85, 39);
		panel.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("\u52A0\u5165\u8CFC\u7269\u5340");
		lblNewLabel_1_1_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel_1_1_1_1_1.setBounds(1063, 79, 171, 39);
		panel.add(lblNewLabel_1_1_1_1_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 472, 1104, 220);
		panel.add(scrollPane);
		
		//到會員頁
		
		

		// 動態會員顯示
		Member m = Index.getMb();
		String username =  m.getUsername();
		top.setText("歡迎"+username+"進入購物網");

		// 資料填入BOX
		List<Items> allItems = new ImplItems().queryAllList();
		ArrayList<Integer> cpuArr = new ArrayList<>();
		ArrayList<Integer> boardArr = new ArrayList<>();
		ArrayList<Integer> ssdArr = new ArrayList<>();
		ArrayList<Integer> ramArr = new ArrayList<>();
		ArrayList<Integer> vgaArr = new ArrayList<>();
		ArrayList<Integer> powerArr = new ArrayList<>();

		for (Items items : allItems) {
			if (items.getItemType().equals("CPU")) {
				cpuArr.add(allItems.indexOf(items));
			}
		}
		for (Items items : allItems) {
			if (items.getItemType().equals("Board")) {
				boardArr.add(allItems.indexOf(items));
			}
		}
		for (Items items : allItems) {
			if (items.getItemType().equals("RAM")) {
				ramArr.add(allItems.indexOf(items));
			}
		}
		for (Items items : allItems) {
			if (items.getItemType().equals("SSD")) {
				ssdArr.add(allItems.indexOf(items));
			}
		}
		for (Items items : allItems) {
			if (items.getItemType().equals("VGA")) {
				vgaArr.add(allItems.indexOf(items));
			}
		}
		for (Items items : allItems) {
			if (items.getItemType().equals("Power")) {
				powerArr.add(allItems.indexOf(items));
			}
		}
		// cpu

		cpuBox.addItem("請點擊查看全部內容 共" + cpuArr.size() + "項");
		for (int i = 0; i < cpuArr.size(); i++) {
			cpuBox.addItem(allItems.get(cpuArr.get(i)).getBrand() + " " + allItems.get(cpuArr.get(i)).getItemType()
					+ " " + allItems.get(cpuArr.get(i)).getGrade() + " " + allItems.get(cpuArr.get(i)).getItemName()
					+ " 單價: " + allItems.get(cpuArr.get(i)).getPrice());
		}

		// board
		boardBox.addItem("請點擊查看全部內容 共" + boardArr.size() + "項");
		for (int i = 0; i < boardArr.size(); i++) {
			boardBox.addItem(allItems.get(boardArr.get(i)).getBrand() + " "
					+ allItems.get(boardArr.get(i)).getItemType() + " " + allItems.get(boardArr.get(i)).getGrade() + " "
					+ allItems.get(boardArr.get(i)).getItemName() + " 單價: " + allItems.get(boardArr.get(i)).getPrice());
		}
		// ssd
		ssdBox.addItem("請點擊查看全部內容 共" + ssdArr.size() + "項");
		for (int i = 0; i < ssdArr.size(); i++) {
			ssdBox.addItem(allItems.get(ssdArr.get(i)).getBrand() + " " + allItems.get(ssdArr.get(i)).getItemType()
					+ " " + allItems.get(ssdArr.get(i)).getGrade() + " " + allItems.get(ssdArr.get(i)).getItemName()
					+ " 單價: " + allItems.get(ssdArr.get(i)).getPrice());
		}
		// ram
		ramBox.addItem("請點擊查看全部內容 共" + ramArr.size() + "項");
		for (int i = 0; i < ramArr.size(); i++) {
			ramBox.addItem(allItems.get(ramArr.get(i)).getBrand() + " " + allItems.get(ramArr.get(i)).getItemType()
					+ " " + allItems.get(ramArr.get(i)).getGrade() + " " + allItems.get(ramArr.get(i)).getItemName()
					+ " 單價: " + allItems.get(ramArr.get(i)).getPrice());
		}
		// vga
		vgaBox.addItem("請點擊查看全部內容 共" + vgaArr.size() + "項");
		for (int i = 0; i < vgaArr.size(); i++) {
			vgaBox.addItem(allItems.get(vgaArr.get(i)).getBrand() + " " + allItems.get(vgaArr.get(i)).getItemType()
					+ " " + allItems.get(vgaArr.get(i)).getGrade() + " " + allItems.get(vgaArr.get(i)).getItemName()
					+ " 單價: " + allItems.get(vgaArr.get(i)).getPrice());
		}
		// power
		powerBox.addItem("請點擊查看全部內容 共" + powerArr.size() + "項");

		JButton clearBtn = new JButton("\u522A\u9664\u91CD\u9078");

		clearBtn.setFont(new Font("標楷體", Font.PLAIN, 26));
		clearBtn.setBounds(910, 696, 190, 40);
		panel.add(clearBtn);
		
		JLabel toMemberTag = new JLabel("進入會員資料");
		toMemberTag.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				toMemberTag.setForeground(new Color(159, 53, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				toMemberTag.setForeground(new Color(0, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Profile frame = new Profile();
				frame.setVisible(true);
				frame.setResizable(false);
				dispose();
			}
		});
		toMemberTag.setFont(new Font("標楷體", Font.PLAIN, 32));
		toMemberTag.setBounds(33, 23, 218, 45);
		panel.add(toMemberTag);

		for (int i = 0; i < powerArr.size(); i++) {
			powerBox.addItem(allItems.get(powerArr.get(i)).getBrand() + " "
					+ allItems.get(powerArr.get(i)).getItemType() + " " + allItems.get(powerArr.get(i)).getGrade() + " "
					+ allItems.get(powerArr.get(i)).getItemName() + " 單價: " + allItems.get(powerArr.get(i)).getPrice());
		}
		// 資料填入stock
		ArrayList<Integer> cpuStock = new ArrayList<>();
		ArrayList<Integer> boardStock = new ArrayList<>();
		ArrayList<Integer> ramStock = new ArrayList<>();
		ArrayList<Integer> ssdStock = new ArrayList<>();
		ArrayList<Integer> vgaStock = new ArrayList<>();
		ArrayList<Integer> powerStock = new ArrayList<>();
		for (int i = 0; i < cpuArr.size(); i++) {
			cpuStock.add(allItems.get(cpuArr.get(i)).getStock());
//			System.out.println("cpuStock = " + cpuStock.get(i));
		}
		for (int i = 0; i < boardArr.size(); i++) {
			boardStock.add(allItems.get(boardArr.get(i)).getStock());
		}
		for (int i = 0; i < ssdArr.size(); i++) {
			ssdStock.add(allItems.get(ssdArr.get(i)).getStock());
		}
		for (int i = 0; i < ramArr.size(); i++) {
			ramStock.add(allItems.get(ramArr.get(i)).getStock());
		}
		for (int i = 0; i < vgaArr.size(); i++) {
			vgaStock.add(allItems.get(vgaArr.get(i)).getStock());
		}
		for (int i = 0; i < powerArr.size(); i++) {
			powerStock.add(allItems.get(powerArr.get(i)).getStock());
		}

		// cpu
		cpuBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = cpuBox.getSelectedIndex();
				if (index != 0) {
					index = index - 1;
					cpuStockBox.removeAllItems();
					for (int j = 1; j <= cpuStock.get(index); j++) {
						cpuStockBox.addItem(j);
					}
				} else {
					cpuStockBox.removeAllItems();
				}
			}
		});
		// board
		boardBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = boardBox.getSelectedIndex();
				if (index != 0) {
					index = index - 1;
					boardStockBox.removeAllItems();
					for (int j = 1; j <= boardStock.get(index); j++) {
						boardStockBox.addItem(j);
					}
				} else {
					boardStockBox.removeAllItems();
				}
			}
		});
		// ssd
		ssdBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = ssdBox.getSelectedIndex();
				if (index != 0) {
					index = index - 1;
					ssdStockBox.removeAllItems();
					for (int j = 1; j <= ssdStock.get(index); j++) {
						ssdStockBox.addItem(j);
					}
				} else {
					ssdStockBox.removeAllItems();
				}
			}
		});
		// ram
		ramBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = ramBox.getSelectedIndex();
				if (index != 0) {
					index = index - 1;
					ramStockBox.removeAllItems();
					for (int j = 1; j <= ramStock.get(index); j++) {
						ramStockBox.addItem(j);
					}
				} else {
					ramStockBox.removeAllItems();
				}
			}
		});
		// vga
		vgaBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = vgaBox.getSelectedIndex();
				if (index != 0) {
					index = index - 1;
					vgaStockBox.removeAllItems();
					for (int j = 1; j <= vgaStock.get(index); j++) {
						vgaStockBox.addItem(j);
					}
				} else {
					vgaStockBox.removeAllItems();
				}
			}
		});
		// power
		powerBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = powerBox.getSelectedIndex();
				if (index != 0) {
					index = index - 1;
					powerStockBox.removeAllItems();
					for (int j = 1; j <= powerStock.get(index); j++) {
						powerStockBox.addItem(j);
					}
				} else {
					powerStockBox.removeAllItems();
				}
			}
		});

		// 計算price
		// cpu
		cpuStockBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = cpuBox.getSelectedIndex();
				if (index != 0) {
					int count = cpuStockBox.getSelectedIndex() + 1;
					int price = allItems.get(cpuArr.get(index - 1)).getPrice() * count;
					cpuBoxPrice.setText("" + price);
				} else {
					cpuBoxPrice.setText("");
				}
			}
		});

		// board
		boardStockBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = boardBox.getSelectedIndex();
				if (index != 0) {
					int count = boardStockBox.getSelectedIndex() + 1;
					int price = allItems.get(boardArr.get(index - 1)).getPrice() * count;
					boardBoxPrice.setText("" + price);
				} else {
					boardBoxPrice.setText("");
				}
			}
		});
		// ssd
		ssdStockBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = ssdBox.getSelectedIndex();
				if (index != 0) {
					int count = ssdStockBox.getSelectedIndex() + 1;
					int price = allItems.get(ssdArr.get(index - 1)).getPrice() * count;
					ssdBoxPrice.setText("" + price);
				} else {
					ssdBoxPrice.setText("");
				}
			}
		});
		// ram
		ramStockBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = ramBox.getSelectedIndex();
				if (index != 0) {
					int count = ramStockBox.getSelectedIndex() + 1;
					int price = allItems.get(ramArr.get(index - 1)).getPrice() * count;
					ramBoxPrice.setText("" + price);
				} else {
					ramBoxPrice.setText("");
				}
			}
		});
		// vga
		vgaStockBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = vgaBox.getSelectedIndex();
				if (index != 0) {
					int count = vgaStockBox.getSelectedIndex() + 1;
					int price = allItems.get(vgaArr.get(index - 1)).getPrice() * count;
					vgaBoxPrice.setText("" + price);
				} else {
					vgaBoxPrice.setText("");
				}
			}
		});
		// power
		powerStockBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = powerBox.getSelectedIndex();
				if (index != 0) {
					int count = powerStockBox.getSelectedIndex() + 1;
					int price = allItems.get(powerArr.get(index - 1)).getPrice() * count;
					powerBoxPrice.setText("" + price);
				} else {
					powerBoxPrice.setText("");
				}
			}
		});

		// add Btn
		cpuAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cpuBox.getSelectedIndex() != 0) {
					Items it = new Items();
					int selectIndex = cpuBox.getSelectedIndex() - 1;
					int getRowDateIndex = cpuArr.get(selectIndex);
					it = allItems.get(getRowDateIndex);
					it.setStock(cpuStockBox.getSelectedIndex() + 1);
					dataList.add(it);

					String tableDate[][] = new String[dataList.size() + 1][4];
					int allPrice = 0;
					int count = 0;
					for (int i = 0; i <= dataList.size(); i++) {

						for (int j = 0; j < 4; j++) {
							if (i < dataList.size()) {
								if (j == 0) {
									tableDate[i][j] = "" + (i + 1);
									System.out.println(tableDate[i][j]);
								}
								if (j == 1) {
									tableDate[i][j] = dataList.get(i).getBrand() + " " + dataList.get(i).getItemType()
											+ " " + dataList.get(i).getGrade() + " " + dataList.get(i).getItemName();
								}
								if (j == 2) {
									tableDate[i][j] = "" + dataList.get(i).getStock();
									count = count + dataList.get(i).getStock();
								}
								if (j == 3) {
									allPrice = allPrice + dataList.get(i).getStock() * dataList.get(i).getPrice();
									tableDate[i][j] = "" + (dataList.get(i).getStock() * dataList.get(i).getPrice());
								}
							}
						}
						if (i == dataList.size()) {
							tableDate[i][0] = "";
							tableDate[i][1] = "";
							tableDate[i][2] = "總數量 " + count;
							tableDate[i][3] = "總金額 " + allPrice;
						}
					}
					table1 = new JTable(tableDate, column);
					scrollPane.setViewportView(table1);
				}
				cpuBox.setSelectedIndex(0);
			}
		});

		boardAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (boardBox.getSelectedIndex() != 0) {
					Items it = new Items();
					int selectIndex = boardBox.getSelectedIndex() - 1;
					int getRowDateIndex = boardArr.get(selectIndex);
					it = allItems.get(getRowDateIndex);
					it.setStock(boardStockBox.getSelectedIndex() + 1);
					dataList.add(it);

					String tableDate[][] = new String[dataList.size() + 1][4];
					int allPrice = 0;
					int count = 0;
					for (int i = 0; i <= dataList.size(); i++) {

						for (int j = 0; j < 4; j++) {
							if (i < dataList.size()) {
								if (j == 0) {
									tableDate[i][j] = "" + (i + 1);
									System.out.println(tableDate[i][j]);
								}
								if (j == 1) {
									tableDate[i][j] = dataList.get(i).getBrand() + " " + dataList.get(i).getItemType()
											+ " " + dataList.get(i).getGrade() + " " + dataList.get(i).getItemName();
								}
								if (j == 2) {
									tableDate[i][j] = "" + dataList.get(i).getStock();
									count = count + dataList.get(i).getStock();
								}
								if (j == 3) {
									allPrice = allPrice + dataList.get(i).getStock() * dataList.get(i).getPrice();
									tableDate[i][j] = "" + (dataList.get(i).getStock() * dataList.get(i).getPrice());
								}
							}
						}
						if (i == dataList.size()) {
							tableDate[i][0] = "";
							tableDate[i][1] = "";
							tableDate[i][2] = "總數量 " + count;
							tableDate[i][3] = "總金額 " + allPrice;
						}
					}
					table1 = new JTable(tableDate, column);
					scrollPane.setViewportView(table1);
				}
				boardBox.setSelectedIndex(0);
			}
		});
		ssdAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ssdBox.getSelectedIndex() != 0) {
					Items it = new Items();
					int selectIndex = ssdBox.getSelectedIndex() - 1;
					int getRowDateIndex = ssdArr.get(selectIndex);
					it = allItems.get(getRowDateIndex);
					it.setStock(ssdStockBox.getSelectedIndex() + 1);
					dataList.add(it);

					String tableDate[][] = new String[dataList.size() + 1][4];
					int allPrice = 0;
					int count = 0;
					for (int i = 0; i <= dataList.size(); i++) {

						for (int j = 0; j < 4; j++) {
							if (i < dataList.size()) {
								if (j == 0) {
									tableDate[i][j] = "" + (i + 1);
									System.out.println(tableDate[i][j]);
								}
								if (j == 1) {
									tableDate[i][j] = dataList.get(i).getBrand() + " " + dataList.get(i).getItemType()
											+ " " + dataList.get(i).getGrade() + " " + dataList.get(i).getItemName();
								}
								if (j == 2) {
									tableDate[i][j] = "" + dataList.get(i).getStock();
									count = count + dataList.get(i).getStock();
								}
								if (j == 3) {
									allPrice = allPrice + dataList.get(i).getStock() * dataList.get(i).getPrice();
									tableDate[i][j] = "" + (dataList.get(i).getStock() * dataList.get(i).getPrice());
								}
							}
						}
						if (i == dataList.size()) {
							tableDate[i][0] = "";
							tableDate[i][1] = "";
							tableDate[i][2] = "總數量 " + count;
							tableDate[i][3] = "總金額 " + allPrice;
						}
					}
					table1 = new JTable(tableDate, column);
					scrollPane.setViewportView(table1);
				}
				ssdBox.setSelectedIndex(0);
			}
		});
		ramAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ramBox.getSelectedIndex() != 0) {
					Items it = new Items();
					int selectIndex = ramBox.getSelectedIndex() - 1;
					int getRowDateIndex = ramArr.get(selectIndex);
					it = allItems.get(getRowDateIndex);
					it.setStock(ramStockBox.getSelectedIndex() + 1);
					dataList.add(it);

					String tableDate[][] = new String[dataList.size() + 1][4];
					int allPrice = 0;
					int count = 0;
					for (int i = 0; i <= dataList.size(); i++) {

						for (int j = 0; j < 4; j++) {
							if (i < dataList.size()) {
								if (j == 0) {
									tableDate[i][j] = "" + (i + 1);
									System.out.println(tableDate[i][j]);
								}
								if (j == 1) {
									tableDate[i][j] = dataList.get(i).getBrand() + " " + dataList.get(i).getItemType()
											+ " " + dataList.get(i).getGrade() + " " + dataList.get(i).getItemName();
								}
								if (j == 2) {
									tableDate[i][j] = "" + dataList.get(i).getStock();
									count = count + dataList.get(i).getStock();
								}
								if (j == 3) {
									allPrice = allPrice + dataList.get(i).getStock() * dataList.get(i).getPrice();
									tableDate[i][j] = "" + (dataList.get(i).getStock() * dataList.get(i).getPrice());
								}
							}
						}
						if (i == dataList.size()) {
							tableDate[i][0] = "";
							tableDate[i][1] = "";
							tableDate[i][2] = "總數量 " + count;
							tableDate[i][3] = "總金額 " + allPrice;
						}
					}
					table1 = new JTable(tableDate, column);
					scrollPane.setViewportView(table1);
				}
				ramBox.setSelectedIndex(0);
			}
		});
		vgaAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (vgaBox.getSelectedIndex() != 0) {
					Items it = new Items();
					int selectIndex = vgaBox.getSelectedIndex() - 1;
					int getRowDateIndex = vgaArr.get(selectIndex);
					it = allItems.get(getRowDateIndex);
					it.setStock(vgaStockBox.getSelectedIndex() + 1);
					dataList.add(it);

					String tableDate[][] = new String[dataList.size() + 1][4];
					int allPrice = 0;
					int count = 0;
					for (int i = 0; i <= dataList.size(); i++) {

						for (int j = 0; j < 4; j++) {
							if (i < dataList.size()) {
								if (j == 0) {
									tableDate[i][j] = "" + (i + 1);
									System.out.println(tableDate[i][j]);
								}
								if (j == 1) {
									tableDate[i][j] = dataList.get(i).getBrand() + " " + dataList.get(i).getItemType()
											+ " " + dataList.get(i).getGrade() + " " + dataList.get(i).getItemName();
								}
								if (j == 2) {
									tableDate[i][j] = "" + dataList.get(i).getStock();
									count = count + dataList.get(i).getStock();
								}
								if (j == 3) {
									allPrice = allPrice + dataList.get(i).getStock() * dataList.get(i).getPrice();
									tableDate[i][j] = "" + (dataList.get(i).getStock() * dataList.get(i).getPrice());
								}
							}
						}
						if (i == dataList.size()) {
							tableDate[i][0] = "";
							tableDate[i][1] = "";
							tableDate[i][2] = "總數量 " + count;
							tableDate[i][3] = "總金額 " + allPrice;
						}
					}
					table1 = new JTable(tableDate, column);
					scrollPane.setViewportView(table1);
				}
				vgaBox.setSelectedIndex(0);
			}
		});

		powerAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (powerBox.getSelectedIndex() != 0) {
					Items it = new Items();
					int selectIndex = powerBox.getSelectedIndex() - 1;
					int getRowDateIndex = powerArr.get(selectIndex);
					it = allItems.get(getRowDateIndex);
					it.setStock(powerStockBox.getSelectedIndex() + 1);
					dataList.add(it);

					String tableDate[][] = new String[dataList.size() + 1][4];
					int allPrice = 0;
					int count = 0;
					for (int i = 0; i <= dataList.size(); i++) {

						for (int j = 0; j < 4; j++) {
							if (i < dataList.size()) {
								if (j == 0) {
									tableDate[i][j] = "" + (i + 1);
									System.out.println(tableDate[i][j]);
								}
								if (j == 1) {
									tableDate[i][j] = dataList.get(i).getBrand() + " " + dataList.get(i).getItemType()
											+ " " + dataList.get(i).getGrade() + " " + dataList.get(i).getItemName();
								}
								if (j == 2) {
									tableDate[i][j] = "" + dataList.get(i).getStock();
									count = count + dataList.get(i).getStock();
								}
								if (j == 3) {
									allPrice = allPrice + dataList.get(i).getStock() * dataList.get(i).getPrice();
									tableDate[i][j] = "" + (dataList.get(i).getStock() * dataList.get(i).getPrice());
								}
							}
						}
						if (i == dataList.size()) {
							tableDate[i][0] = "";
							tableDate[i][1] = "";
							tableDate[i][2] = "總數量 " + count;
							tableDate[i][3] = "總金額 " + allPrice;
						}
					}
					table1 = new JTable(tableDate, column);
//					table1.setFont(new Font("標楷體", Font.PLAIN, 12));					
					scrollPane.setViewportView(table1);
				}
				powerBox.setSelectedIndex(0);
			}
		});
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataList.clear();
				String tableDate[][] = new String[dataList.size() + 1][4];
				table1 = new JTable(tableDate, column);
				scrollPane.setViewportView(table1);
			}
		});
		orderSubmitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dataList.size()!=0) {
					checkOrder frame = new checkOrder();
					frame.setVisible(true);
					frame.setResizable(false);
					String tableDate[][] = new String[dataList.size() + 1][4];
					table1 = new JTable(tableDate, column);
					scrollPane.setViewportView(table1);
					dispose();
				}				
			}
		});
	}
}
