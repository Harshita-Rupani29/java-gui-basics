package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTEXTfIELD extends JFrame implements ActionListener {
	JTextField kField;
	 JButton b;
	public JTEXTfIELD()
	{
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(new FlowLayout());
     kField=new JTextField();
      b=new JButton("Submitt");
     b.addActionListener(this);
     kField.setPreferredSize(new Dimension(100,40));
     kField.setCaretColor(Color.PINK);
     kField.setText("kutta");
     kField.setEditable(false);  //for button b.setEnable()
     
     this.add(b);
     this.add(kField);
    
     this.pack();
   
     this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ans=kField.getText();
		System.out.println(ans);
	}


}
