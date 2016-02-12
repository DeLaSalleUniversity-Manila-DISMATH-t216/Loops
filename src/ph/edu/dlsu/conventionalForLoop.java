package ph.edu.dlsu;

public class conventionalForLoop {

    static private String[] days =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {

        for (int i = 0; i < days.length ; i++){
            System.out.println(days[i]);
        }

    }
}
