package Seasons;

public class Crop {

    //Name of crop
    String name;
    //How much it costs to purchase crop
    int buy;
    //How much the matured crop sells for
    int sell;
    //How long it takes the crop to grow in days
    int grow;
    //How many days it takes the crop to produce mature inventory once fully grown (0 if crop doesn't produce more)
    int regrowth;
    //The average inventory yield of the crop once mature
    double yield;
    //Whether the crop can grow/thrive in multiple seasons (True = yes)
    boolean multiSeason;
    //The seasons the crop can grow in (Spring = 1, Summer = 2, Fall = 3) If multi-seasonal will be a combo of the #'s
    //i.e. If crop grows in Spring and Summer = 12
    int seasons;
    //The overall value of the crop, depending on the day the player is currently on
    double value;

    public Crop(String name, int buy, int sell, int grow, int regrowth, double yield, boolean multiSeason, int seasons) {
        this.name = name;
        this.buy = buy;
        this.sell = sell;
        this.grow = grow;
        this.regrowth = regrowth;
        this.yield = yield;
        this.multiSeason = multiSeason;
        this.seasons = seasons;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {

        return value;
    }

}
