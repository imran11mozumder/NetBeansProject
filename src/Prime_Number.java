
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Prime_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        int num = input.nextInt();
        int count = 0;

        if (!(num < 2)) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        } else {
            count++;
        }

        if (count == 0) {
            System.out.println("The number " + num + " is a prime Number");
        } else {
            System.out.println("The number " + num + " is not a prime number");
        }
    }
}


