package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame f;
	JPanel p;
	JButton an;
	JButton vn;
	public static void main(String[] args) {
	new GuestBook().createUIC();
		}
	void createUIC() {
		 f = new JFrame();
		 p = new JPanel();
		 an = new JButton();
		 vn = new JButton();
			f.add(p);
			p.add(an);
			p.add(vn);
			an.setText("Add Name");
			vn.setText("View Names");
		    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		    f.setVisible(true);
		    f.pack();
		    an.addActionListener(this);
		    vn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (this.equals(an)) {
			String names = JOptionPane.showInputDialog("Name Please");
		}
	
		
	}
}
