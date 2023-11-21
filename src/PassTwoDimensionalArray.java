
import java.lang.reflect.Array;
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
public class PassTwoDimensionalArray {
    
    public static void main(String[] args){
//        System.out.println("Hello Bangladesh");

    int [][] arr = getArray();
        int[][] Array;
     
        System.out.println("Sum of Array:  " +getSum(Array));
        
    }
    
    public static int[][]getArray(){
        
        int[][] m = new int [3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter" + m.length + "rows and "  +m[0].length + " colums: ");
        for ( int row = 0; row < m.length; row++){
            for (int colum = 0; colum < m[row].length;colum++){
                m[row][colum] = input.nextInt();
                
            }
        }
        return m;
    }
    public static int getSum(int[][]arrays){
        int sum = 0;
        for (int i = 0; i < arrays.length; i++){
            for (int j =0; j< arrays.length; j++){
                sum+= arrays[i][j];
            }
            return sum;
        }
    }
}
