package externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main03 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("tarerat"));
        System.out.println(checkPalindrome("KiloliK"));
    }

    public static boolean checkPalindrome(String str){
        String data = str.toLowerCase();
        if (StringUtils.reverse(data).equals(data)){
            return true;
        }
        return false;
    }
}
