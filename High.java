/*
 * Author:  Maria Linkins-Nielsen, mlinkinsniel2022@fit.edu
 * Course:  CSE 1002, Section 02, Spring 2023
 * Project: Proj 04, scanner
 */
import java.util.Scanner;

public class High {
   public static void main (final String[] args) {

      final Scanner scanner = new Scanner(System.in, "US-ASCII");
      int score = 0;
      int HIGH = 0;

      String first_name = " ";
      String last_name = " ";
      String max_firstname = " ";
      String max_lastname = " ";

      while (scanner.hasNext()) {

         first_name = scanner.next();
         last_name = scanner.next();
         score = scanner.nextInt();

         if (score > HIGH) {
            HIGH = score;
            max_firstname = first_name;
            max_lastname = last_name;
            
         }

      }

     
      System.out.print(max_firstname + " " + max_lastname + " " + HIGH);
      

   }

}
