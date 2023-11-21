
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class ArrList {
    
    
     public static void main(String[] args){
         
         
         
//         intArr.add
         
         ArrayList<String> intArr = new ArrayList<>();
         intArr.add("abc@gmail.com");
         intArr.add("abcgmail.com");
         intArr.add("aaa@gmail.com");
         intArr.add("dfg@gmail.com");
         intArr.add("jkl@gmail.com");
         intArr.add("ghj@gmail.com");
         intArr.add("abc@gmailcom");
         intArr.add("abc@gmail.com");
         intArr.add("uiop@gmailcom");
         
         
                  for (int i = 0; i < intArr.size(); i++) {

             if (intArr.get(i).contains("@") && intArr.get(i).contains(".")) {
                 System.out.println("True   " + intArr.get(i));

             } else {
                 System.out.println("False  " + intArr.get(i));

             }

         }
          
//
//        intArr.forEach((val))  ->{
//         
//         boolean v1 
     }

        
     }
    

