/** 
Author: Vikram Penumarti
Date: 4/30/2020
Rev: 01
Notes:
*/

/**
 * Author: Richard Zhang
 * Date: 4/30/2020
 * Rev:01
 * Notes: The class for drawing a color wheel. Created the basic color wheel using if statements.
 */

package hhs;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// Copied from VendingMachine.java in lab_Snackbar
public class ColorWheel extends JPanel implements ActionListener {
	
	
	/**
	 * REV 2, 5/2/2020
	 * KNOWN BUGS: GRADIENT ACHIEVED FOR EACH INDIVIDUAL COLOR
	 * BUT DOES NOT HAVE SMOOTH TRANSITIONS
	 */
	
	public void paintComponent(Graphics g) 
	{		
		int centerX = this.getWidth() / 2;
		int centerY = this.getHeight() / 2;

		DrawCircle circle = new DrawCircle();
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g.create();
		circle.draw(centerX, centerY, g2);
	}		
		

	
	// This might be unnecessary, depends on if we want a button or not.
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub

	}

// test
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("ColorWheel");
		frame.setBounds(600, 300, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.add(new ColorWheel());
		frame.setVisible(true);
	}
}