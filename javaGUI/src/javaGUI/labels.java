package javaGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class labels extends JFrame {
	public static void main(String[] args)
	{
		ImageIcon imgIcon=new ImageIcon("logo.jpg");
		Border border=BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label=new JLabel();
		label.setText("Bro do u even know how to code?");
		label.setIcon(imgIcon);
		label.setHorizontalTextPosition(JLabel.LEFT);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0X00FF00)); //set font color to green
		label.setFont(new Font("Mv Boli", Font.BOLD, 20));
		label.setIconTextGap(-76); //margin
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100, 100,250, 250);
		JFrame frame=new JFrame();
		frame.setTitle("My label gui");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		//frame.setLayout(null);  //by default layout is border layout , hence label takes entire page
		frame.setVisible(true);
		frame.pack();
		
		
	}
}
