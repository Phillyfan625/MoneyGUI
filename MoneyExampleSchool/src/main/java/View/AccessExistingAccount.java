package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author $(user)
	@version 1.01 FILL IN THE DATE
*/

public class AccessExistingAccount extends JPanel
{
	// Instance Variables -- define your private data


	// Constructors
	public AccessExistingAccount()
	{
        
        setBackground(Color.white);
         JLabel l1 = new JLabel("Existing Account");
        add(l1);
        
        JTextField field1 = new JTextField();
        add(field1);
        JButton b1 = new JButton("Select Account");
        add(b1);
        
        JTextField field2 = new JTextField();
        add(field2);
         JButton b2 = new JButton("Deposit");
        add(b2);
        
        JTextField field3 = new JTextField();
        add(field3);
         JButton b3 = new JButton("Withdraw");
        add(b3);
        
         JLabel l2 = new JLabel("Balance");
        add(l2);
        JTextField field4 = new JTextField();
        add(field4);
        
        
        
        
        	}
	
}