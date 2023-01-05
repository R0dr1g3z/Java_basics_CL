package arrays;

import java.util.Arrays;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        Random r = new Random();
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = r.nextInt(100);
        }
        Arrays.sort(randNumbers);
        System.out.println(randNumbers[0]);
    }
}
