package countfactors;

import java.util.*;

/**
 * This Program Identifies and Counts the Num of Factors of a Given Positive Integer
 * @author Vivian
 */
public class CountFactors {

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner S = new Scanner(System.in);
        int number = S.nextInt();

        int count = 0;
        System.out.print("1"); // Solves Fencepost Problem with Commas
        // Identifies and Counts Factors
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print("," + i);
                count++;
            }
        }
        System.out.println("\t" + number + " has " + count + " factors!");
    }

}
