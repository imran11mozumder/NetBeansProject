/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_java_application;

import java.util.Scanner;

/**
 *
 * @author C5
 */
public class DataType {
    
//    Data type
    
//    Integer var57 = 100;
    Integer var57 = 100;
    public static Integer testMethod(){
        Integer var55 =80;
        System.out.println(var55);
        return var55;
        
    }
    public void testMethod2 ( Integer num){
        
        System.out.println(var57);
    }
 public static void main(String[]args){
     testMethod();
     
     
     DataType dt = new DataType();
     System.out.println(dt.var57);
     dt.testMethod2(500);
     System.out.println(dt.var57);
     
     System.out.println("     J     A     V    V     A");
//     System.out.println("");
     
//IF else operation
       int a = 2;
       int b = 3;
        
       if ( a > b) {
           
           System.out.println("Condition 1 satisfied");
            } else if (400>500){
                System.out.println("Condition 2 satisfied");
            } else{
                System.out.println("Condition 3 satisfied");
            }
       
//       for (int i = 1; i <= 20; i+=2){
//           System.out.println(i);
//       }
//       
//   Do
    int i = 0;
    do {
        System.out.println("Printed"+i);
        i++;
    }
   while (i<=10);
    
    while (i <=10){
        System.out.println("---"+i);
        i++;
    }
     
//    Nested loop
for (int m = 1; m <=5; m++){
    System.out.println("Class " + m);
    for (int j = m; j <= 5; j++){
        System.out.println(" Student " + j);
    }
}
  

//         String Array t For loop

          String [] cars = {"Volvo", "BMW","Ford", "Mazda"};
          
          for (String var: cars){
              if (var.equals("BMW")){
              break;
              }
              System.out.println(var);
          }
     
          
          
          
          
          
          
 } 
 
    
//   Scanner input = new Scanner(System.in);
  
      
    
 }
