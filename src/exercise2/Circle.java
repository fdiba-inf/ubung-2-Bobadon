package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double C = 2 * Math.PI * r;
      double A = Math.PI * Math.pow(r,2.0);
      System.out.println("Circumference: " + C);
      System.out.println("Area: " + A);
      
    }

}
