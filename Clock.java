package oop;

/**
 *
 * @author thego
 */
public class Clock {
    private int sec;
    private int min;
    private int hr;
    
    public Clock() {
        this.sec = 0;
        this.min = 0;
        this.hr = 0;
    }

    public Clock(int se, int min, int hr) {
        this.sec = se;
        this.min = min;
        this.hr = hr;
    }
    
    public Clock(Clock clock) {
        this.sec = clock.sec;
        this.min = clock.min;
        this.hr = clock.hr;
    }
    /**
     * To increase the hour by 1
     */
    public void increaseHr() {
        hr = (hr + 1) % 24;
    }
    
    /**
     * To increase the minute by 1
     */
    public void increaseMin() {
        min++;
        if (min == 60) {
            min = 0;
            increaseHr();
        }
    }
    
    /**
     * To increase the second by 1
     */
    public void increaseSec() {
        sec++;
        if (sec == 60) {
            sec = 0;
            increaseMin();
        }
    }
    
    
    
    public boolean equals(Clock clock) {
        return this.sec == clock.sec &&
               this.sec == clock.min &&
               this.hr == clock.hr;
    }

    @Override
    public String toString() {
        return String.format("%s: %02d:%02d:%02d\n", "Time", hr, min, sec);
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }
    
    
    
}
