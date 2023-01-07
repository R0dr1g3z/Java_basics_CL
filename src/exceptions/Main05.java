package exceptions;

public class Main05 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("xyz");
            Integer.parseInt("5");
        } catch (NumberFormatException e) {
            System.out.println("This isn't number");
        } finally {
            System.out.println(1);
        }
    }
}
