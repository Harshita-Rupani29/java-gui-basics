package javaGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Box.Filler;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {
 JFrame  frame=new JFrame();
 JProgressBar pBar=new JProgressBar(); //pass min and max range
 
 public ProgressBar()
 {
	 pBar.setValue(0);
	 pBar.setBounds(0,0,420,50);
	 pBar.setStringPainted(true);
	 pBar.setBackground(Color.BLACK);
	 pBar.setForeground(Color.RED);
	 pBar.setFont(new Font("Mv Boli",Font.BOLD,15));
	 frame.add(pBar);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setLayout(null);
	 frame.setSize(420,420);
	 frame.setVisible(true);
	 fill();
 }
 public void fill()
 {
	 int cnt=0;
	 while(cnt<=100)
	 {
		 pBar.setValue(cnt);
		 try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 cnt+=1;
	 }
	 pBar.setString("Done :)");
 }
}
