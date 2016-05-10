package drawing.controller;

import drawing.view.Drawing;
import drawing.view.DrawingFrame;
import drawing.view.DrawingShapes;

public class DrawController 
{
	private DrawingFrame baseFrame;
	private Drawing shapePanel;
	private DrawingShapes drawPanel;
	
	public DrawController()
	{
		baseFrame = new DrawingFrame(this);
	}

	public void start()
	{
		
	}
}
