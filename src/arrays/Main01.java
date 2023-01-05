package arrays;

public class Main01 {
    public static void main(String[] args) {
        int[] mainTab = new int[50];
        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i;
        }
        for (int i = 0; i < mainTab.length; i++) {
            if (mainTab[i] < 10){
                System.out.print("0" + mainTab[i] + ", ");
            } else
            System.out.print(mainTab[i] + ", ");
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
