package arrays;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        int[] numbers = {4, 12, 24, 32, 45, 56, 66, 72, 86, 92};
        int[] reverse = new int[10];
        int variable = 9;
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = numbers[variable];
            variable--;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));
    }
}
