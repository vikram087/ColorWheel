/**
 * Author: Richard Zhang
 * Date: 5/15/20
 * Rev:01
 * Notes:Code for Finding the Triadic Harmony from an input from the ColorWheel.
 */



public class TriadicHarmony implements ColorHarmony {
	// harmonies for each color
	public void findHarmonyRed(int color, int angle)// color is angle/arcLength //angle is starting angle of each
													// segment
	{
		if (color > 255) {
			color = 255;
		}
		// green
		int red1 = 0;
		int green1 = color;
		int blue1 = 0;

		// blue
		int red2 = 0;
		int green2 = 0;
		int blue2 = color;
		if (angle >= 0 && angle <= 60) {
			System.out.println("initial rgb" + " " + blue1 + ", " + red1 + ", " + red1);// initial and complementary
																						// rgbs
			System.out.println("the chosen color is: red");// initial and complementary colors
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: yellow and purple");
		}
	}

	public void findHarmonyYellow(int color, int angle) {
		if (color > 255) {
			color = 255;
		}
		// red
		int red1 = 0;
		int green1 = color;
		int blue1 = color;

		// green
		int red2 = color;
		int green2 = 0;
		int blue2 = color;
		if (angle > 60 && angle < 120) {
			System.out.println("initial rgb" + " " + -blue1 + ", " + -blue1 + ", " + green1);
			System.out.println("the chosen color is: yellow");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: red and green");
		}
	}

	public void findHarmonyGreen(int color, int angle) {
		if (color > 255) {
			color = 255;
		}
		// blue
		int red1 = 0;
		int green1 = 0;
		int blue1 = color;

		// red
		int red2 = color;
		int green2 = 0;
		int blue2 = 0;
		if (angle >= 120 && angle < 180) {
			System.out.println("initial rgb" + " " + green1 + ", " + -blue1 + ", " + green1);
			System.out.println("the chosen color is: green");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: yellow and cyan");
		}
	}

	public void findHarmonyCyan(int color, int angle) {
		// R = 0, G = Original Color, B = Original Color
		if (color > 255) {
			color = 255;
		}
		// yellow
		int red1 = color;
		int green1 = color ;
		int blue1 = 0;

		// pink
		int red2 = color;
		int green2 = 0;
		int blue2 = color;

		if (angle >= 180 && angle < 240) {
			System.out.println("initial rgb" + " " + green1 + "," + -red1 + "," + -red1);
			System.out.println("the chosen color is: cyan");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: green and blue");
		}

	}

	public void findHarmonyBlue(int color, int angle) {
		// R = 0, G = 0, B = Original Color
		if (color > 255) {
			color = 255;
		}
		// red
		int red1 = color;
		int green1 =0;
		int blue1 = 0;

		// green
		int red2 = 0;
		int green2 = color;
		int blue2 = 0;
		if (angle >= 240 && angle < 300) {
			System.out.println("initial rgb" + " " + blue1 + "," + blue1 + "," + -red1);
			System.out.println("the chosen color is: blue");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: red and green");
		}

	}

	public void findHarmonyPurple(int color, int angle) {
		if (color > 255) {
			color = 255;
		}
		// yellow
		int red1 = color;
		int green1 = color;
		int blue1 = 0;

		// Cyan
		int red2 = 0;
		int green2 = color;
		int blue2 = color;
		if (angle >= 300 && angle < 360) {
			System.out.println("initial rgb" + " " + -green1 + "," + blue1 + "," + -green1);
			System.out.println("the chosen color is: purple");
			System.out.println("analogous rgb color 1:" + " " + red1 + ", " + green1 + ", " + blue1);
			System.out.println("analogous rgb color 2:" + " " + red2 + ", " + green2 + ", " + blue2);
			System.out.println("the analogous color is: blue and red");
		}
	}
}