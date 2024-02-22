package Send_data_Reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

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
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.setBounds(100, 100, 781, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration ");
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 40));
		lblNewLabel.setBounds(221, 20, 309, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(103, 240, 162, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID :");
		lblNewLabel_1_1.setBackground(new Color(0, 0, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(103, 159, 162, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Marks :");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(103, 327, 162, 41);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		tb1.setColumns(10);
		tb1.setBounds(297, 161, 229, 41);
		frame.getContentPane().add(tb1);
		
		tb2 = new JTextField();
		tb2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		tb2.setColumns(10);
		tb2.setBounds(297, 242, 229, 41);
		frame.getContentPane().add(tb2);
		
		tb3 = new JTextField();
		tb3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		tb3.setColumns(10);
		tb3.setBounds(297, 329, 229, 41);
		frame.getContentPane().add(tb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=tb1.getText();
				int id=Integer.parseInt(i);
				String n=tb2.getText();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3309/cse","root","root");
					String q="insert into student values('"+id+"','"+n+"','"+m+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Done!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(221, 428, 153, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
