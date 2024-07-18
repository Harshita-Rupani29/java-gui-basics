package javaGUI;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class D_2Graphics extends JFrame{
  
	ClassPanel cp;
	public D_2Graphics()
	{
		cp=new ClassPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(cp);
		this.pack();
		this.setLocationRelativeTo(null);  //Frame appear in middle of screen
		this.setVisible(true);
		
	}

}
