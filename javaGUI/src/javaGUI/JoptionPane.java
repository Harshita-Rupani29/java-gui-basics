package javaGUI;

import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        JOptionPane.showMessageDialog(null, "HI Ssup Cutie?", "Saranghe", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "HI Ssup Cutie?", "Saranghe", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "HI Ssup Cutie?", "Saranghe", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "HI Ssup Cutie?", "Saranghe", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "HI Ssup Cutie?", "Saranghe", JOptionPane.WARNING_MESSAGE);
//		
//		int ans=JOptionPane.showConfirmDialog(null, "Cute", "Ugly ", JOptionPane.YES_NO_OPTION);
//		if(ans==1)
//		{
//			JOptionPane.showMessageDialog(null, "You are", "Page", JOptionPane.INFORMATION_MESSAGE);
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "I Know That", "Page", JOptionPane.INFORMATION_MESSAGE);
//		}
//        }
//	String ans=JOptionPane.showInputDialog("What");
//	if(Integer.parseInt(ans)==0)
//	{
//		JOptionPane.showMessageDialog(null, "Liar ", "Liar", JOptionPane.INFORMATION_MESSAGE);
//	}
//	else {
//		JOptionPane.showMessageDialog(null, "I Know u were ", "B", JOptionPane.INFORMATION_MESSAGE);
		
	//}
	
	String[] optStrings= {"yes","Big yes"};
	int ans=JOptionPane.showInternalOptionDialog(null, "I Love You", "Proposal Pop Up", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optStrings, optStrings);
	System.out.println(ans);
}
}