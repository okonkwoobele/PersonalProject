import java.util.Arrays;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(lowestCommonMultiple(20)));
    }

    public static int[] lowestCommonMultiple(int number){
        int[] newArray = new int[number];
        int divider = 2;
        int counter = 0;
        while (number > 1) {
            if (number % divider == 0) {
                number = number / divider;
                newArray[counter] = divider;
                counter++;
            } else {
                divider++;
            }
        }
        return Arrays.copyOf(newArray, counter);
    }
}