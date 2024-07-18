package javaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class radioButtons extends JFrame implements ActionListener{
	JRadioButton b1;
	JRadioButton b2;
	JRadioButton b3;
public radioButtons() {
	ButtonGroup g=new ButtonGroup();
	b1=new JRadioButton("Pizza");
	b1.addActionListener(this);
	b2=new JRadioButton("Burger");
	b2.addActionListener(this);
	b3=new JRadioButton("Sushi");
	b3.addActionListener(this);
	g.add(b1);
	g.add(b2);
	g.add(b3);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.pack();
    this.setVisible(true);}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		System.out.println("Bookha");
	}
	if(e.getSource()==b2)
	{
		System.out.println("aadmi");
	}
	if(e.getSource()==b3)
	{
		System.out.println("kahin k");
	}
	
}

}
