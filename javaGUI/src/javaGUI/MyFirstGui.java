package javaGUI;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;

public class MyFirstGui extends Frame {
	
	public MyFirstGui()
	{
		setTitle("THIS IS My First GUI");
		setSize(400, 300);
		Panel p=new Panel();
		Button b=new Button("Click on me");
		p.add(b);
		add(p);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
	}
	 

	public static void main(String[] args) {
		
        MyFirstGui myFirstGui = new MyFirstGui();

        myFirstGui.setVisible(true);
	}

}
