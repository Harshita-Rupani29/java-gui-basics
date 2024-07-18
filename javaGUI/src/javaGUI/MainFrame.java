package javaGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
public MainFrame() {
	// TODO Auto-generated constructor stub
	
  
    this.setTitle("This is me using java GUI");
    this.setSize(400, 300);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    ImageIcon imgIcon=new ImageIcon("logo.jpg");
    this.setIconImage(imgIcon.getImage());
    this.getContentPane().setBackground(new Color(23,45,67));
}
}
