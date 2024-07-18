package javaGUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtCounter extends Frame {
	
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;  
	
	public AwtCounter()
	{
		setLayout(new FlowLayout());
        // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
        // the components from left-to-right, and flow to next row from top-to-bottom.

     lblCount = new Label("Counter");  // construct the Label component
     add(lblCount);                    // "super" Frame container adds Label component

     tfCount = new TextField(count +""); // construct the TextField component with initial text
     tfCount.setEditable(false);       // set to read-only
     add(tfCount);                     // "super" Frame container adds TextField component

     btnCount = new Button("Count");   // construct the Button component
     add(btnCount);                    // "super" Frame container adds Button component

     btnCount.addActionListener(new BtnCountListener());  // anonymous instance
     // same as
     //BtnCountListener listener = new BtnCountListener();
     //btnCount.addActionListener(listener);
        // "btnCount" is the source object that fires an ActionEvent when clicked.
        // The source object adds an instance of BtnCountListener as an ActionEvent listener,
        //   which provides an ActionEvent handler called actionPerformed().
        // Clicking "Count" button calls back actionPerformed().

     setTitle("AWT Counter");  // "super" Frame sets its title
     setSize(300, 100);        // "super" Frame sets its initial window size

     // For inspecting the Container/Components objects
      System.out.println(this);
      System.out.println(lblCount);
      System.out.println(tfCount);
      System.out.println(btnCount);
     setVisible(true);         // "super" Frame shows
      System.out.println(this);
      System.out.println(lblCount);
      System.out.println(tfCount);
      System.out.println(btnCount);
  }

  // The entry main() method
  public static void main(String[] args) {
     // Invoke the constructor to setup the GUI, by allocating an instance
     AwtCounter app = new AwtCounter();
        // or simply "new AWTCounter();" for an anonymous instance
  }

  // Define an inner class to handle the "Count" button-click
  private class BtnCountListener implements ActionListener {
     // ActionEvent handler - Called back upon button-click.
     @Override
     public void actionPerformed(ActionEvent evt) {
        ++count; // Increase the counter value
        // Display the counter value on the TextField tfCount
        tfCount.setText(count + ""); // Convert int to String
     }
  }
}
