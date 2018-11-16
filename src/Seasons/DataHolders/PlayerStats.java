package Seasons.DataHolders;

public class PlayerStats {

    int year;
    int springCount;
    int summerCount;
    int fallCount;
    int winterCount;
    double potentialEarned;

    public PlayerStats() {
        year = 1;
        springCount = 0;
        summerCount = 0;
        fallCount = 0;
        winterCount = 0;
        potentialEarned = 0.0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpringCount() {
        return springCount;
    }

    public void setSpringCount(int springCount) {
        this.springCount = springCount;
    }

    public int getSummerCount() {
        return summerCount;
    }

    public void setSummerCount(int summerCount) {
        this.summerCount = summerCount;
    }

    public int getFallCount() {
        return fallCount;
    }

    public void setFallCount(int fallCount) {
        this.fallCount = fallCount;
    }

    public int getWinterCount() {
        return winterCount;
    }

    public void setWinterCount(int winterCount) {
        this.winterCount = winterCount;
    }

    public double getPotentialEarned() {
        return potentialEarned;
    }

    public void setPotentialEarned(double potentialEarned) {
        this.potentialEarned = potentialEarned;
    }
}
