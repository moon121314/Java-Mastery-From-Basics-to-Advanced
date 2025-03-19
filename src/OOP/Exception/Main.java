package OOP.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         try{
             System.out.println("enter a number");
             int number = scanner.nextInt();
             System.out.println(number);
         }
         catch (Exception e){
             System.out.println("moon");
         }
    }
}
