package javaGUI;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayout extends JFrame{

	public Gridlayout() {
		// TODO Auto-generated constructor stub
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,500);
	this.setLayout(new GridLayout(10,4));  //grid layout tries to maintain same number of rows as mentioned by user
	
	
    for (int i = 1; i <= 10; i++) {
        this.add(new JButton(String.valueOf(i)));
    }
	
   }
public static void main(String[] args) {
	// TODO Auto-generated method stub
  Gridlayout k=new Gridlayout();
  k.setVisible(true);
}

}
