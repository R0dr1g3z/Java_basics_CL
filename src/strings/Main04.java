package strings;

public class Main04 {
    public static void main(String[] args) {
        String test1 = "Zawiera";
        String test3 = "Też zawiera";
        String test4 = "tez Zawiera";
        System.out.println(containsStr(test4, test1));
        System.out.println(containsStr(test3, test1));
        System.out.println(test4.contains(test1));
    }

    public static boolean containsStr(String str, String search){
        return str.contains(search);
    }
}
