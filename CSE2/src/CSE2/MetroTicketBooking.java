package CSE2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetroTicketBooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicketBooking window = new MetroTicketBooking();
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
	public MetroTicketBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 913, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMetroTicketsBoking = new JLabel("Metro Tickets Booking");
		lblMetroTicketsBoking.setForeground(Color.WHITE);
		lblMetroTicketsBoking.setFont(new Font("Centaur", Font.BOLD, 50));
		lblMetroTicketsBoking.setBackground(new Color(0, 0, 0));
		lblMetroTicketsBoking.setBounds(196, 31, 488, 61);
		frame.getContentPane().add(lblMetroTicketsBoking);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(45, 144, 122, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(45, 224, 122, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("To :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(45, 304, 122, 39);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tickets :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1_3.setBackground(Color.WHITE);
		lblNewLabel_1_3.setBounds(47, 372, 156, 39);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		tb1.setColumns(10);
		tb1.setBounds(284, 144, 263, 39);
		frame.getContentPane().add(tb1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kukatpally", "LB Nagar", "Miyapur","Lingampally","Ameerpet"}));
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb1.setBounds(284, 224, 263, 39);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kukatpally", "LB Nagar", "Miyapur","Lingampally","Ameerpet"}));
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb2.setBounds(284, 310, 263, 39);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb3.setBounds(284, 378, 263, 39);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("BOOK");
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
					JOptionPane.showMessageDialog(btnNewButton, "Check Stations");
				}
				else if(fs.equals("Kukatpally")) {
					if(ts.equals("LB Nagar")){
						bill=t*80;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Miyapur")) {
						bill=t*30;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Ameerpet")) {
						bill=t*50;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Lingampally")) {
						bill=t*60;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}				
				}
				else if(fs.equals("LB Nagar")) {
					if(ts.equals("Kukatpally")){
						bill=t*80;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Miyapur")) {
						bill=t*120;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Ameerpet")) {
						bill=t*60;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Lingampally")) {
						bill=t*70;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}				
				}
				else if(fs.equals("Miyapur")) {
					if(ts.equals("LB Nagar")){
						bill=t*120;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Kukatpally")) {
						bill=t*30;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Ameerpet")) {
						bill=t*55;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Lingampally")) {
						bill=t*90;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}				
				}
				else if(fs.equals("Ameerpet")) {
					if(ts.equals("LB Nagar")){
						bill=t*60;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Miyapur")) {
						bill=t*55;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Kukatpally")) {
						bill=t*50;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Lingampally")) {
						bill=t*75;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}				
				}
				else if(fs.equals("Lingampally")) {
					if(ts.equals("LB Nagar")){
						bill=t*70;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Miyapur")) {
						bill=t*90;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Ameerpet")) {
						bill=t*75;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}
					else if(ts.equals("Kukatpally")) {
						bill=t*60;
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nNo of Tickets"+t+"\nyour Bill:"+bill);
					}				
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(0, 0, 205));
		btnNewButton.setBounds(187, 444, 150, 47);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Amma\\Desktop\\download1.png"));
		lblNewLabel.setBounds(105, 10, 80, 106);
		frame.getContentPane().add(lblNewLabel);
	}
}
