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
	private double angle;
	private int colorA;
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
		
		ComplementaryHarmony test = new ComplementaryHarmony();
		
		int angleInt = 0;
		
		x = mouse.getX();
		y = mouse.getY();
		click = true;
		repaint();
		int angleX = x - this.getWidth() / 2;

		// Why is this height - click idk but yeah
		int angleY = this.getHeight() / 2 - y;
		
		// Quad 1
		if (angleX > 0 && angleY > 0) 
		{
			angle = (180*Math.atan((double) angleY / angleX)/Math.PI);
			angleInt = (int)angle;
			System.out.println("angle: " + angle);
			
			colorA = (int)((double)angle/0.2353);
			
			if (angle >= 0 && angle <= 60)
			{
				test.findHarmonyRed(colorA, angleInt);//segment for red
			}
			
			else if (angle > 60 && angle < 90)//segment for yellow in Q1
			{
				test.findHarmonyYellow(colorA, angleInt);
			}
		}
		
		// Quad 2
		if (angleX < 0 && angleY > 0) {
			angle = (int) (180 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			angleInt = (int)angle;
			System.out.println("angle: " + angle);
			
			colorA = (int)((double)angle/0.2353);
			
			if (angle > 90 && angle <= 120)//segment for yellow in Q2
			{
				test.findHarmonyYellow(colorA, angleInt);
			}
			
			else if (angle > 120 && angle <= 180)//green
			{
				test.findHarmonyGreen(colorA, angleInt);
			}
		}
		
		// Quad 3
		if (angleX < 0 && angleY < 0) {
			angle = (int) (180 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			angleInt = (int)angle;
			System.out.println("angle: " + angle);
			
			colorA = (int)((double)angle/0.2353);
			
			if (angle > 180 && angle <= 240)//cyan
			{
				test.findHarmonyCyan(colorA, angleInt);
			}
			
			else if (angle > 240 && angle <= 270)//blue Q3
			{
				test.findHarmonyBlue(colorA, angleInt);
			}
		}
		
		// Quad 4
		if (angleX > 0 && angleY < 0) {
			angle = (int) (360 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			angleInt = (int)angle;
			System.out.println("angle: " + angle);
			
			colorA = (int)((double)angle/0.2353);
		
			if (angle > 270 && angle <= 300)//blue Q4
			{
				test.findHarmonyBlue(colorA, angleInt);
			}
			
			else if (angle > 300 && angle <= 360)//purple
			{
				test.findHarmonyPurple(colorA, angleInt);
			}
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
	public double getAngle() {
		
	return angle;
	}

	public int getColor() {
		return colorA;
	}
	
// test
	public static void main(String[] args) {
		JFrame frame = new JFrame("ColorWheel");
		frame.setResizable(true);
		frame.setBounds(600, 0, 740, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.add(new ColorWheel());
		frame.setVisible(true);
	}

}