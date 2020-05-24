/** 
 * Author: Vikram Penumarti
 * Date: 5/10/2020
 * Rev: 01
 * Notes:
*/

/**
 * Author: Richard Zhang
 * Date:  5/21/2020
 * Rev:06
 * Notes: The class for drawing a color wheel. Created the basic color wheel using if statements.
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

// implements ActionListener, MouseListener
// extends JPanel
public class ColorWheel extends JPanel implements MouseListener
{
	private boolean click;
	private int x, y;
	private double angle;
	private int colorA;
	// Not sure if angle is needed.

	public ColorWheel() 
	{
		addMouseListener(this);
		click = false;
		x = 0;
		y = 0;
		angle = 0;
	}

	public void paintComponent(Graphics g)
	{
		int centerX = this.getWidth() / 2;
		int centerY = this.getHeight() / 2;

//		System.out.println(centerX + ", " + centerY);
		Circle circle = new Circle();
		
		Polygon square = new Square();

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g.create();

		circle.draw(centerX, centerY, g2);
		square.draw(centerX, centerY, g2);
	}

	public void mouseClicked(MouseEvent mouse)
	{

		ComplementaryHarmony complementaryTest = new ComplementaryHarmony();
		MonochromaticHarmony monochromaticTest = new MonochromaticHarmony();
		SplitHarmony splitTest = new SplitHarmony();
		TetradicHarmony tetradicTest = new TetradicHarmony();
		AnalogousHarmony analogousTest = new AnalogousHarmony();
		TriadicHarmony triadicTest = new TriadicHarmony();
		
		int angleInt = 0;

		x = mouse.getX();
		y = mouse.getY();
		click = true;
		String input = "";
		Scanner kboard = new Scanner(System.in);

		int angleX = x - this.getWidth() / 2;

		int angleY = this.getHeight() / 2 - y;

		// Quad 1
		System.out.println("What Harmony do you choose?");
		System.out.println("Complementary, Monochromatic, Analogous, Split, Triadic, Tetradic.");
		input = kboard.next();
		
		if (angleX > 0 && angleY > 0) 
		{
			angle = (180 * Math.atan((double) angleY / angleX) / Math.PI);
			angleInt = (int) angle;
			System.out.println("angle: " + angle);

			colorA = (int) ((double) angle / 0.2353);

			if (angle >= 0 && angle <= 60)//conditionals deciding which class to use, and which method depending on angle clicked
			{
				if (input.equalsIgnoreCase("complementary")) 
				{
					complementaryTest.findHarmonyRed(colorA, angleInt);// segment for red
				}
				if (input.equalsIgnoreCase("monochromatic"))
				{
					monochromaticTest.findHarmonyRed(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split"))
				{
					splitTest.findHarmonyRed(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic"))
				{
					tetradicTest.findHarmonyRed(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous")) 
				{
					analogousTest.findHarmonyRed(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyRed(colorA, angleInt);
				}
			}

			else if (angle > 60 && angle < 90)// segment for yellow in Q1
			{
				if (input.equalsIgnoreCase("complementary"))
				{
					complementaryTest.findHarmonyYellow(colorA, angleInt);
				}

				if (input.equalsIgnoreCase("monochromatic"))
				{
					monochromaticTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split")) 
				{
					splitTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic"))
				{
					tetradicTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous")) 
				{
					analogousTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyYellow(colorA, angleInt);
				}
			}
		}

		// Quad 2
		if (angleX < 0 && angleY > 0) 
		{
			angle = (int) (180 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			angleInt = (int) angle;
			System.out.println("angle: " + angle);

			colorA = (int) ((double) angle / 0.2353);

			if (angle > 90 && angle <= 120)// segment for yellow in Q2
			{
				if (input.equalsIgnoreCase("complementary")) 
				{

					complementaryTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("monochromatic"))
				{
					monochromaticTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split"))
				{
					splitTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic")) 
				{
					tetradicTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous")) 
				{
					analogousTest.findHarmonyYellow(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyYellow(colorA, angleInt);
				}
			}

			else if (angle > 120 && angle <= 180)// green
			{
				if (input.equalsIgnoreCase("complementary"))
				{

					complementaryTest.findHarmonyGreen(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("monochromatic")) 
				{
					monochromaticTest.findHarmonyGreen(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split"))
				{
					splitTest.findHarmonyGreen(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic")) 
				{
					tetradicTest.findHarmonyGreen(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous")) 
				{
					analogousTest.findHarmonyGreen(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyGreen(colorA, angleInt);
				}
			}
		}

		// Quad 3
		if (angleX < 0 && angleY < 0)
		{
			angle = (int) (180 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			angleInt = (int) angle;
			System.out.println("angle: " + angle);

			colorA = (int) ((double) angle / 0.2353);

			if (angle > 180 && angle <= 240)// cyan
			{
				if (input.equalsIgnoreCase("complementary")) 
				{
					complementaryTest.findHarmonyCyan(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("monochromatic")) 
				{
					monochromaticTest.findHarmonyCyan(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split")) 
				{
					splitTest.findHarmonyCyan(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic")) 
				{
					tetradicTest.findHarmonyCyan(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous")) 
				{
					analogousTest.findHarmonyCyan(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyCyan(colorA, angleInt);
				}
			}

			else if (angle > 240 && angle <= 270)// blue Q3
			{
				if (input.equalsIgnoreCase("complementary"))
				{
					complementaryTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("monochromatic")) 
				{
					monochromaticTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split")) 
				{
					splitTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic"))
				{
					tetradicTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous")) 
				{
					analogousTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyBlue(colorA, angleInt);
				}
			}
		}

		// Quad 4
		if (angleX > 0 && angleY < 0) 
		{
			angle = (int) (360 + 180 * Math.atan((double) angleY / angleX) / Math.PI);
			angleInt = (int) angle;
			System.out.println("angle: " + angle);

			colorA = (int) ((double) angle / 0.2353);

			if (angle > 270 && angle <= 300)// blue Q4
			{
				if (input.equalsIgnoreCase("complementary"))
				{
					complementaryTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("monochromatic")) 
				{
					monochromaticTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split"))
				{
					splitTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic"))
				{
					tetradicTest.findHarmonyBlue(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous"))
				{
					analogousTest.findHarmonyBlue(colorA, angleInt);
				}	
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyBlue(colorA, angleInt);
				}
			}

			else if (angle > 300 && angle <= 360)// purple
			{
				if (input.equalsIgnoreCase("complementary"))
				{

					complementaryTest.findHarmonyPurple(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("monochromatic")) 
				{
					monochromaticTest.findHarmonyPurple(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("split"))
				{
					splitTest.findHarmonyPurple(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("tetradic")) 
				{
					tetradicTest.findHarmonyPurple(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("analogous")) 
				{
					analogousTest.findHarmonyPurple(colorA, angleInt);
				}
				if (input.equalsIgnoreCase("triadic")) 
				{
					triadicTest.findHarmonyPurple(colorA, angleInt);
				}
			}
		}

		System.out.println("x: " + angleX);
		System.out.println("y: " + angleY);
	}

	// Unnecessary Methods
	public void mouseEntered(MouseEvent mouse) 
	{
	}

	public void mouseExited(MouseEvent mouse) 
	{
	}

	public void mousePressed(MouseEvent mouse) 
	{
	}

	public void mouseReleased(MouseEvent mouse) 
	{
	}

	// Accessor method
	public double getAngle() 
	{
		return angle;
	}

	public int getColor() 
	{
		return colorA;
	}

// test
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("ColorWheel");
		frame.setResizable(true);
		frame.setBounds(600, 0, 740, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.add(new ColorWheel());
		frame.setVisible(true);
	}
}