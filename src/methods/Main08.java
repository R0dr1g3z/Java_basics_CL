package methods;

public class Main08 {
    public static void main(String[] args) {
        System.out.println(maxOfThree(12, 15, 17));
        System.out.println(maxOfThree(25, 26, 20));
        System.out.println(maxOfThree(30, 15, 12));
    }

    public static int maxOfThree(int number1, int number2, int number3){
        if (number1 > number2 && number1 > number3) {
            return number1;  
        } else if (number2 > number3){
            return number2;
        } else
        return number3;
    }
}
