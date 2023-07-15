package jenniferAssignment;

public class SquareAndCubeTable {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        System.out.println("-----------------------");

        for (int number = 0; number <= 10; number++) {
            int square = number * number;
            int cube = number * number * number;

            System.out.printf("%d\t%d\t%d\n", number, square, cube);
        }
    }
}

}
