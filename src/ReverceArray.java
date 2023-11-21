
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class ReverceArray {
    
    
    
     public static void main(String[] args){
         
         String str  = "Hello";
         
         
         
         for (int i = str.length()-1; i >= 0;i--){
             System.out.print(str.charAt(i));
         }
         
         
         System.out.println("");
         
         
         
         
         int[] ar ={100, 700, 505 , 903, 402, 6, 77, 80};
         
         
         
         Arrays.sort(ar);
       System.out.println("The sorted Arr:  ");
       
       for ( int num : ar ) {
           System.out.println(num  +  "  ");
     }
}

}