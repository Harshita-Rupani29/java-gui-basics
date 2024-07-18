package javaGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JColourChooser extends JFrame implements ActionListener  {
	
	JButton button;
	JLabel label;
	public JColourChooser()
	{
		button=new JButton("Pick a Color");
		label=new JLabel();
		
		label.setText("Change Me");
		label.setFont(new Font("MV Boli",Font.BOLD,100));
//		label.setBackground(Color.black);
//		
		button.addActionListener(this);
		
		this.add(button);
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if(e.getSource()==button)
	{
		JColorChooser hhh=new JColorChooser();
		 Color newColor=JColorChooser.showDialog(null, "Choose a Colr",Color.black);
		 
		 label.setForeground(newColor);
	}
		
	}
	

}
