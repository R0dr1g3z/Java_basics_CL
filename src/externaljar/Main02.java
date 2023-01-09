package externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(toogleChar("SWAP this"));
    }

    public static String toogleChar(String str){
        return StringUtils.swapCase(str);
    }
}
