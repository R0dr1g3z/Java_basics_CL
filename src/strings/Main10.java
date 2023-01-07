package strings;

public class Main10 {
    public static void main(String[] args) {
        
    }

    public static String encode(String str){
        String[] plain = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] cipher = {"v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"};
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(plain[i])){

            }
        }
        return "";
    }
}
