package javaGUI;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class Keybindings {
	JFrame jFrame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	public Keybindings()
	{
	  jFrame=new JFrame();
	  jFrame.setSize(420,420);
	  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  
	  
	  
	  
	  
	  label=new JLabel();
	  label.setBackground(Color.red);
	  label.setBounds(100,100,100,100);
	  label.setOpaque(true);
	  
	  
	  upAction=new UpAction();
	  downAction=new DownAction();
	  leftAction=new LeftAction();
	  rightAction=new RightAction();
	  
	  
	  
	  label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
	  label.getActionMap().put("upAction", upAction);
	  
	  label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
	  label.getActionMap().put("leftAction", leftAction);
	  
	  label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
	  label.getActionMap().put("downAction", downAction);
	  
	  label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
	  label.getActionMap().put("rightAction", rightAction);
	  jFrame.add(label);
	  
	  
	  jFrame.setLayout(null);
	  jFrame.setVisible(true);
	  
	}
	public class UpAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(),label.getY()-10);
			
		}
		
	}
	public class DownAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(),label.getY()+10);
			
		}
		
	}
	public class LeftAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()-10,label.getY());
			
		}
		
	}
	public class RightAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()+10,label.getY());
			
		}
		
	}


}
