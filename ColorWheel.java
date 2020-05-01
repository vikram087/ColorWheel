import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


// Copied from VendingMachine.java in lab_Snackbar
public class DrawCircle extends JPanel
                            implements ActionListener{
	
	// Draws the color wheel. 
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2 = (Graphics2D) g.create();  
		int centerX = this.getWidth()/2;
		int centerY = this.getHeight()/2;
		float[] fractions = new float[] {(float)1/5, (float)2/8, (float)3/8, (float)4/8, (float)5/8, (float)6/8, (float)7/8, (float)1};
		Color[] colors = new Color[] {Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.RED, Color.ORANGE, Color.YELLOW};
		
		
		RadialGradientPaint gradient = new RadialGradientPaint((float)(centerX - 100), (float)(centerY - 100), 250, fractions, colors);
		
		super.paintComponent(g);
	    super.paintComponent(g2);
	    g2.setPaint(gradient);
	    //g.fillOval(centerX - 100, centerY - 100, 200, 200);
	    //g.setColor(Color.GREEN);
	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 0, 120);
	    //g.setColor(Color.RED);
	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 120, 120);
	    //g.setColor(Color.BLUE);
	    g2.fillArc(centerX - 100, centerY - 100, 200, 200, 240, 120);
	    
	}
	
	// This might be unnecessary, depends on if we want a button or not.
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
	
// test
	public static void main(String[] args)
	{
	    JFrame frame = new JFrame("ColorWheel");
	    frame.setBounds(600,300,700,700);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c = frame.getContentPane();
	    c.add(new DrawCircle());
	    frame.setVisible(true);
	 }
}
