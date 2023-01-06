package strings;

public class Main07 {
    public static void main(String[] args) {
        String str = "kajak";
        String str2 = "Kobyła ma mały bok";
        String str3 = "Not palin";
        System.out.println(palinStr(str));
        System.out.println(palinStr(str2));
        System.out.println(palinStr(str3));
    }

    public static boolean palinStr(String str){
        String changeStr = str.toLowerCase().replaceAll(" ", "");
        String reverse = new StringBuilder(changeStr).reverse().toString();
        if (changeStr.equals(reverse)){
            return true;
        } else
        return false;
    }
}
