package asssessment14april2023;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no numbers:" );
        int number = scanner.nextInt();
        int[] numbers = new int[number];
        System.out.println("enter multiple numbers:" );
        for (int i=0; i< number; i++){
            numbers[i] =scanner.nextInt();
        }
        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 1; i < number; i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            }else if (numbers[i]> secondLargest && numbers[i] != largest ){
                secondLargest = numbers[i];
            }
        }
        System.out.println("The second largest number is " + secondLargest );
    }
}
