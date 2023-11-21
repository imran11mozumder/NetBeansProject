/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class Helper {
    static int Multiply(int a, int b){
        return a * b;
    }
    
    static double Multiply(double a, double b){
        return a* b;
    }
    
    public static void main(String[]args){
        System.out.println(Helper.Multiply(2,2));
        System.out.println(Helper.Multiply(5.5,5.5));
    }
}
