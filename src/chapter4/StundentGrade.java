package chapter4;

import java.util.Scanner;

public class StundentGrade {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ur score");

       int stundentGrade = scanner.nextInt();

        if (stundentGrade >= 80)System.out.println("u passed with an A");
        else
            if(stundentGrade >= 70)System.out.println("u passed with a B");
        else
            if(stundentGrade >= 60)System.out.println("u passed with a c");
        else
            if(stundentGrade >= 50)System.out.println("u passed with a d");
        else
            if(stundentGrade < 50)System.out.println("u failed with a f");
    }
}
