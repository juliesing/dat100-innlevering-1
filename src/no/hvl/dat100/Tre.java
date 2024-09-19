package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Tre {

	public static void main(String [] args ) {

	        long n = Long.parseLong(showInputDialog("Skriv inn et heltall større enn 0:"));

	        if (n <= 0) {
	            showMessageDialog(null, "Feil: Tallet må være større enn 0.");
	        } else {
	            long fakultet = 1;
	            for (long i = 1; i <= n; i++) {
	                fakultet *= i;
	            }

	            showMessageDialog(null, n + "! = " + fakultet);
	        }
	  }
}
