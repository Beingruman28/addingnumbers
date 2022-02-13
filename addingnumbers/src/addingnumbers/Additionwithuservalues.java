package addingnumbers;

import java.util.Scanner;
 
public class Additionwithuservalues {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Two Numbers (Press Enter after each):");
   //two variables to hold numbers
   double n1, n2, n3;
   n1 = sc.nextDouble();
   n2 = sc.nextDouble();
   n3 = n1 + n2;
   System.out.println("Total = " + n3);
  }
  
}