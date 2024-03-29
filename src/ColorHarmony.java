/** 
 * Author: Vikram Penumarti
 * Date: 5/10/2020
 * Rev: 01
 * Notes:
*/

/**
 * Author: Richard Zhang
 * Date: 4/30/2020
 * Rev:05
 * Notes: Interface for the colorharmonies
 */

public interface ColorHarmony {
	
	public void findHarmonyRed(int color, int angle);
	
	public void findHarmonyGreen(int color, int angle);
	
	public void findHarmonyBlue(int color, int angle);
	
	public void findHarmonyYellow(int color, int angle);
	
	public void findHarmonyCyan(int color, int angle);
	
	public void findHarmonyPurple(int color, int angle);
}