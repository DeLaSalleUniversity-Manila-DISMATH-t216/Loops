package ph.edu.dlsu;

public class eachForLoop {

    static private String[] days =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {

        for (String day : days) {
            System.out.println(day);
        }

    }

}
