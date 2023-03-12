import java.util.Calendar;
import java.util.TimeZone;

public class CalenderC {
    public static void main(String[] args) {
/*
        Calendar ch = Calendar.getInstance();
        System.out.println(ch.getCalendarType());
        System.out.println(ch.getTimeZone());
*/


        Calendar ch = Calendar.getInstance();
        System.out.println(ch.getCalendarType());
        System.out.println(ch.getTimeZone().getID());

    }
}
