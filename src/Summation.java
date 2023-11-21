
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
public class Summation {
    
     public static void main(String[] args) {
         
//         Scanner scan = new Scanner(System.in);
//     int[] arr = new int[]{};
         
//         System.out.println("");
         
      int[][] arrays = {
          {1, 2, 3},
          {4, 5, 6}, 
          {7, 8, 9},
          {10, 11, 12} }; 
      
      int sum = 0;
      
      for (int i = 0; i < arrays.length; i++){
          
          for ( int j = 0; j< arrays[i].length; j++) {
               sum+= arrays[i][j];
          }
          
      }
         System.out.println("Sum----:" +sum);
      
      
     }
     
     
}
