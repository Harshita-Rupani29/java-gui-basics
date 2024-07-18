package javaGUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders extends JFrame implements ChangeListener {
	JPanel p ;
	JLabel l ;
	JSlider s ;
	
	public Sliders()
	{
		p=new JPanel();
		l=new JLabel();
		s=new JSlider(0,100,50); //range start , range end , curr Knob
		p.setLayout(new FlowLayout());
		s.setPreferredSize(new Dimension(400,200));
		s.setPaintTicks(true);
		s.setMinorTickSpacing(10);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(25); //after every 25 units there is a major trick
		
		s.setPaintLabels(true);
		s.setFont(new Font("MV Boli",Font.BOLD,15));
		s.setOrientation(SwingConstants.VERTICAL);
		
		l.setText("°C "+s.getValue());
		s.addChangeListener(this);
		p.add(s);
		p.add(l);
		this.setTitle("Slider Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout());
	    this.add(p);
	    this.pack();
	    this.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		l.setText("°C "+s.getValue());
		
	}

}
