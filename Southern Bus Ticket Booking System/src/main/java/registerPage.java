import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class registerPage implements ActionListener{ 

        JFrame register = new JFrame("REGISTER");
 

        JLabel title = new JLabel("<<REGISTER>>");
        JLabel userName = new JLabel("User Name");
        JLabel password = new JLabel("Password"); 
        JLabel email = new JLabel("Email Address");
        JLabel confirmPassword = new JLabel("Confirm Password");
        JTextField userNameText = new JTextField(); 
        JPasswordField passwordText = new JPasswordField();
        JTextField emailText = new JTextField();
        JPasswordField ConfirmPasswordText = new JPasswordField();
        JButton RButton = new JButton("REGISTER");
        JCheckBox cb = new JCheckBox("I accept the Tearms of Use & Privacy Policy");
        ImageIcon logo = new ImageIcon(".//image//suc.png");
        
     
      //button.addActionListener(new beginPage());     
        
		
		registerPage(){
                    
                register.setResizable(false);
                register.setIconImage(logo.getImage());
                title.setBounds(215,60,140,50);
        	userName.setBounds(145,110,80,50);
        	password.setBounds(345,110,80,50);
        	email.setBounds(130,200,120,50);
        	confirmPassword.setBounds(315,200,130,50);
        	RButton.setBounds(185,350,200,30);
        	cb.setBounds(100,300,350,25);
        	userNameText.setBounds(100,160,165,25);
        	passwordText.setBounds(300,160,165,25);
        	emailText.setBounds(100,250,165,25);
        	ConfirmPasswordText.setBounds(300,250,165,25);
        
        	title.setFont(new Font("Serif", Font.PLAIN, 20));            
        	userName.setFont(new Font("Serif", Font.PLAIN, 17));
        	password.setFont(new Font("Serif", Font.PLAIN, 17));
        	email.setFont(new Font("Serif", Font.PLAIN, 17));
        	confirmPassword.setFont(new Font("Serif", Font.PLAIN, 17));
        	
        	RButton.addActionListener(this);
        	cb.addActionListener(this);

        	register.add(title);
        	register.add(userName);
        	register.add(password);
        	register.add(email);
        	register.add(confirmPassword);
        	register.add(userNameText);
        	register.add(passwordText);
        	register.add(emailText);
        	register.add(ConfirmPasswordText);
        	register.add(cb);
        	register.add(RButton);
        	
        	register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			register.setSize(600,600);
			register.setLayout(null);
			register.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==RButton){
				String name  = userNameText.getText();
				String mail = emailText.getText();
				String pw = String.valueOf(passwordText.getPassword());
				String cpw = String.valueOf(ConfirmPasswordText.getPassword());
				
				
				if((name.isEmpty())||(mail.isEmpty())||(pw.isEmpty())||(cpw.isEmpty())){
					JOptionPane.showMessageDialog(null,"Please fill in all information.","Warning",JOptionPane.INFORMATION_MESSAGE);
				} 
				else if(!cb.isSelected()){
					JOptionPane.showMessageDialog(null,"Please clicking checkbox.","Warning",JOptionPane.INFORMATION_MESSAGE);
				}

				else{ 
					IDandPasswords idandPasswords = new IDandPasswords();
					register.dispose();
					LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
				}
			}
		}
    
}