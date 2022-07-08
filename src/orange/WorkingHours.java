package orange;

public class WorkingHours {

    private Long id;
    private String start;
    private String end;
    private static long counter;


    public WorkingHours( String start, String end) {
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public static void setCounter(long counter) {
        WorkingHours.counter = counter;
    }
}
