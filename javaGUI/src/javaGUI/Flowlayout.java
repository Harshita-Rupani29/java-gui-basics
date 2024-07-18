package javaGUI;



import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flowlayout extends JFrame {
	
	public Flowlayout()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		
		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Flowlayout k=new Flowlayout();
      k.setVisible(true);
	}

}
