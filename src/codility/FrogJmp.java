package codility;

public class FrogJmp {
    public static void main(String[] args) {

    }

    public int solution(int x, int y, int d) {
        //x is a started position, y is a ended position y - x = distance to travel
        int distanceToTravel = y - x;
        // if u distance to travel divide by d (frog's jumps) then you'll get amount of frog jumps
        int jumps = distanceToTravel / d;

        //if distance to travel is number with comma then round off this number
        if (distanceToTravel % d > 0) {
            jumps++;
        }

        return jumps;
    }
}
