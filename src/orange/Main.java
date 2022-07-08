package orange;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. INICJALIZACJA DANYCH

        //Ustalenie zakresu godzin pracy pierwszej osoby
        WorkingHours workingHours1 = new WorkingHours("9:00", "20:00");
        //ustalenie zakresu godzin planowanych spotkań pierwszej osoby
        List<PlannedMeeting> plannedMeetings1 = Arrays.asList(
                new PlannedMeeting("09:00", "10:30"),
                new PlannedMeeting("12:00", "13:00"),
                new PlannedMeeting("16:00", "18:30")
        );

        //Wypelnienie konstruktora klasy Calednar godzinami pracy i godzinami spotkań
        Calendar calendar1 = new Calendar(workingHours1, plannedMeetings1);


        //To samo robimy z druga osoba
        WorkingHours workingHours2 = new WorkingHours("10:00", "18:45");

        List<PlannedMeeting> plannedMeetings2 = Arrays.asList(
                new PlannedMeeting("10:00", "11:30"),
                new PlannedMeeting("12:30", "14:30"),
                new PlannedMeeting("14:30", "15:00"),
                new PlannedMeeting("16:00", "17:00")
        );
        Calendar calendar2 = new Calendar(workingHours2, plannedMeetings2);
//******************************************************************************************************************************
    }

    //The method which allows make that two times not overlap.
    // If time one is after time 2, return time one, if not return time 2
    private LocalTime laterTime(LocalTime time1, LocalTime time2) {
        if (time1.isAfter(time2)) return time1;
        return time2;
    }

    //***********************************************************************************
    //The method which allow limits range time of works two persons
    private boolean isInWork(LocalTime laterStartTime, LocalTime e1, LocalTime e2) {
        return laterStartTime.isBefore(e1) && laterStartTime.isBefore(e2);
    }

    //***********************************************************************************
    //Parse String List times to times
    private List<String> calculate(Calendar calendar1, Calendar calendar2) {
        List<String> availableTime = new ArrayList<>();

        LocalTime s1 = LocalTime.parse(calendar1.getWorkingHours().getStart());
        LocalTime e1 = LocalTime.parse(calendar1.getWorkingHours().getEnd());

        LocalTime s2 = LocalTime.parse(calendar2.getWorkingHours().getStart());
        LocalTime e2 = LocalTime.parse(calendar2.getWorkingHours().getEnd());


        LocalTime laterStartTime = laterTime(s1, s2);

        LocalTime availableStart;
        LocalTime availableEnd;

        //While they are in work(e1, e2 - the ending of times works)
        while (isInWork(laterStartTime, e1, e2)) {
            // if they are there available times, takes calendar 1 and take from this place planned meeting
            // later start time and end for first person
            // and the same for the second person->
            // -> availableEnd = laterStartTime;
            if (!isAvailable(calendar1.getPlannedMeetings(), laterStartTime, e1)
                    && isAvailable(calendar2.getPlannedMeetings(), laterStartTime, e2)) {
                availableStart = laterStartTime;

            }


        }

        return null;
    }

    //*****************************************************************************************************************************
    //This method check availability of times meeting
    private boolean isAvailable(List<PlannedMeeting> plannedMeetingsList, LocalTime startTime, LocalTime endWork) {
        if (plannedMeetingsList.isEmpty()) {
            return false;
        }
        LocalTime startMeeting;
        //This get first index of planned Meetings and take the end this indexed meeting
        LocalTime previousEndMeeting = LocalTime.parse(plannedMeetingsList.get(0).getEnd());

        int count = 0;

        // Iteration for planned meetings List
        for (PlannedMeeting e : plannedMeetingsList) {
            //Indexed start meeting
            startMeeting = LocalTime.parse(e.getStart());


            if (count > 0) {
                //If start time is before start meeting and start meeting is (after) than
                // previous end meeting or start meeting is the same as previous end meeting return true
                if ((startTime.isBefore(startMeeting))
                        && (startMeeting.isAfter(previousEndMeeting)
                        || startMeeting.equals(previousEndMeeting))) {
                    return true;

                } else {
                    // Else parsing previous end meeting and take the end of it
                    previousEndMeeting = LocalTime.parse(e.getEnd());
                }
            } else {

                if (count + 1 == plannedMeetingsList.size()
                        && (startTime.equals(previousEndMeeting)
                        || startTime.isAfter(previousEndMeeting))
                        && startTime.isBefore(endWork))
                    return true;
                count++;
            }
        }

        return false;
    }


}


