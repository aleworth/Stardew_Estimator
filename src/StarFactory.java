import Seasons.DataHolders.PlayerStats;
import Seasons.Spring;


public class StarFactory {

    public static void main(String[] args) {

        PlayerStats info = new PlayerStats();
        Spring spring = new Spring();
        spring.setDay(23);
        spring.evaluateValue(20);

        spring.printBestCrop();
    }
}
