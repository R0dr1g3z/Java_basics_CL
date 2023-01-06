package strings;

public class Main05 {
    public static void main(String[] args) {
        String[] arrTest = {"Test", "Polacz", "Te", "Wyrazy"};
        System.out.println(stringFromArray(arrTest));
    }

    public static String stringFromArray(String[] arr){
        String singleWord = "";
        for (int i = 0; i < arr.length; i++) {
            singleWord += arr[i];
        }
        return singleWord;
    }
}
