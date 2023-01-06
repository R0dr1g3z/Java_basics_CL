package cutstrings;

public class Main03 {
    public static void main(String[] args) {
        String str = "Domek na drzewie";
        String str2 = "Siedzimy wszyscy, razem w karczmie";
        String str3 = "Wielkie    przerwy    pomiędzy";
        System.out.println(countTokens(str));
        System.out.println(countTokens(str2));
        System.out.println(countTokens(str3));
    }

    public static int countTokens(String str){
        String[] split = str.split("\\s+");
        return split.length;
    }
}
