package javaGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons_Gui extends JFrame {
JButton b;
JLabel l;
public Buttons_Gui() {
	// TODO Auto-generated constructor stub
	 ImageIcon originalIcon = new ImageIcon("tup2.jpg");
     Image img = originalIcon.getImage();
     Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
     ImageIcon scaledIcon = new ImageIcon(scaledImg);

	b=new JButton();
	l=new JLabel();
	l.setBounds(0, 0, 150, 150); 
	l.setIcon(scaledIcon);
	l.setVisible(false);
	
	b.setBounds(100, 50, 150, 150); 
	b.addActionListener(e->{l.setVisible(true);  //b.setEnabled(false) ek baar click karne k badd button nahi chalega
});
	b.setText("I am a Button");
	b.setFocusable(false);
	b.setIcon(scaledIcon);
	b.setHorizontalTextPosition(JButton.CENTER);
	b.setVerticalTextPosition(JButton.BOTTOM);
	b.setFont(new Font("Comic sans",Font.BOLD,12));
	b.setForeground(Color.CYAN);
	b.setBackground(Color.DARK_GRAY);
	b.setBorder(BorderFactory.createEtchedBorder());
	
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,500);
	this.setLayout(null);
	this.setVisible(true);
	this.add(b);
	this.add(l);
}
//@Override
//public void actionPerformed(ActionEvent e) {
//	// TODO Auto-generated method stub
//	if(e.getSource()==b)
//	{
//		System.out.println("Poo");
//	}
//	
//}
}
