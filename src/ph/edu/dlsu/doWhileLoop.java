package ph.edu.dlsu;

public class doWhileLoop {

    static private String[] days =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {

        int i = 0;
        do{
            System.out.println(days[i]);
            i++;
        } while (i < days.length);

    }

}
