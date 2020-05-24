/** 
 * Author: Vikram Penumarti
 * Date: 5/10/2020
 * Rev: 01
 * Notes:
*/

import java.awt.Graphics2D;
import java.awt.*;

public class Square extends Polygon //square which holds creators
{

	public void draw(int xCenter, int yCenter, Graphics2D g2)
	{
		String creators = "Created by: Vikram Penumarti, and Richard Zhang";
		int size = xCenter/2; //size of rectangle
		
		g2.setColor(Color.BLACK);
//		g2.draw(new Rectangle(xCenter - 200, yCenter + 150, 400, 100));//initially wanted fixed position
//		g2.drawString(creators, xCenter - 130, yCenter + 200);

		g2.draw(new Rectangle(xCenter - size, yCenter + 170, size * 2, size/4));//added scaling
		g2.drawString(creators, xCenter - 130, yCenter + 200);
		
	}
}