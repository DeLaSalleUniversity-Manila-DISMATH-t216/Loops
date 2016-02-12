package ph.edu.dlsu;

public class whileLoop {

    static private String[] days =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {

        int i = 0;
        while (i < days.length){
            System.out.println(days[i]);
            i++;
        }

    }

}
