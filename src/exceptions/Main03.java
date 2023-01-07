package exceptions;

public class Main03 {
    public static void main(String[] args) {
        try {
            showLength(null);
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }

    static void showLength(String s) {
        System.out.println(s.length());
    }
}
