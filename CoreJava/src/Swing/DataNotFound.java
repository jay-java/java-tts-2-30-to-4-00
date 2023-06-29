package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DataNotFound {
	JLabel l1;
	DataNotFound(){
		JFrame fr = new JFrame("Alert");
		fr.setSize(300, 200);
		fr.setVisible(true);
		fr.setLayout(null);
		l1 = new JLabel("Data not Found");
		l1.setBounds(50, 75, 120, 20);
		fr.add(l1);
	}
	public static void main(String[] args) {
		new DataNotFound();
	}
}
