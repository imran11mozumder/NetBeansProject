/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class Arraysorting {

    public static void main(String args[]) {
        arraySortNormalOrder();

    }

    public static void arraySortNormalOrder() {

//        Integer[] arr = {5, -2, 23, 7, 87, -42, 509};
//          
//        System.out.println("The original array is:");
//        for (0)
//             
//            
//        
        int[] arr = new int[]{12, 5, 56, -2, 32, 2, -26, 9, 43, 94, -78};
        System.out.println("Array elements after sorting");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }

        
        
        
        
        
    }
    
    
    
    
}
