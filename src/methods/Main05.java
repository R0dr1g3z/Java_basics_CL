package methods;

public class Main05 {
    public static void main(String[] args) {
        System.out.println(calculateNetto(100, 10));
        System.out.println(calculateNetto(356, 22));
    }

    public static double calculateNetto(double gross, double vat){
        return (100 - vat) * gross / 100;
    }
}
