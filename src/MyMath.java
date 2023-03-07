/**
 * @author Jason Carr
 * @author Trevor Hartman
 * @date 03/06/2023
 * @since ver 1.0
 */

import java.util.Scanner;

public class MyMath {

    private final static Scanner s = new Scanner(System.in);

    public static void greatestCommonFactor() {
        int c;
        System.out.println("This will calculate the greatest common factor of 2 numbers.");
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        System.out.print("Enter another number: ");
        int b = s.nextInt();
        System.out.printf("The greatest common factor of %s and %s is: ", a , b);
        while (b != 0) {
            if (a > b) {
                c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        greatestCommonFactor();
    }
}
