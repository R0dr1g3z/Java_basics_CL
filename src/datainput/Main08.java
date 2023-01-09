package datainput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedArray()));
    }

    public static int[] sortedArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile wylosowac liczb?");
        int[] arr = new int[scan.nextInt()];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        Arrays.sort(arr);
        return arr;
    }
}
