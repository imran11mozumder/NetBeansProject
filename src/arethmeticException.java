/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class arethmeticException {
    
     public static void main(String[] args) {
         
    }

    public static void arethmeticException(int a, int b) {
        try {
            int result = a / b; //a=10, b=0
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Cleanup code: This will always execute.");
        }

    }

}
