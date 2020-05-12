/** 
 * Author: Vikram Penumarti
 * Date: 5/10/2020
 * Rev: 01
 * Notes:
*/

/**
 * Author: Richard Zhang
 * Date: 4/30/2020
 * Rev:03
 * Notes: The class for drawing a color wheel. Created the basic color wheel using if statements.
 */

package hhs;

import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * REV 2, 5/5/2020
 * KNOWN BUGS: GRADIENT ACHIEVED FOR EACH INDIVIDUAL COLOR
 * BUT DOES NOT HAVE SMOOTH TRANSITIONS
 */

public class DrawCircle  
{
	
	public void draw(int centerX, int centerY, Graphics2D g2)
	{
		
		double sizeX = centerX * 2 / 3;// 4/3 ratio from frame to arc
		double sizeY = centerY * 2 / 3;
		
		//System.out.println(centerX + "," + centerY);
		
		double angle = 0;
		double addedAngle = 0.2353;
		int maxWhite = 255;

		//For loops for all 256 rgb combos
		for (int rgb = 0; rgb <= maxWhite; rgb++)
		{
			g2.setPaint(new Color(255, rgb, rgb));//red
			g2.fill(new Arc2D.Double(centerX - sizeX / 2, centerY - sizeY / 2, sizeX, sizeY, angle, addedAngle, Arc2D.PIE));
			angle = angle + addedAngle;
		}
		for (int rgb = 0; rgb <= maxWhite; rgb++)
		{
			g2.setColor(new Color(255, 255, rgb));//purple
			g2.fill(new Arc2D.Double(centerX - sizeX / 2, centerY - sizeY / 2, sizeX, sizeY, angle, addedAngle, Arc2D.PIE));
			angle = angle + addedAngle;
		}
		for (int rgb = 0; rgb <= maxWhite; rgb++)
		{
			g2.setColor(new Color(rgb, 255, rgb));//blue
			g2.fill(new Arc2D.Double(centerX - sizeX / 2, centerY - sizeY / 2, sizeX, sizeY, angle, addedAngle, Arc2D.PIE));
			angle = angle + addedAngle;
		}
		for (int rgb = 0; rgb <= maxWhite; rgb++) 
		{
			g2.setColor(new Color(rgb, 255, 255));//cyan
			g2.fill(new Arc2D.Double(centerX - sizeX / 2, centerY - sizeY / 2, sizeX, sizeY, angle, addedAngle, Arc2D.PIE));
			angle = angle + addedAngle;
		}
		for (int rgb = 0; rgb <= maxWhite; rgb++) 
		{
			g2.setColor(new Color(rgb, rgb, 255));//green
			g2.fill(new Arc2D.Double(centerX - sizeX / 2, centerY - sizeY / 2, sizeX, sizeY, angle, addedAngle, Arc2D.PIE));
			angle = angle + addedAngle;
		}
		for (int rgb = 0; rgb <= maxWhite; rgb++)
		{
			g2.setColor(new Color(255, rgb, 255));//yellow
			g2.fill(new Arc2D.Double(centerX - sizeX / 2, centerY - sizeY / 2, sizeX, sizeY, angle, addedAngle, Arc2D.PIE));
			angle = angle + addedAngle;
		}
	}

	
//		First attempt, used Radial Gradient paint, didn't produce the product needed		
	
//		float[] fractions = new float[] { (float) 1 / 5, (float) 2 / 8, (float) 3 / 8, (float) 4 / 8, (float) 5 / 8,
//				(float) 6 / 8, (float) 7 / 8, (float) 1 };
//		Color[] colors = new Color[] { Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.RED,
//				Color.ORANGE, Color.YELLOW };
//		RadialGradientPaint gradient = new RadialGradientPaint((float) (centerX - 100), (float) (centerY - 100), 250,
//				fractions, colors);
//
//		// test
//		float[] fractionTest1 = new float[] { (float) 1 / 5, (float) 2 / 8 };
//		Color[] colorsTest1 = new Color[] { Color.GREEN, Color.CYAN };
//		RadialGradientPaint gradientTest1 = new RadialGradientPaint((float) (centerX - 100), (float) (centerY - 100),
//				250, fractionTest1, colorsTest1);
//
//		super.paintComponent(g);
//		g2.setPaint(gradient);
//		g2.setPaint(gradientTest1);
//	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 0, 120);
//	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 120, 120);
//	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 240, 120);	    

	
	// Basic Color Wheel
	
			// REV 1, 4/30/20
			// KNOWN BUGS: 
			// GREEN RUNS  4 TIMES WHILE BLUE ONLY RUNS ONCE. Besides that, FINDING 
			// BRIGHTNESS OF COLORS FOR THE SHADES OF GREEN AND BLUE.

//			int fixedAngle = 36;
//			int x = 0;
//			while (x <= 9) 
//			{
//				// RED
//				if (x == 0) 
//				{
//					g.setColor(Color.red);
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
//				}
	//
//				// ORANGE
//				if (x == 1)
//				{
//					g.setColor(Color.orange);
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
//				}
	//
//				// YELLOW
//				if (x == 2) 
//				{
//					g.setColor(Color.yellow);
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
//				}
	//
//				// GREEN 1(NEED TO FIGURE OUT SHADES
//				if (x == 3)
//				{
//					g.setColor(Color.green);
	//
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );
//				}
	//
//				// GREEN 2(TOP)
//				if (x == 4) 
//				{
//					g.setColor(Color.green);
	//
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
//				}
	//
//				// GREEN 3(SAME)
//				if (x == 5) 
//				{
//					g.setColor(Color.green);
	//
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
//				}
	//
//				// CYAN
//				if (x == 6) 
//				{
//					g.setColor(Color.CYAN);
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );
//				}
	//
//				// BLUE 1(SUPPOSED TO BE MIX OF BLUE AND CYAN
//				if (x == 7) 
//				{
//					g.setColor(Color.blue);
	//
//					// SAME thing as Green, Figure out how to get different shades.
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
//				}
	//
//				// PURPLE OR MAGENTA
//				if (x == 8) 
//				{
//					g.setColor(Color.MAGENTA);
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
//				}
	//
//				// AGAIN, PURPLE OR MAGENTA
//				if (x == 9) 
//				{
//					g.setColor(Color.MAGENTA);
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );
//				}
	//
//				// PINK
//				if (x == 10) 
//				{
//					g.setColor(Color.PINK);
//					g.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );
//				}
	//
//				angle = angle + 36;
//				x++;
//			}	
	
	//tried all possible color combos, program cannot handle it
	
//	for (int red = 0; red <= 255; red++)
//	{
//		for(int green = 0; green <= 255; green++)
//		{
//			for(int blue = 0; blue <= 255; blue++)
//			{
//				g2.setColor(new Color(red, green, blue));
//				g2.fill(new Arc2D.Double(centerX - 100, centerY - 100, 200, 200, angle, 1/(Math.pow(2, 24)), Arc2D.PIE));
//				angle = angle + 1/(Math.pow(2, 24));
//			}
//		}
//	}	
}
