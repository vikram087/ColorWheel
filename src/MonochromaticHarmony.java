/**
 * Author: Richard Zhang
 * Date: 5/21/20
 * Rev:03
 * Notes: Code for Finding the Triadic Harmony from an input from the ColorWheel.
 */

public class MonochromaticHarmony implements ColorHarmony {
	// harmonies for each color
	
	// Red
	public void findHarmonyRed(int color, int angle)// color is angle/arcLength //angle is starting angle of each
													// segment
	{
	
		if (angle >= 0 && angle <= 60) {
			System.out.println("the chosen color is: red");// initial and complementary colors
			System.out.println("the monochromatic color is: red");
		}
	}

	// Yellow
	public void findHarmonyYellow(int color, int angle) {


		if (angle > 60 && angle < 120) {
			System.out.println("the chosen color is: yellow");
			System.out.println("the monochromatic color is: yellow");
		}
	}

	// Green
	public void findHarmonyGreen(int color, int angle) {


		if (angle >= 120 && angle < 180) {
			System.out.println("the chosen color is: green");
			System.out.println("the monochromatic color is: green");
		}
	}
	
	// Cyan
	public void findHarmonyCyan(int color, int angle) {
		

		if (angle >= 180 && angle < 240) {
			System.out.println("the chosen color is: cyan");
			System.out.println("the monochromatic color is: cyan");
		}

	}

	// Blue
	public void findHarmonyBlue(int color, int angle) {

		if (angle >= 240 && angle < 300) {
			System.out.println("the chosen color is: blue");
			System.out.println("the monochromatic color is: blue");
		}

	}

	// Purple
	public void findHarmonyPurple(int color, int angle) {

		if (angle >= 300 && angle < 360) {
			System.out.println("the chosen color is: purple");
			System.out.println("the monochromatic color is: purple");
		}
	}
}