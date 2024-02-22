package csed_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class registrationform {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationform window = new registrationform();
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
	public registrationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 28));
		lblNewLabel.setBounds(131, 11, 160, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 23));
		lblNewLabel_1.setBounds(10, 77, 68, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 122, 95, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(10, 166, 80, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ProgLang");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 21));
		lblNewLabel_4.setBounds(10, 211, 95, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(131, 83, 160, 22);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "ECE", "EEE", "IT", "CIVIL"}));
		cb1.setBounds(131, 127, 160, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBackground(new Color(135, 206, 235));
		r1.setBounds(131, 168, 60, 28);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBackground(new Color(135, 206, 250));
		r2.setBounds(210, 171, 60, 22);
		frame.getContentPane().add(r2);
		ButtonGroup bg= new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		
		JCheckBox c1 = new JCheckBox("java");
		c1.setBackground(new Color(135, 206, 250));
		c1.setBounds(131, 212, 60, 21);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Python");
		c2.setBackground(new Color(135, 206, 250));
		c2.setBounds(210, 211, 68, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String b= (String) cb1.getSelectedItem();
				String g;
				if(r1.isSelected())
				{
					g="male";
				}
				else if( r2.isSelected())
				{
					g="female";
				}
				else {
					g="invalid";
				}
				String pl="";
				if(c1.isSelected())
				{
					pl=pl+"java";
				}
				if(c2.isSelected())
				{
					pl=pl+"python";
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Hello"+n+
						"\n please confirm your details:"
						+ "\nBranch :"+b+ "\n Gender:"+g+"\n programming:" +pl);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Reg Done!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Reg Cancelled");
				}
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 26));
		btnNewButton.setBounds(95, 265, 125, 34);
		frame.getContentPane().add(btnNewButton);
	}
}
