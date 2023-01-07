package exceptions;

public class Main01 {
    public static void main(String[] args) {
        try {
            System.out.println(factorial(4));
            System.out.println(factorial(-4));
        } catch (IllegalArgumentException e){
            System.out.println("Not less than 0");
        }
    }

    static int factorial(int number) {
        if (number < 0){
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
