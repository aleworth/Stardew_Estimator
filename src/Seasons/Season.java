package Seasons;

import Seasons.DataHolders.CropDataHolder;

import java.util.*;

public class Season {

    int day;
    int lastDay = 28;
    TreeMap<Double, String> orderedValueList;
    CropDataHolder crops;

    public Season() {
        day = 1;
        orderedValueList = new TreeMap<>();
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {

        return day;
    }

    public void nextDay() {
        day++;
    }

    public void evaluateValue(int numberOfCrops) {

        for(Crop crop : crops.getCropList()) {

                harvestAmountValue(crop, numberOfCrops);
            }
    }

    /**
     * This method is meant to process the return of a specific crop based on the number of days left in the seasons
     * and amount of harvests you're able to get in during the season
     * @param crop
     * @param numberOfCrops
     */
    public void harvestAmountValue(Crop crop, int numberOfCrops) {
        double value = 0.0;

        int harvestAmount = harvestCalc(crop, day);
        double totalCrops = (harvestAmount * (numberOfCrops * crop.yield));
        int cropCost = (numberOfCrops * crop.buy);
        value = (totalCrops * crop.sell) - cropCost;
        if (value > 0) {
            crop.setValue(value);
            orderedValueList.put(crop.value, crop.name);
        }
    }

    /**
     * This method generates the number of harvests you can expect in a single or multiple seasons from a specific crop
     * depending on the day that you start planting it.
     * @param crop
     * @param day
     * @return
     */
    public int harvestCalc(Crop crop, int day) {
        int requiredTime = crop.grow;

        if((day + requiredTime) > lastDay) {
            return 0;
        }
        else {

            return getHarvestAmount(requiredTime);
        }
    }

    public int getHarvestAmount(int requiredTime) {

        int totalHarvests = 0;
        int harvestMultiplier = 1;
        int dayCount = 0;
        while(dayCount < lastDay) {
            dayCount = (requiredTime * harvestMultiplier) + day;
            harvestMultiplier++;

            if(dayCount < lastDay) {
                totalHarvests++;
            }
        }

        return totalHarvests;
    }

    public void printBestCrop() {

        double bestCropIncome = (double)(orderedValueList.keySet().toArray()[orderedValueList.size()-1]);
        String bestCrop = orderedValueList.get(bestCropIncome);

        System.out.printf("%s ... %.2f", bestCrop, bestCropIncome);
    }

}
