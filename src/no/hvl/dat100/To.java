package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class To {

    public static void main(String[] args) {
        double inntekt = parseDouble(showInputDialog("Intekt?")); 

        double trinn1 = 1.7 / 100;
        double trinn2 = 4.0 / 100;
        double trinn3 = 13.6 / 100;
        double trinn4 = 16.6 / 100;
        double trinn5 = 17.6 / 100;

        double grense1 = 208050;
        double grense2 = 292851;
        double grense3 = 670001;
        double grense4 = 937901;
        double grense5 = 1350000;

        double sum = 0;

        if (inntekt < grense1) {
            showMessageDialog(null, "Du trenger ikke betale trinnskatt.");
        } else {
            if (inntekt > grense1) {
                double belop = inntekt - grense1;
                if (belop > (grense2 - grense1)) {
                    belop = grense2 - grense1;
                }
                sum += belop * trinn1;
            }

            if (inntekt > grense2) {
                double belop = inntekt - grense2;
                if (belop > (grense3 - grense2)) {
                    belop = grense3 - grense2;
                }
                sum += belop * trinn2;
            }

            if (inntekt > grense3) {
                double belop = inntekt - grense3;
                if (belop > (grense4 - grense3)) {
                    belop = grense4 - grense3;
                }
                sum += belop * trinn3;
            }

            if (inntekt > grense4) {
                double belop = inntekt - grense4;
                if (belop > (grense5 - grense4)) {
                    belop = grense5 - grense4;
                }
                sum += belop * trinn4;
            }

            if (inntekt > grense5) {
                double belop = inntekt - grense5;
                sum += belop * trinn5;
            }

            showMessageDialog(null, "Du skal betale " + sum + " i trinnskatt.");
        }
    }
}
