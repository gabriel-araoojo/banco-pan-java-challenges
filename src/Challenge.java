import java.util.*;

public class Challenge {

    public static void leapYear() {
        Scanner tempScanner = new Scanner(System.in);
        int year = tempScanner.nextInt();

        if((year % 4) == 0) {
            System.out.println("Leap year");
        }

        else {
            System.out.println("Not leap year");
        }
    }
    public static void carFactory() {

    }
}
