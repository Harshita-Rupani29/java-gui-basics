package javaGUI;

import javax.swing.JFrame;

public class d_2_Animations extends JFrame{
	
	d_2_AnimationsPanel p;
	
	d_2_Animations()
	{
		p=new d_2_AnimationsPanel();
		this.add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

}
