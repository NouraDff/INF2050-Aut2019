package com.company;

import java.io.IOException;
import java.util.ArrayList;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import static com.company.DiskFile.loadFileIntoString;

public class JSONReader {
    public static JSONArray getCollectionArray (String filePath) throws IOException {
        String jsonFile = loadFileIntoString(filePath);
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonFile);
        JSONArray array = root.getJSONArray("collection");

        return  array;
    }

    public  static int getNbAlbum (JSONArray array){
        int nbAlbum = 0;
        for (int i = 0; i < array.size(); i++){
            if(array.getJSONObject(i).getString("type").equals("album")){
                nbAlbum++;
            }
        }
        return  nbAlbum;
    }

    public static int getNbSingle (JSONArray array){
        int nbSingle = 0;
        for (int i = 0; i < array.size(); i++){
            if(array.getJSONObject(i).getString("type").equals("single")){
                nbSingle++;
            }
        }
        return  nbSingle;
    }

    public static JSONArray getAlbum2003 (JSONArray array){
        JSONArray album2003 = new JSONArray();
        for (int i = 0; i < array.size(); i++){
            if((int) array.getJSONObject(i).get("publication") >= 2003 && array.getJSONObject(i).getString("type").equals("album")){
                album2003.add(array.getJSONObject(i).toString());
            }
        }
        return  album2003;
    }

    public  static JSONArray getRating5 (JSONArray array){
        JSONArray albumRating5 = new JSONArray();
        for (int i = 0; i < array.size(); i++){
            if((int) array.getJSONObject(i).get("rating") == 5 && array.getJSONObject(i).getString("type").equals("album")){

                albumRating5.add(array.getJSONObject(i));

            }
        }
        return  albumRating5;
    }
}
