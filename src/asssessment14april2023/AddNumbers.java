package asssessment14april2023;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("firstNumber=" + firstNumber);
        System.out.println("secondNumber=" + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("sum=" + sum);
        int difference = firstNumber - secondNumber;
        System.out.println("difference=" + difference);
        int multiplication = firstNumber * secondNumber;
        System.out.println("multiplication=" + multiplication);
        int square = firstNumber * firstNumber;
        System.out.println("square=" + square);
    }
}