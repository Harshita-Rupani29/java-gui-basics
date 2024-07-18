package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class d_2_AnimationsPanel extends JPanel implements ActionListener{

	final int PANEL_WIDTH=500;
	final int PANEL_HEIGHT=500;
 ImageIcon originalIcon ;
   ImageIcon backImage ;
   Image scaledImage;
   Image sbackImage;
   
   
   Timer timer;
   int xvelocity=1;
   int yvelocity=1;
   int x=0;
   int y=0;
	d_2_AnimationsPanel ()
	{
		
		originalIcon = new ImageIcon("snake.png");
	     
	     Image originalImage = originalIcon.getImage();

	     int scaledWidth = 100;
	     int scaledHeight = 100;
	    scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

	     
	     backImage = new ImageIcon("back.jpg");
	     
	     Image oImage = backImage.getImage();

	     int sWidth = 500;
	     int sHeight = 500;
	     sbackImage = oImage.getScaledInstance(sWidth, sHeight, Image.SCALE_SMOOTH);
	     
	     
	     this.setPreferredSize(new Dimension(500,500));
	     this.setBackground(Color.BLACK);
	     timer=new Timer(10,this);
	     timer.start();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d=(Graphics2D) g;
		g2d.drawImage(sbackImage, 0, 0, null);
		g2d.drawImage(scaledImage, x, y, null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x>=PANEL_WIDTH-scaledImage.getWidth(null) || x<0)
		{
			xvelocity*=-1;
		}
		// TODO Auto-generated method stub
		x=x+xvelocity;
		repaint();
		
	}
	
	
	
}
