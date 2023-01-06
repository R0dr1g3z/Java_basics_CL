package multiarrays;

import java.util.Arrays;

public class Main05 {
    public static void main(String[] args) {
        int[][] arr = {
            {4, 5, 6, 2, 3},
            {5, 5, 6, 1, -50}
        };
        System.out.println(Arrays.toString(minimum(arr)));
    }

    public static int[] minimum(int[][] arr){
        int[] minimumArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int minimumNumber = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minimumNumber){
                    minimumNumber = arr[i][j];
                }
                minimumArr[i] = minimumNumber;
            }
        }
        return minimumArr;
    }
}
