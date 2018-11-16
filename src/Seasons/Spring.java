package Seasons;

import Seasons.DataHolders.CropDataHolder;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Spring extends Season {

    public Spring() {

        populateCropList();
    }

    private void populateCropList () {

        File cropData = new File("src/JSON/crop_spring.json");

        try {
            FileReader reader = new FileReader(cropData);
            Gson translator = new Gson();

            crops = (translator.fromJson(reader, CropDataHolder.class));
        }
        catch(IOException badFile) {
            System.out.print("Bad file name\n");
            badFile.printStackTrace();
        }
    }
}
