package orange;

public class PlannedMeeting {
    private Long id;
    private String start;
    private String end;
    private static long counter;

    public PlannedMeeting( String start, String end) {
        this.id = ++counter;
        this.start = start;
        this.end = end;
    }

    public Long getId() {
        return id;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public static long getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return getStart() + "-" + getEnd();
    }
}
