package javaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JFrame implements ActionListener {
	JMenuItem loadItem;	
	JMenuItem saveItem;		
	JMenuItem exitItem;	
	public MenuBar()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar mb=new JMenuBar();
		JMenu fileJMenu=new JMenu("File");
		JMenu editJMenu=new JMenu("Edit");
		JMenu healpJMenu=new JMenu("Help");
		
		mb.add(fileJMenu);
		mb.add(editJMenu);
		mb.add(healpJMenu);
		
		loadItem=new JMenuItem("Load");	
		saveItem=new JMenuItem("Save");		
		exitItem=new JMenuItem("Exit");	
		
		
		fileJMenu.add(loadItem);
		fileJMenu.add(saveItem);
		fileJMenu.add(exitItem);
		
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		
		
		
		fileJMenu.setMnemonic(KeyEvent.VK_F);
		editJMenu.setMnemonic(KeyEvent.VK_E);
		healpJMenu.setMnemonic(KeyEvent.VK_H);
		
		
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		this.setJMenuBar(mb);// try   this.add(mb)
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loadItem)
		{
			System.out.println("**** Loading a file ****");
		}
		if(e.getSource()==saveItem)
		{
			System.out.println("**** Saving a file ****");
		}
		if(e.getSource()==exitItem)
		{
			System.out.println("**** Exiting ****");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(100);
		}
		
	}
	

}
