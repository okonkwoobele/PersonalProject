package chapter3;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car benz = new Car();
        System.out.println("Enter car colour");
        String carColour = scanner.nextLine();
        benz.setCarColour(carColour);
        System.out.println(benz.getCarColour());
    }
}
