package Send_data_Reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Signin {

	private JFrame frame;
	private JTextField tb1;
	private JTextField t1;
	private JPasswordField p1;
	private JPasswordField p2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
	              "Arial", Font.BOLD, 20)));
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
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 948, 664);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setBounds(34, 217, 150, 35);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setBounds(34, 317, 143, 35);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		tb1 = new JTextField();
		tb1.setBounds(209, 210, 196, 42);
		tb1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username :");
		lblNewLabel_1_1.setBounds(507, 217, 150, 35);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setBounds(507, 317, 143, 35);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		t1 = new JTextField();
		t1.setBounds(706, 218, 196, 42);
		t1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sign in");
		lblNewLabel_1_2.setBounds(150, 124, 120, 47);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel lblNewLabel_1_3 = new JLabel("Sign Up");
		lblNewLabel_1_3.setBounds(681, 124, 138, 47);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=tb1.getText();
				String password=p1.getText();
				if(username.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(btnSignIn, "Please Enter deatils!!");
				}
				else {
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3309/cse","root","root");
						PreparedStatement stn=con.prepareStatement("select Username,Password from users where Username=? and Password=?" );
						stn.setString(1,username);
						stn.setString(2, password);
						ResultSet rs=stn.executeQuery();
						if(rs.next()) {
							JOptionPane.showMessageDialog(btnSignIn, "Valid Details\nLogin Done!!!");
						}
						else {
							JOptionPane.showMessageDialog(btnSignIn, "Invalid Username(or)Password");
						}
					} 		
					catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnSignIn.setBackground(new Color(224, 255, 255));
		btnSignIn.setBounds(137, 404, 145, 42);
		btnSignIn.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u=t1.getText();
				String p=p2.getText();
				if(u.isEmpty() || p.isEmpty()) {
					JOptionPane.showMessageDialog(btnSignIn, "Please Enter deatils!!");
				}
				else {
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3309/cse","root","root");
						String q="insert into users values('"+u+"','"+p+"')";
						Statement sta=con.createStatement();
						sta.executeUpdate(q);
						JOptionPane.showMessageDialog(btnSignIn, "Sign up Done!!");
						con.close();
						}
					catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						}
				}
			}
		});
		btnSignUp.setBackground(new Color(224, 255, 255));
		btnSignUp.setBounds(629, 404, 145, 42);
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel_1_2);
		frame.getContentPane().add(lblNewLabel_1_3);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(tb1);
		frame.getContentPane().add(lblNewLabel_1_1);
		frame.getContentPane().add(t1);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(lblNewLabel_2_1);
		frame.getContentPane().add(btnSignIn);
		frame.getContentPane().add(btnSignUp);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(218, 165, 32));
		separator.setForeground(new Color(255, 255, 255));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(447, 101, 44, 421);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("WELCOME");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_1_2_1.setBounds(336, 10, 218, 47);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		p1 = new JPasswordField();
		p1.setBounds(209, 312, 196, 42);
		frame.getContentPane().add(p1);
		
		p2 = new JPasswordField();
		p2.setBounds(706, 320, 196, 42);
		frame.getContentPane().add(p2);
	}
}
