package View;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ALJFrame extends JFrame
{
	public ALJFrame ()
	{
		
                AccountList al = new AccountList();
                add(al);
        
                                      
                setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (400, 600);
      
	}
         
//                NewAccount na = new NewAccount();
//                add(na);
//         AccessExistingAccount aea = new AccessExistingAccount();
//                add(aea);

}