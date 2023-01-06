package strings;

public class Main09 {
    public static void main(String[] args) {
        String[] arr = { "kurwa", "ja pierdole", "szmata" };
        String str = "Co za szmata";
        String str2 = "Kurwa jebana";
        System.out.println(censor(str, arr));
        System.out.println(censor(str2, arr));
    }

    public static String censor(String str, String[] words) {
        String[] split = str.toLowerCase().split("\\s+");
        String returnStr = "";
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (split[i].equals(words[j])) {
                    split[i] = "****";
                }
            }
        }
        for (String s : split) {
            returnStr += s + " ";
        }
        return returnStr;
    }
}
