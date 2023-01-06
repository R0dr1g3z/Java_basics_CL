package strings;

public class Main06 {
    public static void main(String[] args) {
        String test = "Reverse this";
        String test2 = new StringBuilder(test).reverse().toString();
        System.out.println(test2);
    }
}
