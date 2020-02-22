/*
 * Amro Abdelrhman
 * Rounding Errors
 * 20/02/2020
 */
package numeric;
import javax.swing.*;
/**
 *
 * @author Amro
 */
public class Numeric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number");
        String num2 = input;                            //num2 is the answer inputted by the user
        Double num3 = Double.parseDouble(num2);
        Double number = Double.parseDouble(input);                               
        number = Math.sqrt(number);                     //square rooting the number inputted by the user 
        number = Math.pow(number, 2);                   //and then powering it again
        System.out.println("the square of the square of the number "+number+"");
        Double error = number - num3;                   //finding the error by subtracting after with before 
        double finalans = error/number ;                //this is the final answer
        
        System.out.println("the error is "+ finalans+"%");
    }
    
}