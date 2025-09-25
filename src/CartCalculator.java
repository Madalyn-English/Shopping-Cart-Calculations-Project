//Madalyn English

import java.util.Scanner;              
import java.text.DecimalFormat;
       
public class CartCalculator {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      //User inputs quantity
      System.out.println("Enter item quantity: ");
      int quantity = scan.nextInt();
      
      //User enters price of items
      System.out.println("Enter price of item: ");
      double price = scan.nextDouble();
      
      //User enters tax rate
      System.out.println("Enter tax rate "
              +          "(ex: if tax rate is 8.6% enter as 0.086): "); 
      double tax = scan.nextDouble();               
      
      //Formats the total to be two places after the decimal point
      DecimalFormat df = new DecimalFormat("$#.00");
      System.out.println("Total cost: " 
              +          df.format((quantity * price) * (tax + 1)));
    }
    
}
