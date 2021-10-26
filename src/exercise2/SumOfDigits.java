package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      if (num >= 0 && num <= 999) {
        int a = num % 10;
        num /= 10;
        int b = num % 10;
        num /= 10;
        int c = num % 10;
        num /= 10;

        System.out.println("Sum of digits: " + ( a + b + c));
      } else { System.out.println("The number is not between 0 and 999");}


      
    }

}
