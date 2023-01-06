package cutstrings;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        String str = "Testowe-zdanie-do-podziału";
        String separator = "-";
        System.out.println(Arrays.toString(onlyTwoElements(str, separator)));
    }
    
    public static String[] onlyTwoElements(String str, String separator){
        return str.split(separator, 2);
    }
}
