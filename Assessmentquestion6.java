//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;
public class Assessmentquestion6{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = s.nextInt();

        System.out.print("Input second number: ");
        int num2 = s.nextInt();

        System.out.print("Input third number: ");
        int num3 = s.nextInt();

        System.out.println("Average of three numbers is: " + (num1 + num2 + num3) / 3);

    }
}