package com.example.kimasenbeck.furbyparser;

/**
 * Created by kimasenbeck on 4/18/15.
 */

        import java.lang.Object;
        import android.util.JsonReader;
        import java.util.*;
        import java.io.*;

public class JSON_parse {

    public List readJsonStream(InputStream in) throws IOException {
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            return readJSONArray(reader);
        } finally {
            reader.close();
        }
    }


    public ArrayList readJSONArray(JsonReader reader) throws IOException {
        ArrayList words = new ArrayList();
        try {

            reader.beginObject();
            while (reader.hasNext()) {
                words.add(readJSON(reader));
            }
            reader.endObject();
            return words;
        } catch (IOException ex) {
        }

        return words;
    }

    public Furby readJSON(JsonReader reader) throws IOException {
        String english = null;
        String furbish = null;

        reader.beginObject();
        while (reader.hasNext()) {
            reader.nextString();
            english = reader.nextString();
            reader.nextString();
            furbish = reader.nextString();
        }
        reader.endObject();
        return new Furby(english, furbish);
    }

}

class Furby {
    public Furby(String eng, String fur) {
        english = eng;
        furbish = fur;

    }

    //instance vars
    private String english;
    private String furbish;

    //getter and setter methods
    public String getEnglish() {
        return english;
    }

    public String getFurbish() {
        return furbish;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setFurbish(String furbish) {
        this.furbish = furbish;
    }

    //toString method
    public String toString() {
        return ("English: " + english + "/ Furbish : " + furbish);
    }
}
