
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
public class ConditionalSum {
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        for (int i = 0; ; i++) {
            System.out.println("Enter Number");
          int x = scan.nextInt();
          if(x>-1){
          sum+=x;
          }
          else
              break;
        }
        System.out.println(sum);
    }
    
     
}
