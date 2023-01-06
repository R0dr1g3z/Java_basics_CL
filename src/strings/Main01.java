package strings;

public class Main01 {
    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        char str2 = str.charAt(str.length() - 2);
        int meter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str2){
                meter++;
            }
        }
        System.out.println(meter);
    }
}
