import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Copied from VendingMachine.java in lab_Snackbar
public class DrawCircle extends JPanel implements ActionListener {

	// Draws the color wheel.
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g.create();
		int centerX = this.getWidth() / 2;
		int centerY = this.getHeight() / 2;
		float[] fractions = new float[] { (float) 1 / 5, (float) 2 / 8, (float) 3 / 8, (float) 4 / 8, (float) 5 / 8,
				(float) 6 / 8, (float) 7 / 8, (float) 1 };
		Color[] colors = new Color[] { Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.RED,
				Color.ORANGE, Color.YELLOW };
		RadialGradientPaint gradient = new RadialGradientPaint((float) (centerX - 100), (float) (centerY - 100), 250,
				fractions, colors);

		// test
		float[] fractionTest1 = new float[] { (float) 1 / 5, (float) 2 / 8 };
		Color[] colorsTest1 = new Color[] { Color.GREEN, Color.CYAN };
		RadialGradientPaint gradientTest1 = new RadialGradientPaint((float) (centerX - 100), (float) (centerY - 100),
				250, fractionTest1, colorsTest1);

		super.paintComponent(g);
		super.paintComponent(g2);
		g2.setPaint(gradient);
		g2.setPaint(gradientTest1);
//	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 0, 120);
//	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 120, 120);
//	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 240, 120);
//	    

		// Basic Color Wheel
		
		// REV 1, 4/30/20
		// KNOWN BUGS: 
		// GREEN RUNS  4 TIMES WHILE BLUE ONLY RUNS ONCE. Besides that, FINDING 
		// BRIGHTNESS OF COLORS FOR THE SHADES OF GREEN AND BLUE.
		int angle = 0;
		int fixedAngle = 36;
		int x = 0;
		while (x <= 9) {
			// RED
			if (x == 0) {
				g2.setPaint(Color.red);
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
			}

			// ORANGE
			if (x == 1) {
				g2.setPaint(Color.orange);
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
			}

			// YELLOW
			if (x == 2) {
				g2.setPaint(Color.yellow);
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
			}

			// GREEN 1(NEED TO FIGURE OUT SHADES
			if (x == 3) {
				g2.setPaint(Color.green);

				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );

			}

			// GREEN 2(TOP)
			if (x == 4) {
				g2.setPaint(Color.green);

				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);

			}

			// GREEN 3(SAME)
			if (x == 5) {
				g2.setPaint(Color.green);

				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);

			}

			// CYAN
			if (x == 6) {
				g2.setPaint(Color.CYAN);
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );
			}

			// BLUE 1(SUPPOSED TO BE MIX OF BLUE AND CYAN
			if (x == 7) {
				g2.setPaint(Color.blue);

				// SAME thing as Green, Figure out how to get different shades.
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);

			}

			// PURPLE OR MAGENTA
			if (x == 8) {
				g2.setPaint(Color.MAGENTA);
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle);
			}

			// AGAIN, PURPLE OR MAGENTA
			if (x == 9) {
				g2.setPaint(Color.MAGENTA);
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );
			}

			// PINK
			if (x == 10) {
				g2.setPaint(Color.PINK);
				g2.fillArc(centerX - 100, centerY - 100, 200, 200, angle, fixedAngle );
			}

			angle = angle + 36;
			x++;
		}

	}

	// This might be unnecessary, depends on if we want a button or not.
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

// test
	public static void main(String[] args) {
		JFrame frame = new JFrame("ColorWheel");
		frame.setBounds(600, 300, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.add(new DrawCircle());
		frame.setVisible(true);
	}
}