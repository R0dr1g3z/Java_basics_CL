package arrays;

import java.util.Arrays;

public class Main07 {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3};
        System.out.println(Arrays.toString(append(testArray)));
    }

    public static int[] append(int[] arr){
        int[] copyArr = Arrays.copyOf(arr, arr.length * 2);
        int variable = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            copyArr[variable] = arr[i];
            variable++;
        }
        return copyArr;
    }
}
