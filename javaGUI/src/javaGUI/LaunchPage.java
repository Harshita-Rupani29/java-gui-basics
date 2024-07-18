package javaGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage extends JFrame implements ActionListener{
	JButton b=new JButton();
	public LaunchPage() {
		// TODO Auto-generated constructor stub
		b.setBounds(100,160,200,40);
		b.setFocusable(false);
		b.setText("New Button");
		b.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
		this.add(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
			
		{ this.dispose();
			Newwindow wNewwindow= new Newwindow();}
		
	}

}
