package methods;

public class Main07 {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(22));
        System.out.println(checkEvenOdd(17));
    }

    public static String checkEvenOdd(int number){
        if (number % 2 == 0){
            return "even";
        } else
        return "odd";
    }
}
