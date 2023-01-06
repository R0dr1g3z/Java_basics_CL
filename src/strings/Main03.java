package strings;

public class Main03 {
    public static void main(String[] args) {
        String testStr = "Return only half";
        System.out.println(firstHalf(testStr));
    }

    public static String firstHalf(String str){
        return str.substring(0, str.length() / 2);
        }
}
