package javaGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Newwindow extends JFrame{
	 
	JLabel label=new JLabel("Helloo");
	
	public Newwindow()
	{
        label.setBounds(0,0,100,100);
        this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
		
	}

}

