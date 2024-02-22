package csed_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Signin {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;
	private JPasswordField p2;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signin window = new Signin();
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
	public Signin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 561, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(50, 69, 77, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(50, 128, 108, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Signin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String password=p1.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cse","root","mrec");
					PreparedStatement stn=con.prepareStatement("select * from users where user=? and password=?");
					stn.setString(1, user);
					stn.setString(2, password);
					ResultSet rs=stn.executeQuery();
					if(rs.next()) {
						JOptionPane.showMessageDialog(btnNewButton, "valid user");	
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "invalid user");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 228, 225));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(111, 184, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("User");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(318, 71, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(318, 129, 94, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Signup");
		btnNewButton_1.setBackground(new Color(255, 228, 225));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(363, 184, 108, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		tb1 = new JTextField();
		tb1.setBounds(158, 70, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(158, 126, 86, 17);
		frame.getContentPane().add(p1);
		
		p2 = new JPasswordField();
		p2.setBounds(426, 126, 89, 17);
		frame.getContentPane().add(p2);
		
		tb2 = new JTextField();
		tb2.setBounds(426, 70, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
	}
}
