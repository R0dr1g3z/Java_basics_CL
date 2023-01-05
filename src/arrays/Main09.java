package arrays;

import java.util.Arrays;

public class Main09 {
    public static void main(String[] args) {
        int[] testArray = { 1, 1, 2, 3, 3, 4 };
        System.out.println(Arrays.toString(returnUnique(testArray)));
    }

    public static int[] returnUnique(int[] arr) {
        int[] arrReturn = new int[1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arrReturn[j] == arr[j]) {
                    arrReturn = Arrays.copyOf(arrReturn, arrReturn.length + 1);
                    arrReturn[i] = arr[j];
                    break;
                }
            }

        }
        return arrReturn;
    }
}
