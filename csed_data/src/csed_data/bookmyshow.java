package csed_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroticketbooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticketbooking window = new metroticketbooking();
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
	public metroticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 450, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MetroTicketBooking");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
		lblNewLabel.setBounds(101, 21, 233, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 21));
		lblNewLabel_1.setBounds(36, 93, 64, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 21));
		lblNewLabel_2.setBounds(36, 136, 64, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 21));
		lblNewLabel_3.setBounds(36, 179, 49, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 21));
		lblNewLabel_4.setBounds(36, 212, 64, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(130, 103, 163, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "MIYAPUR", "RAIDURG", "PARADISE"}));
		cb1.setBounds(130, 131, 163, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MIAPUR", "KPHB", "RAIDURG", "PARADISE"}));
		cb2.setBounds(130, 179, 163, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cb3.setBounds(130, 216, 163, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String fs=(String) cb1.getSelectedItem();
				String ts=(String) cb2.getSelectedItem();
				String nt=(String) cb3.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(fs.equals(ts))
				{
					JOptionPane.showMessageDialog(btnNewButton, "select valid station name");
				}
				else
				{
					bill=t*40;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n From :"+fs+
							"\n To :"+ts+
							"\n Tickets :"+nt+
							"\n Your bill:" +bill);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 23));
		btnNewButton.setBounds(101, 259, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
