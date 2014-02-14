package demo.training;

import javax.swing.JOptionPane;

public class OddEven {
 
    private int userInput; 
 
    public OddEven() {
    }
 
    public static void main(final String[] args) {
       OddEven number = new OddEven();
       number.showDialog();
    }
 
    public void showDialog() {
        try {
            userInput = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number."));
            calculate();
        } catch (final NumberFormatException e) {
            System.err.println("ERROR: Invalid input. Please type in a numerical value.");
        }
    }

    private void calculate() {
        if ((userInput % 2) == 0) {
            JOptionPane.showMessageDialog(null, "Even");
        } else {
            JOptionPane.showMessageDialog(null, "Odd");
        }
    }
}
