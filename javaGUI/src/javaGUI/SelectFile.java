package javaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class SelectFile extends JFrame implements ActionListener{
	
	
	
	JButton button;
	
	public SelectFile()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button=new JButton("Select a file");
		button.addActionListener(this);
		this.add(button);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}
   
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button)
		{
			JFileChooser fChooser=new JFileChooser();
			fChooser.setCurrentDirectory(new File("."));  //curr project directory
//			int res=fChooser.showOpenDialog(null);
			int res=fChooser.showSaveDialog(null);
			
			if(res==JFileChooser.APPROVE_OPTION)
			{
				File f=new File(fChooser.getSelectedFile().getAbsolutePath());
			}
			
		}
		
	}

}
