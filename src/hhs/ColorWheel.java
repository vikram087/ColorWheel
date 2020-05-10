/** 
Author: Vikram Penumarti
Date: 4/30/2020
Rev: 01
Notes:
*/

/**
 * Author: Richard Zhang
 * Date: 4/30/2020
 * Rev:05
 * Notes: The class for drawing a color wheel. Created the basic color wheel using if statements.
 */

package hhs;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// implements ActionListener, MouseListener
// extends JPanel
public class ColorWheel extends JPanel implements MouseListener {
	private boolean click;
	private int x, y; 
	private int angle;
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

	// Dumb question but how can I make this angle have a assigned value outside the method.
	public void mouseClicked(MouseEvent mouse) {
		x = mouse.getX();
		y = mouse.getY();
		click = true;
		repaint();
		int angleX = x - this.getWidth() / 2;

		// Why is this height - click idk but yeah
		int angleY = this.getHeight() / 2 - y;

		
		// Quad 1
		if (angleX > 0 && angleY > 0) {
			angle = (int) (180*Math.atan((double) angleY / angleX)/Math.PI);
			System.out.println("angle: " + angle);
		}
		
		// Quad 2
		if (angleX < 0 && angleY > 0) {
			angle = (int) (180 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			System.out.println("angle: " + angle);
		}
		
		// Quad 3
		if (angleX < 0 && angleY < 0) {
			angle = (int) (180 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			System.out.println("angle: " + angle);
		}
		
		// Quad 4
		if (angleX > 0 && angleY < 0) {
			angle = (int) (360 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			System.out.println("angle: " + angle);
		}
		System.out.println("x: " + angleX);
		System.out.println("y: " + angleY);
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

	// Accessor method
	public int getAngle() {
		
	return angle;
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