package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class NewAccount extends JPanel
{
    public NewAccount()
    {        
        setBackground(Color.cyan);
         JLabel l1 = new JLabel("Select Account Type");
        add(l1);
        
        String[] accountType = { "Savings Account", "Checking Account" };
       
        JComboBox aT = new JComboBox(accountType);
        add(aT);
                
        JLabel l2 = new JLabel("Intial Deposit");
        add(l2);
       
        JTextField field1 = new JTextField();
        add(field1);
        
        JButton b2 = new JButton("Create");
        add(b2);               
}
	


}