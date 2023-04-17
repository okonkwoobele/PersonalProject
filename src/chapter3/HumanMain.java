package chapter3;

import java.util.Scanner;

public class HumanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human austine = new Human();
        System.out.println("enter skin colour");
        String skinColour = scanner.nextLine();
        austine.setSkinColour(skinColour);
        System.out.println(austine.getSkinColour());
    }
}
