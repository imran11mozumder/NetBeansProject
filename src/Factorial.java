/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class Factorial {

//   public static int fact(int n){
    
   
    
    
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        int sum = 1;
        for (int i = 1; i <= n; i++){
            sum *= i ;
    }
    return sum;
    }  
    
     public static void main(String[] args){
         System.out.println("Factorial Number "  +  factorial(5));
     }
}

