package csed_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField ps1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 16));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(206, 50, 121, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(65, 165, 121, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password\r\n");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(65, 217, 115, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(196, 165, 143, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		ps1 = new JPasswordField();
		ps1.setBounds(196, 224, 143, 20);
		frame.getContentPane().add(ps1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(btnNewButton, "Login Done");
				String un=tb1.getText();
				String ps=ps1.getText();
				if(un.equals("abhiram") && ps.equals("abhi123"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Login Done");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 22));
		btnNewButton.setBounds(196, 302, 143, 40);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 485, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
