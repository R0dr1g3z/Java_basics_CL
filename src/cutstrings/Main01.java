package cutstrings;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
        String[] split = str.split(" ");
        System.out.println(Arrays.toString(split));
        for (String s : split){
            System.out.println(s);
        }
    }
}
