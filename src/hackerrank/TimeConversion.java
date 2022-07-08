package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeConversion {
    public static void main(String[] args) {
        String s = timeConversion("07:05:11 PM");
        System.out.println(s);
    }


    public static String timeConversion(String s) {
        String[] listTime = s.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String seconds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        if (caser.equals("AM")) {
            if (hour.equals("12"))
                hour = "00";

        } else {
            if (!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
        }
        return hour + ":" + minutes + ":" + seconds;
    }

    // Simpler solution
    public static String timeConversion2(String s) {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
        Date date = null;
        try {
            date = parseFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  displayFormat.format(date);
    }
}
