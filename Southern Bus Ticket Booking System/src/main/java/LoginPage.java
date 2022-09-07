import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame("LOGIN");
	JLabel login = new JLabel("<<LOGIN>>");
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JButton registerButton = new JButton("Register");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("User Name:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	HashMap<String,String> logininfo = new HashMap<String,String>();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel title = new JLabel("Southern Bus");
	ImageIcon image = new ImageIcon(".//image//suc.png");
	ImageIcon logo = new ImageIcon(".//image//suc.png");
	JLabel sucLabel = new JLabel();
	
	
	
	LoginPage(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
                frame.setResizable(false); 
		frame.setIconImage(logo.getImage());
		panel.setBounds(0,0,420,420);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		panel2.setLayout(null);
		panel2.setBounds(420,0,420,420);
		
		login.setBounds(140,50,150,100);
		login.setFont(new Font("Serif", Font.PLAIN, 24));
		
		userIDLabel.setBounds(50,150,75,25);
		userPasswordLabel.setBounds(50,200,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,150,200,25);
		userPasswordField.setBounds(125,200,200,25);
		
		loginButton.setBounds(125,250,95,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(230,250,95,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		registerButton.setBounds(125,290,200,25);
		registerButton.setFocusable(false);
		registerButton.addActionListener(this);
		
		frame.add(panel);
		frame.add(panel2);
		
		title.setBounds(85,195,250,50);
		title.setFont(new Font("MV Boli", Font.PLAIN, 36));
		sucLabel.setIcon(image);
		sucLabel.setBounds(170,80,100,100);
		
		panel.add(title);
		panel.add(sucLabel);
		panel2.add(login);
		panel2.add(userIDLabel);
		panel2.add(userPasswordLabel);
		panel2.add(messageLabel);
		panel2.add(userIDField);
		panel2.add(userPasswordField);
		panel2.add(loginButton);
		panel2.add(resetButton);
		panel2.add(registerButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(840,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					frame.dispose();
					BookingPage bookingPage = new BookingPage();
                                        bookingPage.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Wrong Password.","Warning",JOptionPane.INFORMATION_MESSAGE);
				}

			}
				else {
					JOptionPane.showMessageDialog(null,"User Name Not Found.","Warning",JOptionPane.INFORMATION_MESSAGE);
				}
		}
		if(e.getSource()==registerButton){
			frame.dispose();
			registerPage RegisterPage = new registerPage();
		}
	}	
}