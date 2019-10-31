package View;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class AEAJFrame extends JFrame
{
	public AEAJFrame ()
	{
            
		AccessExistingAccount aea = new AccessExistingAccount();
                add(aea);
                
                setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (400, 400);
                
      
	}
         



}