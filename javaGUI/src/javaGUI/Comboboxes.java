package javaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Comboboxes extends JFrame implements ActionListener {
	
	JComboBox comboBox;
	public Comboboxes()
	{
		String[] items = {"Item 1", "Item 2", "Item 3"};
		comboBox = new JComboBox(items);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout());
	    this.add(comboBox);
//	    comboBox.setEditable(true);
//	   System.out.println(comboBox.getItemCount()); 
	    comboBox.addItem("hehe");
	   comboBox.insertItemAt("hehe2", 1);
//	   comboBox.setSelectedIndex(2);
	    comboBox.removeItem("he");
	    comboBox.removeItemAt(1);
//	    comboBox.removeAllItems();
	    comboBox.addActionListener(this);
	    this.pack();
	    this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==comboBox)
		{
			System.out.println(comboBox.getSelectedItem());
		}
	}

}
