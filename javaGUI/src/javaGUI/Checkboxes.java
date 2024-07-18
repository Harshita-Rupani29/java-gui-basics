package javaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Checkboxes extends JFrame implements ActionListener  {
	 JCheckBox checkBox;
	 JButton button;
	 ImageIcon rIcon;
	 ImageIcon wIcon;
	public Checkboxes()
	{
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     this.setLayout(new FlowLayout());
	     checkBox=new JCheckBox();
	     button=new JButton("Only Bitches Don't Click");
	     checkBox.setText("You are ugly Bitch");
	     checkBox.setFocusable(false);
	     checkBox.setFont(new Font("CONSOLAS",Font.PLAIN,15));
	     rIcon=new ImageIcon("Right.png");
	     wIcon=new ImageIcon("Wrong.jpg");
	     checkBox.setIcon(wIcon);
	     this.add(button);
	    this.add(checkBox); 
	     this.pack();
	     this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button)
		{
			boolean ans=checkBox.isSelected()
;		}
	}

}
