package javaGUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Jlayeredpane {
	public static void main(String[] args) {
		
		
		
		
	JLabel l1=new JLabel();
	l1.setOpaque(true);
	l1.setBackground(Color.RED);;
	l1.setBounds(50,50,200,200);
	
	JLabel l2=new JLabel();
	l2.setOpaque(true);
	l2.setBackground(Color.BLUE);;
	l2.setBounds(100,100,200,200);
	
	JLabel l3=new JLabel();
	l3.setOpaque(true);
	l3.setBackground(Color.GREEN);
	l3.setBounds(150,150,200,200);
	
	JLayeredPane pane=new JLayeredPane();
	pane.setBounds(0, 0, 500, 500);
//	pane.add(l1,JLayeredPane.DEFAULT_LAYER);or 
	pane.add(l1,Integer.valueOf(0));
	pane.add(l2,JLayeredPane.DEFAULT_LAYER);
	pane.add(l3,JLayeredPane.DRAG_LAYER);
	JFrame myFrame=new JFrame();
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myFrame.setTitle("J Layered Pane");
	myFrame.setSize(new Dimension(500,500));
	myFrame.setLayout(null);
	
	myFrame.setVisible(true);
	myFrame.add(pane);
	}
}
