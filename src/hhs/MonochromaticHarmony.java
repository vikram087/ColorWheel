/**
 * Author: Richard Zhang
 * Date: 5/10/20
 * Rev:01
 * Notes:
 */

package hhs;

public class MonochromaticHarmony implements ColorHarmony {
	// harmonies for each color
	public void findHarmonyRed(int color, int angle)// color is angle/arcLength //angle is starting angle of each
													// segment
	{
		int red = color;
		int green = 0;
		int blue = 0;

		if (angle >= 0 && angle <= 60) {
			System.out.println("initial rgb" + " " + blue + ", " + red + ", " + red);// initial and complementary rgbs
			System.out.println("the chosen color is: red");// initial and complementary colors
			System.out.println("monochromatic rgb" + " " + red + ", " + green + ", " + blue);
			System.out.println("the monochromatic color is: red");
		}
	}

	public void findHarmonyYellow(int color, int angle) {
		int red = 255 * 4 - color;
		int green = 255 * 4 - color;
		int blue = 0;

		if (angle > 60 && angle < 120) {
			System.out.println("initial rgb" + " " + -blue + ", " + -blue + ", " + green);
			System.out.println("the chosen color is: yellow");
			System.out.println("monochromatic rgb" + " " + red + ", " + green + ", " + -blue);
			System.out.println("the monochromatic color is: yellow");
		}
	}

	public void findHarmonyGreen(int color, int angle) {
		// R = 0, G = Original Color, B = 0
		int red = 0;
		int green = color;
		int blue = 0;

		if (angle >= 120 && angle < 180) {
			System.out.println("initial rgb" + " " + green + ", " + -blue + ", " + green);
			System.out.println("the chosen color is: green");
			System.out.println("monochromatic rgb" + " " + -red + ", " + green + ", " + -blue);
			System.out.println("the monochromatic color is: green");
		}
	}

	public void findHarmonyCyan(int color, int angle) {
		// R = 0, G = Original Color, B = Original Color
		int red = 0;
		int green = color;
		int blue = color;

		if (angle >= 180 && angle < 240) {
			System.out.println("initial rgb" + " " + green + "," + -red + "," + -red);
			System.out.println("the chosen color is: cyan");
			System.out.println("monochromatic rgb" + " " + -red + "," + green + "," + blue);
			System.out.println("the monochromatic color is: cyan");
		}

	}

	public void findHarmonyBlue(int color, int angle) {
		// R = 0, G = 0, B = Original Color
		int red = 0;
		int green = 0;
		int blue = color;

		if (angle >= 240 && angle < 300) {
			System.out.println("initial rgb" + " " + blue + "," + blue + "," + -red);
			System.out.println("the chosen color is: blue");
			System.out.println("monochromatic rgb" + " " + -red + "," + -green + "," + blue);
			System.out.println("the monochromatic color is: blue");
		}

	}

	public void findHarmonyPurple(int color, int angle) {
		int red = color;
		int green = 0;
		int blue = color;

		if (angle >= 300 && angle < 360) {
			System.out.println("initial rgb" + " " + -green + "," + blue + "," + -green);
			System.out.println("the chosen color is: purple");
			System.out.println("monochromatic rgb" + " " + red + "," + -green + "," + blue);
			System.out.println("the monochromatic color is: purple");
		}
	}
}