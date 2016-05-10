package drawing.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import drawing.controller.DrawController;


public class Drawing extends JPanel
{
	private DrawController baseController;
	private SpringLayout baseLayout;
	private DrawingShapes shapePanel;
	private JButton drawRectangleButton;
	private JButton clearButton;
	
	public Drawing(DrawController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		shapePanel = new DrawingShapes();
		clearButton = new JButton();
		
		
		
		drawRectangleButton = new JButton();
		drawRectangleButton.setText("Rectangles");
		
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupLayout() 
	{
		baseLayout.putConstraint(SpringLayout.WEST, drawRectangleButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, drawRectangleButton, -10, SpringLayout.SOUTH, this);// TODO Auto-generated method stub
		
	}

	private void setupPanel()
	{
		this.add(drawRectangleButton);
		this.add(shapePanel);
		this.setLayout(baseLayout);
		this.setBackground(Color.WHITE);
	}

	private void setupListeners()
	{
		drawRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
		});
		
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
	}
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		mainGraphics.setColor(Color.MAGENTA);
		mainGraphics.setStroke(new BasicStroke(5));
		mainGraphics.draw(new Rectangle(90,10,20,40));
	}
}
