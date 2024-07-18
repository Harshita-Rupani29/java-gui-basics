package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Borderlayout extends JFrame
{
	public Borderlayout()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
	    //this.setLayout(new BorderLayout());  not necessary line to add
		this.setLayout(new BorderLayout(10,10));  //add margins between components
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel(); 
		JPanel panel3=new JPanel(); 
		JPanel panel4=new JPanel(); 
		JPanel panel5=new JPanel(); 
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.GREEN);
		panel3.setBackground(Color.YELLOW);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		
		panel1.setPreferredSize(new Dimension(100,100));  //noaffect on width but height
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		 
		
	  // subpanels
		JPanel panel6=new JPanel();
		JPanel panel7=new JPanel(); 
		JPanel panel8=new JPanel(); 
		JPanel panel9=new JPanel(); 
		JPanel panel10=new JPanel(); 
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.DARK_GRAY);
		panel8.setBackground(Color.GRAY);
		panel9.setBackground(Color.LIGHT_GRAY);
		panel10.setBackground(Color.WHITE);
		
		
		panel5.setLayout(new BorderLayout());
		
		panel6.setPreferredSize(new Dimension(50,50));  //noaffect on width but height
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel5.add(panel8, BorderLayout.WEST);
        panel5.add(panel9, BorderLayout.EAST);
        panel5.add(panel10, BorderLayout.CENTER);

		
		
		
	// subpanels	
		
		
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);
        this.add(panel3, BorderLayout.WEST);
        this.add(panel4, BorderLayout.EAST);
        this.add(panel5, BorderLayout.CENTER);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Borderlayout k=new Borderlayout();
		k.setVisible(true);
	}

}
