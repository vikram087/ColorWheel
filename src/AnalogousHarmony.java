/**
 * Author: Richard Zhang
 * Date: 5/10/20
 * Rev:01
 * Notes:
 */

public class AnalogousHarmony implements ColorHarmony {
	// harmonies for each color
	public void findHarmonyRed(int color, int angle)// color is angle/arcLength //angle is starting angle of each
													// segment
	{
//		if (color > 255) {
//			color = 255;
//		}
		// purple
		int red1 = color;
		int green1 = color/2;
		int blue1 = 0;

		// yellow
		int red2 = color;
		int green2 = 0 ;
		int blue2 = color/2;
		if (angle >= 0 && angle <= 60) {
			System.out.println("initial rgb" + " " + blue1 + ", " + red1 + ", " + red1);// initial and complementary rgbs
			System.out.println("the chosen color is: red");// initial and complementary colors
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: yellow and purple");
		}
	}

	public void findHarmonyYellow(int color, int angle) {
//		if (color > 255) {
//			color = 255;
//		}
		// red
		int red1 = (color - 255) / 2;
		int green1 = color - 255;
		int blue1 = 0;

		// green
		int red2 = color - 255;
		int green2 = (color - 255) / 2;
		int blue2 = 0;
		if (angle > 60 && angle < 120) {
			System.out.println("initial rgb" + " " + -blue1 + ", " + -blue1 + ", " + green1);
			System.out.println("the chosen color is: yellow");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: red and green");
		}
	}

	public void findHarmonyGreen(int color, int angle) {
//		if (color > 255) {
//			color = 255;
//		}
		// R = 0, G = Original Color, B = 0
		// Yellow
		int red1 = 0;
		int green1 = color - 255 * 2;
		int blue1 = 0;

		// cyan 
		int red2 = (color - 255 * 2) / 2;
		int green2 = color - 255 * 2;
		int blue2 = 0;
		if (angle >= 120 && angle < 180) {
			System.out.println("initial rgb" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("the chosen color is: green");
			System.out.println("analogous rgb color 1:" + " " + green1/2 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + blue2 + ", " + green2 + ", " + red2);
			System.out.println("the analogous color is: yellow and cyan");
		}
	}

	public void findHarmonyCyan(int color, int angle) {
		// R = 0, G = Original Color, B = Original Color
//		if (color > 255) {
//			color = 255;
//		}
		// blue
		int red1 = 0;
		int green1 = (color - 255 * 3)/2;
		int blue1 = color - 255 * 3;

		// green
		int red2 = 0;
		int green2 = color - 255 * 3;
		int blue2 = (color - 255 * 3)/2;

		if (angle >= 180 && angle < 240) {
			System.out.println("initial rgb" + " " + red1 + ", " + blue1 + ", " + blue1);
			System.out.println("the chosen color is: cyan");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: green and blue");
		}

	}

	public void findHarmonyBlue(int color, int angle) {
		// R = 0, G = 0, B = Original Color
//		if (color > 255) {
//			color = 255;
//		}
		// blue
		int red1 = 0;
		int green1 = (color - 255 * 4)/2;
		int blue1 = color - 255 * 4;

		// purple
		int red2 = color - 255 * 4;
		int green2 = 0;
		int blue2 = (color - 255 * 4)/2;
		if (angle >= 240 && angle < 300) {
			System.out.println("initial rgb" + " " + red1 + ", " + red1 + ", " + blue1);
			System.out.println("the chosen color is: blue");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + blue2 + ", " + green2 + ", " + red2);
			System.out.println("the analogous color is: cyan and purple");
		}

	}

	public void findHarmonyPurple(int color, int angle) {
//		if (color > 255) {
//			color = 255;
//		}
		// red
		int red1 = color - 255 * 5;
		int green1 = 0;
		int blue1 = 0;

		// blue
		int red2 = 0;
		int green2 = (color - 255 * 5)/2;
		int blue2 = color - 255 * 5;
		if (angle >= 300 && angle < 360) {
			System.out.println("initial rgb" + " " + red1 + ", " + blue1 + ", " + red1);
			System.out.println("the chosen color is: purple");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + red1/2);
			System.out.println("analogous rgb color 2:" + " " + green2 + ", " + red2 + ", " + blue2);
			System.out.println("the analogous color is: blue and red");
		}
	}
}