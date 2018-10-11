package digitsum;

import java.util.*;
import Java.lang.*;

/**
 * This Program Sums Up the Numbers Present Within a Given Integer (i.e. 42 -> 6, -123 -> 6)
 * @author Vivian
 */
public class DigitSum {

    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println("The number you entered is " + number + '.');
        
        // Solve Cases of Negative Integers by Taking Absolute Value
        if (number < 0) {
            number = Math.abs(number);
        }
        
        // Keeps Track of Sum as each Number Within the Integer is Read and Removed.
        int sum = 0;       
        while(number != 0){
            sum = (number % 10) + sum;
            number = number/10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
    
}
