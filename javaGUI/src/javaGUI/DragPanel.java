package javaGUI;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{
	
	 ImageIcon originalIcon = new ImageIcon("snake.png");
     
     Image originalImage = originalIcon.getImage();

     int scaledWidth = 100;
     int scaledHeight = 100;
     Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

     // Create a new ImageIcon with the scaled image
     ImageIcon scaledIcon = new ImageIcon(scaledImage);
     
     final int WIDTH=scaledIcon.getIconWidth();
     final int HEIGHT=scaledIcon.getIconHeight();
     
     
     Point imagePoint;
     Point prevPoint;
	public DragPanel() {
		// TODO Auto-generated constructor stub
		imagePoint=new Point(0,0);
		ClickListener clickListener=new ClickListener();
		DragListener d=new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(d);
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		scaledIcon.paintIcon(this, g, (int)imagePoint.getX(), (int)imagePoint.getY());
		
	}
	
	/* paintComponent(Graphics g)
Purpose: Override this method to perform custom painting on a Swing component.
Invocation: Automatically called by the Swing framework when the component needs to be repainted (e.g., when the window is resized, uncovered, or explicitly requested to be repainted).
Usage: You typically override this method in a class that extends JPanel or another Swing component.
Graphics
Role: Provides methods for drawing on components. It acts as a drawing context that allows you to render shapes, text, and images.
Common Methods:
//drawLine(int x1, int y1, int x2, int y2): Draws a line between two points.
drawRect(int x, dint y, int width, int height): Draws the outline of a rectangle.
fillRect(int x, int y, int width, int height): Fills a rectangle with the current color.
drawOval(int x, int y, int width, int height): Draws the outline of an oval.
fillOval(int x, int y, int width, int height): Fills an oval with the current color.
drawString(String str, int x, int y): Draws a string of text at the specified location.
setColor(Color c): Sets the current drawing color.
setFont(Font font): Sets the current font for text drawing.*/
	
	private class ClickListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e) {
		prevPoint=e.getPoint();
		}
	}
	
	
	private class DragListener extends MouseMotionAdapter
	{
		public void mouseDragged(MouseEvent e)
		{
			Point currPoint=new Point();
			currPoint=e.getPoint();
			
			imagePoint.translate(
					
					(int)(currPoint.getX()-prevPoint.getX()),
			        
					(int)(currPoint.getY()-prevPoint.getY())
					
					
					);
			prevPoint=currPoint;
			repaint();
			
			
		}
		
	}

}
