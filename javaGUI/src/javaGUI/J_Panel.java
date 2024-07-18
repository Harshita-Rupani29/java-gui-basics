package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class J_Panel {

	public static void main(String[] args) {
        // Resize the image
		 ImageIcon originalIcon = new ImageIcon("tup.png");
        Image img = originalIcon.getImage();
        Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);

        // Create a label and set the resized image
        JLabel label = new JLabel();
        label.setIcon(scaledIcon);
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,75,80);
        
		JPanel rp=new JPanel();
		rp.setBackground(Color.RED);
		rp.setBounds(0, 0, 250, 250);
		
		
		JPanel bp=new JPanel();
		bp.setBackground(Color.BLUE);
		bp.setBounds(250, 0, 250, 250);
		
		JPanel gp=new JPanel();
		gp.setBackground(Color.GREEN);
		gp.setBounds(0, 250, 500, 250);
		gp.setLayout(null);
		gp.add(label);
		
		JFrame frame=new JFrame();
		frame.setTitle("My Panel gui");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(rp);
		frame.add(bp);
		frame.add(gp);
		frame.setVisible(true);
	

	}

}
