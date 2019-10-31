package View;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class NAJFrame extends JFrame
{
	public NAJFrame ()
	{
		
                NewAccount na = new NewAccount();
                add(na);
        
                                      
                setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (400, 400);
      
	}
         

}