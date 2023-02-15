package Controller.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



import Dao.member.ImplMember;
import Module.Member;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sign extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField pwdField;
	private JTextField pwdCheckField;
	private JTextField nameField;
	private JTextField phoneField;
	private JTextField addressField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign frame = new Sign();
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
	public Sign() {
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

		JLabel lblNewLabel = new JLabel("\u4F7F\u7528\u8005\u540D\u7A31 :");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel.setBounds(234, 175, 245, 45);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u78BC :");
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1.setBounds(341, 245, 162, 45);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("\u78BA\u8A8D\u5BC6\u78BC :");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_1.setBounds(270, 315, 218, 45);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("\u59D3\u540D :");
		lblNewLabel_1_2.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_2.setBounds(341, 455, 162, 45);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("\u96FB\u8A71 :");
		lblNewLabel_1_2_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_2_1.setBounds(341, 525, 162, 45);
		panel.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("\u5730\u5740 :");
		lblNewLabel_1_2_1_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_2_1_1.setBounds(341, 595, 162, 45);
		panel.add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_2 = new JLabel("\u6B61\u8FCE\u52A0\u5165\u6703\u54E1");
		lblNewLabel_2.setFont(new Font("標楷體", Font.BOLD, 64));
		lblNewLabel_2.setBounds(422, 59, 433, 106);
		panel.add(lblNewLabel_2);

		usernameField = new JTextField();
		usernameField.setFont(new Font("新細明體", Font.PLAIN, 28));
		usernameField.setBounds(470, 175, 300, 45);
		panel.add(usernameField);
		usernameField.setColumns(10);

		pwdField = new JTextField();
		pwdField.setFont(new Font("新細明體", Font.PLAIN, 28));
		pwdField.setColumns(10);
		pwdField.setBounds(470, 245, 300, 45);
		panel.add(pwdField);

		pwdCheckField = new JTextField();
		pwdCheckField.setFont(new Font("新細明體", Font.PLAIN, 28));
		pwdCheckField.setColumns(10);
		pwdCheckField.setBounds(470, 315, 300, 45);
		panel.add(pwdCheckField);

		nameField = new JTextField();
		nameField.setFont(new Font("新細明體", Font.PLAIN, 28));
		nameField.setColumns(10);
		nameField.setBounds(470, 455, 300, 45);
		panel.add(nameField);

		phoneField = new JTextField();
		phoneField.setFont(new Font("新細明體", Font.PLAIN, 28));
		phoneField.setColumns(10);
		phoneField.setBounds(470, 525, 300, 45);
		panel.add(phoneField);

		addressField = new JTextField();
		addressField.setFont(new Font("新細明體", Font.PLAIN, 28));
		addressField.setColumns(10);
		addressField.setBounds(470, 595, 300, 45);
		panel.add(addressField);

		JButton submitBtn = new JButton("Submit");
		
		submitBtn.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		submitBtn.setBounds(528, 669, 206, 53);
		panel.add(submitBtn);

		JLabel toIndexTag = new JLabel("\u8FD4\u56DE\u767B\u5165\u756B\u9762");
		

		toIndexTag.setFont(new Font("標楷體", Font.PLAIN, 32));
		toIndexTag.setBounds(36, 23, 218, 45);
		panel.add(toIndexTag);

		JLabel lblNewLabel_1_1_1 = new JLabel("E-mail :");
		lblNewLabel_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_1_1.setBounds(305, 385, 186, 45);
		panel.add(lblNewLabel_1_1_1);

		emailField = new JTextField();
		emailField.setFont(new Font("新細明體", Font.PLAIN, 28));
		emailField.setColumns(10);
		emailField.setBounds(470, 385, 300, 45);
		panel.add(emailField);
		
		JLabel checkUsernameLabel = new JLabel("使用者名稱已存在或小於4字元");
		checkUsernameLabel.setForeground(new Color(255, 0, 0));
		checkUsernameLabel.setFont(new Font("標楷體", Font.PLAIN, 28));
		checkUsernameLabel.setBounds(780, 175, 404, 45);
		checkUsernameLabel.setVisible(false);
		panel.add(checkUsernameLabel);
		
		JLabel checkPwdLabel = new JLabel("請確定密碼是否正確或小於4字元");
		checkPwdLabel.setForeground(new Color(255, 0, 0));
		checkPwdLabel.setFont(new Font("標楷體", Font.PLAIN, 28));
		checkPwdLabel.setBounds(768, 246, 416, 45);
		checkPwdLabel.setVisible(false);
		panel.add(checkPwdLabel);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("不得小於4個字元");
		lblNewLabel_1_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_1_1_1.setBounds(790, 385, 306, 45);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("不得小於2個字元");
		lblNewLabel_1_1_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_1_1_1_1.setBounds(790, 455, 306, 45);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("不得小於6個字元");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_1_1_1_1_1.setBounds(790, 525, 306, 45);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("不得小於6個字元");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 36));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(790, 595, 306, 45);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		toIndexTag.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				toIndexTag.setForeground(new Color(159, 53, 255));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				toIndexTag.setForeground(new Color(0, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				 Index frame = new Index();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
			}
		});
		
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {								
				String username = usernameField.getText();
				String pwd1 = pwdField.getText();
				String pwd2 = pwdCheckField.getText();
				String password = "";
				String name = nameField.getText();
				String email = emailField.getText();
				String phone = phoneField.getText();
				String address = addressField.getText();	
				
				
				boolean checkUsername = false;
				boolean checkPwd = false;
				boolean checkName = false;
				boolean checkEmail = false;
				boolean checkPhone = false;
				boolean checkAddress = false;
				
				//check username
				if(username.length()>=4 && new ImplMember().ckeckUsername(username)==false) {
//					System.out.println("username");
//					System.out.println(new ImplMember().ckeckUsername(username));
					checkUsername = true;
					checkUsernameLabel.setVisible(false);
				}else {
					checkUsernameLabel.setVisible(true);
				}
//				System.out.println(checkUsername);
				
				//check pwd
				if(pwd1.length()>=4 &&pwd1.equals(pwd2)) {
					checkPwd = true;
					checkPwdLabel.setVisible(false);
					password = pwd1;
				}else {
					checkPwdLabel.setVisible(true);
				}
				
				//check name
				if(name.length()>=2) {
					checkName = true;
				}
				//check email
				if(email.length()>=4) {
					checkEmail = true;
				}
				//check phone
				if(phone.length()>=6) {
					checkPhone = true;
				}
				//check address
				if(address.length()>=6) {
					checkAddress = true;
				}
				
				//submit
				if(checkUsername&&checkPwd&&checkName&&checkEmail&&checkPhone&&checkAddress) {
//					System.err.println("success");
					Member m = new Member(username, password, email, name, phone, address);
					new ImplMember().add(m);
					
					JFrame jFrame = new JFrame();
			        JOptionPane.showMessageDialog(jFrame, "註冊成功 返回登入畫面");
			        Index frame = new Index();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
				}else {
					JFrame jFrame = new JFrame();
			        JOptionPane.showMessageDialog(jFrame, "註冊失敗 請確認詳細資料長度");
				}
			}
		});
	}
}
