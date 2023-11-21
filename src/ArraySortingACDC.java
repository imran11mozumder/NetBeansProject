
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
public class ArraySortingACDC {
   public static void main(String[] args){
       
       Integer[] numbers = { 10, 20, 30, 40, 50, 2, 50, 1, 100, 05, 70, 40, 50, 65};
       System.out.println("The Mix val :");
       
       for (int num : numbers){
           System.out.println(num   + "  ");
       }
       
       Arrays.sort(numbers);
       System.out.println("The sorted Arr:  ");
       
       for ( int num : numbers ) {
           System.out.println(num  +  "  ");
       }
       
   }
   
   
    
}
