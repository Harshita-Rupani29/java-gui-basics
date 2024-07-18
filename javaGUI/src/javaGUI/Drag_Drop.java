package javaGUI;

import javax.swing.JFrame;

public class Drag_Drop extends JFrame {
	 
    DragPanel dragPanel;	
	public Drag_Drop()
	{
		dragPanel=new DragPanel();
		this.add(dragPanel);
		this.setTitle("Drag & Drop Tutorial");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
