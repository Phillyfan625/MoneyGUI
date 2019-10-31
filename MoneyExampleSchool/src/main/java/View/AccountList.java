package View;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author $(user)
	@version 1.01 FILL IN THE DATE
*/

public class AccountList extends JPanel
{
	// Instance Variables -- define your private data


	// Constructors
	public AccountList()
	{
	setLayout(new FlowLayout());	 
        setBackground(Color.white);
         JLabel l1 = new JLabel("Account List");
        add(l1);
            JTextArea textArea = new JTextArea(100, 20);
        
        textArea.setEditable(true);
        
       
                
                
	}
	

}