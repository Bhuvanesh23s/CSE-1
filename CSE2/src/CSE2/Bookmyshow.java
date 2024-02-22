package CSE2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bookmyshow {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bookmyshow window = new Bookmyshow();
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
	public Bookmyshow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 870, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("BookMyShow");
		lb1.setFont(new Font("Castellar", Font.BOLD, 50));
		lb1.setForeground(new Color(255, 255, 255));
		lb1.setBackground(Color.ORANGE);
		lb1.setBounds(242, 35, 468, 61);
		frame.getContentPane().add(lb1);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(63, 159, 122, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Movie :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(63, 240, 122, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tickets :");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(63, 312, 122, 39);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		tb1.setBounds(309, 159, 263, 39);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "DEVARA", "KALKI(AD 2830)", "PUSHPA-2"}));
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb1.setBounds(309, 240, 263, 39);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(309, 318, 143, 39);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.setBackground(new Color(0, 0, 205));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String m=(String) cb1.getSelectedItem();
				String nt=(String) cb2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(m.equals("DEVARA"))
				{
					bill=500*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nSelected Movie:"+m+"\nNo of Tickets:"+t+"\nYour Bill:"+bill);
				}
				else if(m.equals("KALKI(AD 2830)"))
				{
					bill=350*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nSelected Movie:"+m+"\nNo of Tickets:"+t+"\nYour Bill:"+bill);
				}
				else if(m.equals("PUSHPA-2"))
				{
					bill=300*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\nSelected Movie:"+m+"\nNo of Tickets:"+t+"\nYour Bill:"+bill);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please Select a Movie");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(144, 415, 150, 47);
		frame.getContentPane().add(btnNewButton);
	}
}
