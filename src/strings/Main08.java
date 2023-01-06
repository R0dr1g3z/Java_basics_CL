package strings;

public class Main08 {
    public static void main(String[] args) {
        String str = "TaK";
        String str2 = "ToGGle THis";
        System.out.println(toogleChar(str));
        System.out.println(toogleChar(str2));
    }

    public static String toogleChar(String str){
        String toogleStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                toogleStr += Character.toLowerCase(str.charAt(i));
            } else
            toogleStr += Character.toUpperCase(str.charAt(i));
        }
        return toogleStr;
    }
}
