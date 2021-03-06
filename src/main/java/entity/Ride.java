package entity;

public class Ride {
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private int distance;
    private int time;

    public Ride(int distance, int time) {
        this.distance = distance;
        this.time = time;
    }
}
