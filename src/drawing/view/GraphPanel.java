package drawing.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class GraphPanel extends JPanel
{
	private int [] graphStuff;
	
	public GraphPanel()
	{
		//graphStuff initialized
		graphStuff = new int[] {24, 34, 82, 343, 69,81,37, 68, 95, 100};
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
	}
	
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		for(int index = 0; index < graphStuff.length; index++)
		{
			//Random colorizer
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			
			//Draw a rectangle for each value in the array.
			int height = this.getHeight()/graphStuff.length;
			int width = (int)((graphStuff[index] / 200.00) * this.getWidth());
			int xPosition = 0;
			int yPosition = height * index;
			
			//Sets the color, and fills 'em
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.fill(new Rectangle(xPosition, yPosition, width, height));
		}
	}
	
	
}
