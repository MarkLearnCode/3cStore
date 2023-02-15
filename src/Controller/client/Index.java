package Controller.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Dao.OtherFunction.LoginMethod;
import Dao.member.ImplMember;
import Module.Member;

public class Index extends JFrame {

	private JPanel contentPane;
	private static JTextField usernameField;
	private static JPasswordField pwdField;

	public static Member getMb() {
		String username = usernameField.getText();
		String pwd = Index.pwdField.getText();
		if (LoginMethod.login(username, pwd)) {
			Member m = new ImplMember().queryUsername(username);
			return m;
		}
		return null;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 134, 156));
		panel.setBounds(0, 0, 1186, 763);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("電 腦 零 組 件 賣 場");
		lblNewLabel.setFont(new Font("標楷體", Font.BOLD, 62));
		lblNewLabel.setBounds(251, 61, 659, 62);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("帳號 :");
		lblNewLabel_1.setFont(new Font("標楷體", Font.BOLD, 48));
		lblNewLabel_1.setBounds(171, 255, 198, 113);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("歡迎登入");
		lblNewLabel_2.setFont(new Font("標楷體", Font.BOLD, 62));
		lblNewLabel_2.setBounds(440, 168, 279, 62);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_1_1 = new JLabel("密碼 :");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.BOLD, 48));
		lblNewLabel_1_1.setBounds(171, 385, 198, 113);
		panel.add(lblNewLabel_1_1);

		usernameField = new JTextField();
		usernameField.setFont(new Font("標楷體", Font.PLAIN, 42));
		usernameField.setBounds(349, 286, 504, 52);
		panel.add(usernameField);
		usernameField.setColumns(10);

		pwdField = new JPasswordField();
		pwdField.setFont(new Font("標楷體", Font.PLAIN, 42));
		pwdField.setBounds(349, 415, 504, 52);
		panel.add(pwdField);

		JButton loginBtn = new JButton("登入");

		loginBtn.setFont(new Font("標楷體", Font.BOLD, 48));
		loginBtn.setBounds(499, 521, 161, 62);
		panel.add(loginBtn);

		JButton signBtn = new JButton("註冊");

		signBtn.setFont(new Font("標楷體", Font.BOLD, 48));
		signBtn.setBounds(340, 648, 161, 62);
		panel.add(signBtn);

		JButton forgetPwdBtn = new JButton("忘記密碼");

		forgetPwdBtn.setFont(new Font("標楷體", Font.BOLD, 48));
		forgetPwdBtn.setBounds(679, 648, 253, 62);
		panel.add(forgetPwdBtn);

		JLabel lblNewLabel_2_1 = new JLabel("還不是會員嗎");
		lblNewLabel_2_1.setFont(new Font("標楷體", Font.BOLD, 48));
		lblNewLabel_2_1.setBounds(17, 648, 313, 62);
		panel.add(lblNewLabel_2_1);

		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String pwd = pwdField.getText();
				try {
					if (LoginMethod.login(username, pwd)) {
						Member m = new ImplMember().queryUsername(username);
						clientPage frame = new clientPage();
						frame.setVisible(true);
						frame.setResizable(false);
						dispose();
					}
				} catch (java.lang.NullPointerException e2) {
					System.out.println("error");
					JFrame jFrame = new JFrame();
			        JOptionPane.showMessageDialog(jFrame, "帳號或密碼錯誤");
				}

			}
		});

		signBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sign frame = new Sign();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});

		forgetPwdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}
}
