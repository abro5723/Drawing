package drawing.view;

import javax.swing.JFrame;

import drawing.controller.DrawController;



public class DrawingFrame extends JFrame
{
	private DrawController baseController;
	private Drawing basePanel;
	
	public DrawingFrame(DrawController baseController)
	{
		//association of instances to variables
		this.baseController = baseController;
		basePanel = new Drawing(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		//setting the frames different attributes.
		this.setContentPane(basePanel);
		this.setSize(800, 800);
		this.setTitle("Draw");
		this.setResizable(false);
		this.setVisible(true);
	}

	public DrawController getBaseController() 
	{
		return baseController;
	}

	public void setBaseController(DrawController baseController) 
	{
		this.baseController = baseController;
	}

	public Drawing getBasePanel() 
	{
		return basePanel;
	}

	public void setBasePanel(Drawing basePanel) 
	{
		this.basePanel = basePanel;
	}
	
	

}
