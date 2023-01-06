package strings;

public class Main02 {
    public static void main(String[] args) {
        String testStr = "Time to change";
        char testC = 'c';
        char testC2 = 't';
        char testC3 = 'T';
        System.out.println(charPos(testStr, testC));
        System.out.println(charPos(testStr, testC2));
        System.out.println(charPos(testStr, testC3));
    }

    public static int charPos(String str, char c){
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)){
                return i;
            }
        }
        return 1;
    }
}
