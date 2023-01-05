package arrays;

public class Main08 {
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3,};
        int testEle = 2;
        int testEle2 = 5;
        System.out.println(contains(testArr, testEle));
        System.out.println(contains(testArr, testEle2));
    }

    public static boolean contains(int[] arr, int element){
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                check = true;
                break;
            } else 
            check = false;
        }
        return check;
    }
}
