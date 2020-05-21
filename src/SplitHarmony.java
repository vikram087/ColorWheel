/** 
 * Author: Vikram Penumarti
 * Date: 5/10/2020
 * Rev: 01
 * Notes:
*/



public class SplitHarmony implements ColorHarmony
{
	//harmonies for each color
	public void findHarmonyRed(int color, int angle)//color is angle/arcLength //angle is starting angle of each segment 
	{
		int red = 0; 
		int green = color;//increasing
		int blue = color;
		
		if (angle >= 0 && angle <= 60)
		{
			System.out.println("initial rgb" + " " + blue + ", " + red + ", " + red);//initial and complementary rgbs
			System.out.println("the chosen color is: red");//initial and complementary colors
			System.out.println("split rgb 1:" + " " + red + ", " + green/2 + ", " + blue);
			System.out.println("split rgb 2:" + " " + red + ", " + green + ", " + blue/2);
			System.out.println("the split colors are: blue, green");
		}
	}
	
	public void findHarmonyYellow(int color, int angle) 
	{
		int red = 0; 
		int green = 0;
		int blue = 255 - color;
		
		if (angle > 60 && angle < 120)
		{
			System.out.println("initial rgb" + " " + -blue + ", " + -blue + ", " + green);
			System.out.println("the chosen color is: yellow");
			System.out.println("split rgb 1:" + " " + -blue/2 + ", " + green + ", " + -blue);
			System.out.println("split rgb 2:" + " " + red + ", " + -blue/2 + ", " + -blue);
			System.out.println("the split colors are: cyan, blue");
		}
	}

	public void findHarmonyGreen(int color, int angle)
	{
		int red = 255 * 2 - color; 
		int green = 0;
		int blue = 255 * 2 - color;

		if (angle >= 120 && angle < 180)
		{
			System.out.println("initial rgb" + " " + green + ", " + -blue + ", " + green);
			System.out.println("the chosen color is: green");
			System.out.println("split rgb 1:" + " " + -red + ", " + green + ", " + -blue/2);
			System.out.println("split rgb 2:" + " " + -red/2 + ", " + green + ", " + -blue);
			System.out.println("the split colors are: red, blue");
		}
	}
	
	public void findHarmonyCyan(int color, int angle) 
	{
		int red = 255 * 3 - color; 
		int green = 0;
		int blue = 0;
		
		if (angle >= 180 && angle < 240)
		{
			System.out.println("initial rgb" + " " + green + "," + -red + "," + -red);
			System.out.println("the chosen color is: cyan");
			System.out.println("split rgb 1:" + " " + -red + ", " + -red/2 + ", " + blue);
			System.out.println("split rgb 2:" + " " + -red + ", " + green + ", " + -red/2);
			System.out.println("the split colors are: yellow, blue");
		}

	}

	public void findHarmonyBlue(int color, int angle)
	{
		int red = 255 * 4 - color;
		int green = 255 * 4 - color;
		int blue = 0;
		
		if (angle >= 240 && angle < 300)
		{
			System.out.println("initial rgb" + " " + blue + "," + blue + "," + -red);
			System.out.println("the chosen color is: blue");
			System.out.println("split rgb 1:" + " " + -red/2 + ", " + -green + ", " + blue);
			System.out.println("split rgb 2:" + " " + -red + ", " + -green/2 + ", " + blue);
			System.out.println("the split colors are: green, red");
		}

	}

	public void findHarmonyPurple(int color, int angle)
	{
		int red = 0; 
		int green = 255 * 5 - color;//increased multiplier, because color becomes very large
		int blue = 0;
		
		if (angle >= 300 && angle < 360)
		{
			System.out.println("initial rgb" + " " + -green + ", " + blue + ", " + -green);
			System.out.println("the chosen color is: purple");
			System.out.println("split rgb 1:" + " " + red + ", " + -green + ", " + -green/2);
			System.out.println("split rgb 2:" + " " + -green/2 + ", " + -green + ", " + -blue);
			System.out.println("the split colors are: green, cyan");
		}
	}
}