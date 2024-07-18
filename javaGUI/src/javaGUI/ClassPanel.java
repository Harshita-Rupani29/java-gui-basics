package javaGUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class ClassPanel extends JPanel {
	
	public ClassPanel() {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(500,500));
	}
	public void paint(Graphics g)
	{
		Graphics2D graphics2d=(Graphics2D) g;
//		graphics2d.setStroke(new BasicStroke(5));
//		graphics2d.setColor(Color.blue);//outline
//		graphics2d.drawLine(0, 0,500, 500);
//
//		//for fill fillRect
//		graphics2d.fillRect(0, 0,100, 200);
		graphics2d.setColor(Color.RED);
		graphics2d.fillArc(0, 0, 100, 100, 0, 180);
		
		graphics2d.setColor(Color.WHITE);
		graphics2d.fillArc(0, 0, 100, 100, 180, 180);
		
	}
}
