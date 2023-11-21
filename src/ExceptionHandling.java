
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        try {
//
//            int x, y, result;
//            x = input.nextInt();
//            y = input.nextInt();
//
//            result = x / y;
//            System.out.println("Sum of x & y is :  " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException Exception" + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Exception  " + e.getMessage());
//        } finally {
//            System.out.println("Continue Exection Finally");
//
//        }
    }

    public static void arrayException() {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 5;
        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } finally {
            System.out.println("Cleanup code: This will always execute.");
        }
    }
    
    
    
    
    
    
    
}
