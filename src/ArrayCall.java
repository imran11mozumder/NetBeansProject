
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
public class ArrayCall {
//    
//
//    public static void main(String[] args) {
//        double[] myNumber = {10, 20, 30, 40, 50};
////        minVal(myNumber);
//         maxVal(myNumber);
//    }
//
//
//    
  
//   static int[] arr = new int[10];
//
//    public static void addval(String val) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Insert int val-");
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = input.nextInt();
//        }
//
//        double[] myNumber = {10, 20, 30, 40, 50};
//
////    }
//
//    public static void minVal(double[] myNumber) {
//        double min = myNumber[0];
//
//        for (int i = 1; i < myNumber.length; i++) {
//            if (myNumber[i] < min) {
//                min = myNumber[i];
//            }
//        }
//
//        System.out.println("Min Val:-" + min);
//    }
////    
//    public static void maxVal(double[] myNumber) {
//        double max = myNumber[0];
//
//        for (int i = 1; i < myNumber.length; i++) {
//            if (myNumber[i] < max) {
//                max = myNumber[i];
//          }
//      }
//        System.out.println("Max Val:- +max");
//    }
    
//    
//    public class SecondLargestNumber{
//        
//        public static int findSecondLargest(int[] arr){
//            if (arr.length<2){
//                System.out.println("This array should have at least two elements");
//                return -1;
//                
//            }
//            int firstLargest = Integer.MIN_VALUE;
//            int secondLargest = Integer.MIN_VALUE;
//            
//            for (int num : arr){
//                if (num > firstLargest ){
//                    secondLargest = firstLargest;
//                     firstLargest = num;
//                }
//                else if ( num > secondLargest && num ! = firstLargest ) {
//                
//                secondLargest = num;
//            }
//            }
//            return   secondLargest ;
//        
//        
//    }
//    public static int findSecondLargestUsingArrysMethod(int[]arr)
//    
    
//    for 
    
    
    
    
    
    
//    public static void main(String args0)
    
//   double[][] distances ={    
//       {0, 983, 787, 714, 1375, 967, 1087},     
//       {983, 0, 214, 1102, 1763, 1723, 1842},     
//       {787, 214, 0, 888, 1549, 1548, 1627},      
//       {714, 1102, 888, 0, 661, 781, 810},      
//       {1375, 1763, 1549, 661, 0, 1426, 1187},      
//       {967, 1723, 1548, 781, 1426, 0, 239},      
//       {1087, 1842, 1627, 810, 1187, 239, 0},
//       };
//
//   for (int i = 0; i < distances.length)
//    
//    
//    
//    
//    
    
   
//public class SortAsc {    
    public static void main(String[] args) {        
            
        //Initialize array     
        int [] arr = new int [] {10, 20, 30, 40, 50,2,50,1,100,05,70,40,50,65};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();        
    
    
    
    
}
    
//        //Displaying elements of array after sorting    
//        System.out.println("Elements of array sorted in ascending order: ");    
//        for (int i = 0; i < arr.length; i++) {     
//            System.out.print(arr[i] + " ");    
//        }    
//    } 
}    