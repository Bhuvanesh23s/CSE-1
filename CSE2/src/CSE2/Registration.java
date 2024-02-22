package CSE2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.setBounds(100, 100, 857, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration ");
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 40));
		lblNewLabel.setBounds(301, 10, 309, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(48, 104, 162, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Branch");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(48, 176, 162, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		tb1.setBounds(283, 106, 229, 41);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "ECE", "EEE", "IT", "MECH", "CIVIL", "CSE-AIML", "CSE-DS", "CSE-CS"}));
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cb1.setBounds(283, 176, 229, 41);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(48, 249, 162, 41);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBackground(new Color(102, 205, 170));
		r1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		r1.setBounds(283, 251, 87, 41);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBackground(new Color(102, 205, 170));
		r2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		r2.setBounds(415, 251, 99, 41);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fav Programming Language :");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(52, 310, 416, 41);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(new Color(102, 205, 170));
		c1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c1.setBounds(48, 368, 58, 33);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Python");
		c2.setBackground(new Color(102, 205, 170));
		c2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c2.setBounds(173, 368, 132, 33);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("Java");
		c3.setBackground(new Color(102, 205, 170));
		c3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c3.setBounds(353, 368, 146, 33);
		frame.getContentPane().add(c3);
		
		JCheckBox c4 = new JCheckBox("AWS");
		c4.setBackground(new Color(102, 205, 170));
		c4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c4.setBounds(563, 368, 146, 33);
		frame.getContentPane().add(c4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String b=(String) cb1.getSelectedItem();
				String g;
				if(r1.isSelected())
				{
					g="Male";
				}
				else if(r2.isSelected())
				{
					g="Female";
				}
				else
				{
					g="Invalid";
				}
				String pl="";
				if(c1.isSelected()) {
					pl=pl+"C ";
				}
				if(c2.isSelected()) {
					pl=pl+"Python ";
				}
				if(c3.isSelected()) {
					pl=pl+"Java ";
				}
				if(c4.isSelected()) {
					pl=pl+"C++ ";
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Hello "+n+"\nPlease confirm your Details:\nBranch:"+b+"\nGender:"+g+"\nFav Programming language:"+pl);
				if(res==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "Registration Done !");
					frame.setVisible(false);
				}
				else if(res==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "Registration Notdone !");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Registration Cancelled !");
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(263, 441, 153, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
