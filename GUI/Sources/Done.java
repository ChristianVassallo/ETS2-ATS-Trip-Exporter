package tripexporter;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Christian V. (aka MrChrHD/StoKatze/Bunny/King Bunny I)
 * @version  2.0 05/11/2018
 * @since Java 8
 *
 */
public class Done extends JFrame implements ActionListener
{
	/**
	 * Main panel.
	 */
	private JPanel mainP = new JPanel();
	
	/**
	 * OK button. Will close the window if clicked.
	 */
	private JButton OK = new JButton("OK");
	
	/**
	 * Message.
	 */
	private JLabel message = new JLabel("Done. CSV should have been generated. If not, please check log.txt.");
	
	/**
	 * Window generation
	 */
	public Done()
	{
		super("Success");
		
		message.setForeground(Color.green);
		mainP.add(message, BorderLayout.NORTH);
		mainP.add(OK);
		OK.addActionListener(this);
		mainP.setLayout(new GridLayout(2,1));
		this.getContentPane().add(mainP);
		this.setSize(500, 100);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Checks for ok button clicked.
	 */
	public void actionPerformed(ActionEvent E)
	{
		String clicked = E.getActionCommand();
		if(clicked.equals("OK"))
		{					
			Done.super.dispose(); //Closes the window
		}
	}
}
