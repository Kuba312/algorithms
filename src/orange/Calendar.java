package orange;

import java.util.List;

public class Calendar {
    private Long id;
    private WorkingHours workingHours;
    private List<PlannedMeeting> plannedMeetings;
    private static long counter;

    public Calendar( WorkingHours workingHours, List<PlannedMeeting> plannedMeetings) {
        this.id = ++counter;
        this.workingHours = workingHours;
        this.plannedMeetings = plannedMeetings;
    }

    public Long getId() {
        return id;
    }

    public WorkingHours getWorkingHours() {
        return workingHours;
    }

    public List<PlannedMeeting> getPlannedMeetings() {
        return plannedMeetings;
    }

    public static long getCounter() {
        return counter;
    }
}
