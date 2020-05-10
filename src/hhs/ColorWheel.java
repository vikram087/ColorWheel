/** 
Author: Vikram Penumarti
Date: 4/30/2020
Rev: 01
Notes:
*/

/**
 * Author: Richard Zhang
 * Date: 4/30/2020
 * Rev:03
 * Notes: The class for drawing a color wheel. Created the basic color wheel using if statements.
 */

package hhs;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// implements ActionListener, MouseListener
// extends JPanel
public class ColorWheel extends JPanel implements ActionListener, MouseListener {
	boolean click;
	int x, y, angle;
	// Not sure if angle is needed.

	public ColorWheel() {
		addMouseListener(this);
		click = false;
		x = 0;
		y = 0;
		angle = 0;
	}

	public void paintComponent(Graphics g) {
		int centerX = this.getWidth() / 2;
		int centerY = this.getHeight() / 2;
		
//		System.out.println(centerX + ", " + centerY);
		DrawCircle circle = new DrawCircle();

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g.create();
		
		circle.draw(centerX, centerY, g2);
	}

	// This might be unnecessary, depends on if we want a button or not.
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseClicked(MouseEvent mouse) {
		x = mouse.getX();
		y = mouse.getY();
		click = true;
		repaint();
		System.out.println(x + ", " + y);
	}

	// Unnecessary Methods
	public void mouseEntered(MouseEvent mouse) {
	}

	public void mouseExited(MouseEvent mouse) {
	}

	public void mousePressed(MouseEvent mouse) {
	}

	public void mouseReleased(MouseEvent mouse) {
	}

// test
	public static void main(String[] args) {
		JFrame frame = new JFrame("ColorWheel");
		frame.setResizable(true);
		frame.setBounds(600, 300, 740, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.add(new ColorWheel());
		frame.setVisible(true);
	}

}