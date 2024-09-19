package no.hvl.dat100;

import javax.swing.JOptionPane;

public class En {

	public static void main(String [] args) {
	
		for (int i = 1; i <= 10; i++) {  
			String input = JOptionPane.showInputDialog("Skriv inn poengsummen din (0-100)");
			int poengsum = Integer.parseInt(input);
 
				if (poengsum < 0 || poengsum > 100) {
					JOptionPane.showMessageDialog(null, "Ugyldig poengsum. Poengsum må være mellom 0 og 100.");
					i--; 
	            } else if (poengsum >= 90) {
	                JOptionPane.showMessageDialog(null, "Karakter: A");
	            } else if (poengsum >= 80) {
	                JOptionPane.showMessageDialog(null, "Karakter: B");
	            } else if (poengsum >= 60) {
	                JOptionPane.showMessageDialog(null, "Karakter: C");
	            } else if (poengsum >= 50) {
	                JOptionPane.showMessageDialog(null, "Karakter: D");
	            } else if (poengsum >= 40) {
	                JOptionPane.showMessageDialog(null, "Karakter: E");
	            } else {
	                JOptionPane.showMessageDialog(null, "Karakter: F");
	        
	        }
	    }
	}
}