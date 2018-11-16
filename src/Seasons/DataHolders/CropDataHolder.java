package Seasons.DataHolders;

import Seasons.Crop;

import java.util.ArrayList;

/*
This is a class designed to contain the crop list. It is updated regularly with each season
 */
public class CropDataHolder {

    ArrayList<Crop> cropList;

    public CropDataHolder() {
        cropList = new ArrayList<>();
    }

    public void addToCollection(Object name) {
        cropList.add((Crop)name);
    }

    public ArrayList<Crop> getCropList() {

        return cropList;
    }

    public void setCropList(ArrayList cropList) {

        this.cropList = cropList;
    }
}
