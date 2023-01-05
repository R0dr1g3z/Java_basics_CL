package methods;

public class Main04 {
    public static void main(String[] args) {
        System.out.println(createName("Tomek", "Kwiatkowski", "Gidon"));
    }

    public static String createName(String name, String surname, String nickname){
        return name + " " + nickname + " " + surname;
    }
}
