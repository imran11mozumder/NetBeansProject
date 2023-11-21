
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class DatePractice {
    
 public static void main(String[] args){
    Date date = new Date();

    System.out.println (

    "The elapsed time since Jan 1, 1970 is "
            + date.getTime() + " milliseconds");
    System.out.println (date.toString());
     System.out.println(date.toString());
     System.out.println(date.getTime()/1000);
     System.out.println((date.getTime()/1000)/60);
     System.out.println(((date.getTime()/1000)/60)/60);
     System.out.println((((date.getTime()/1000)/60)/60)/24);
     System.out.println(((((date.getTime()/1000)/60)/60)/24)/365);
}
}