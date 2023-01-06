package multiarrays;

import java.util.Arrays;

public class Main06 {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 2, 6},
            {6, 6, 6, 6, 1}
        };
        System.out.println("Less: " + lessMore(arr)[0]);
        System.out.println("More: " + lessMore(arr)[1]);
    }

    public static int[] lessMore(int[][] arr){
        int avg = 0;
        int count = 0;
        int[] lessMore = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                avg += arr[i][j];
                count++;
            }
        }
        avg /= count;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (avg > arr[i][j]){
                    lessMore[0]++;
                } else
                lessMore[1]++;
            }
        }
        return lessMore;
    }
}
