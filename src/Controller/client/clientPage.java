package Controller.client;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Module.Member;

public class clientPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clientPage frame = new clientPage();
					frame.setVisible(true);
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(49, 29, 332, 190);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel me = new JLabel("");
		me.setFont(new Font("標楷體", Font.PLAIN, 26));
		me.setBounds(75, 55, 166, 74);
		panel.add(me);
//		Member m = new ImplMember().queryUsername(Index.usernameField.getText());
		try {
			Member m = Index.getMb();
			me.setText(m.getName());
		} catch (Exception e) {
			me.setText("m = null");
		}

	}

}
