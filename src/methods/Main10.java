package methods;

public class Main10 {
    public static void main(String[] args) {
        System.out.println(footbalWin(2, 1, 2, 1));
        System.out.println(footbalWin(1, 2, 1, 2));
        System.out.println(footbalWin(1, 1, 3, 3));
        System.out.println(footbalWin(3, 3, 1, 1));
        System.out.println(footbalWin(2, 2, 2, 2));
    }

    public static String footbalWin(int hostGoalsA, int guestGoalsB, int guestGoalsA, int hostGoalsB){
        int teamA = hostGoalsA + guestGoalsA;
        int teamB = hostGoalsB + guestGoalsB;
        if (teamA > teamB){
            return "Winners: Team A";
        } else if (teamB > teamA){
            return "Winners: Team B";
        } else if (guestGoalsA > guestGoalsB){
            return "Winners: Team A";
        } else if (guestGoalsB > guestGoalsA){
            return "Winners: Team B";
        } else
        return "DRAW";
    }
}
