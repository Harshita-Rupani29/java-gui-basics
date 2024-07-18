package javaGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Keylisterner extends JFrame implements KeyListener {
	
	JLabel label;
	ImageIcon icon;
 public Keylisterner()
 {
	 ImageIcon originalIcon = new ImageIcon("snake.png");
     
     Image originalImage = originalIcon.getImage();

     int scaledWidth = 100;
     int scaledHeight = 100;
     Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

     // Create a new ImageIcon with the scaled image
     ImageIcon scaledIcon = new ImageIcon(scaledImage);
	 label=new JLabel();
	 label.setBounds(0,0,100,100);
	 label.setIcon(scaledIcon);
	
//	 label.setBackground(Color.RED);
//	 label.setOpaque(true);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.add(label);
	 this.setSize(500,500);
	 this.addKeyListener(this);
	 this.setLayout(null);
	 this.setVisible(true);
 }

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	//Invoke when a key is Typed , uses keyChar() char output
	
	switch (e.getKeyChar()){
	case 'l': {
		label.setLocation(label.getX()-10, label.getY());
		break;
	}
	case 'r': {
		label.setLocation(label.getX()+10, label.getY());
		break;
	}
	case 'u': {
		label.setLocation(label.getX(), label.getY()-10);
		break;
	}
	case 'd': {
		label.setLocation(label.getX(), label.getY()+10);
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + e.getKeyChar());
	}
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	//Invoke when a key is Pressed , uses keyCode() int output
	switch (e.getKeyCode()){
	case 37: {
		label.setLocation(label.getX()-10, label.getY());
		break;
	}
	case 39: {
		label.setLocation(label.getX()+10, label.getY());
		break;
	}
	case 38: {
		label.setLocation(label.getX(), label.getY()-10);
		break;
	}
	case 40: {
		label.setLocation(label.getX(), label.getY()+10);
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + e.getKeyChar());
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	// Called whenever a button is released
//	System.out.println("Char Pressed  "+e.getKeyChar());
//	System.out.println("Code  of Char"+e.getKeyCode());

}}
