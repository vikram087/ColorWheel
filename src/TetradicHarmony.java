/** 
 * Author: Vikram Penumarti
 * Date: 5/10/2020
 * Rev: 01
 * Notes:
*/

public class TetradicHarmony implements ColorHarmony
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
			System.out.println("tetradic rgb 1:" + " " + red + ", " + green + ", " + blue);
			System.out.println("tetradic rgb 2:" + " " + red + ", " + red + ", " + blue);
			System.out.println("tetradic rgb 3:" + " " + blue + ", " + green + ", " + red);
			System.out.println("the tetradic colors are: cyan, blue, yellow");
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
			System.out.println("tetradic rgb 1:" + " " + red + ", " + green + ", " + -blue);
			System.out.println("tetradic rgb 2:" + " " + -blue + ", " + green + ", " + -blue);
			System.out.println("tetradic rgb 3:" + " " + red + ", " + -blue + ", " + red);
			System.out.println("the tetradic colors are: blue, purple, green");
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
			System.out.println("tetradic rgb 1:" + " " + -red + ", " + green + ", " + -blue);
			System.out.println("tetradic rgb 2:" + " " + -red + ", " + green + ", " + green);
			System.out.println("tetradic rgb 3:" + " " + green + ", " + -red + ", " + -blue);
			System.out.println("the tetradic colors are: purple, red, cyan");
		}
	}
	
	public void findHarmonyCyan(int color, int angle) 
	{
		int red = 255 * 3 - color; 
		int green = 0;
		int blue = 0;
		
		if (angle >= 180 && angle < 240)
		{
			System.out.println("initial rgb" + " " + green + ", " + -red + ", " + -red);
			System.out.println("the chosen color is: cyan");
			System.out.println("tetradic rgb 1:" + " " + -red + ", " + green + ", " + blue);
			System.out.println("tetradic rgb 2:" + " " + -red + ", " + -red + ", " + blue);
			System.out.println("tetradic rgb 3:" + " " + green + ", " + green + ", " + -red);
			System.out.println("the tetradic colors are: red, yellow, blue");
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
			System.out.println("tetradic rgb 1:" + " " + -red + ", " + -green + ", " + blue);
			System.out.println("tetradic rgb 2:" + " " + blue + ", " + -green + ", " + blue);
			System.out.println("tetradic rgb 3:" + " " + -red + ", " + blue + ", " + -green);
			System.out.println("the tetradic colors are: yellow, green, purple");
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
			System.out.println("tetradic rgb 1:" + " " + red + ", " + -green + ", " + blue);
			System.out.println("tetradic rgb 2:" + " " + red + ", " + -green + ", " + -green);
			System.out.println("tetradic rgb 3:" + " " + -green + ", " + red + ", " + blue);
			System.out.println("the tetradic colors are: green, cyan, red");
		}
	}
}