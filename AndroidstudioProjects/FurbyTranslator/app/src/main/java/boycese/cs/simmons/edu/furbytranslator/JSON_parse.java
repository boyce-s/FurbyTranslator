package boycese.cs.simmons.edu.furbytranslator;

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


    public List<Word> readJSONArray(JsonReader reader) throws IOException {
        ArrayList<Word> words = new ArrayList<>();
        try {

            reader.beginObject();
            while (reader.hasNext()) {
                words.add(readJSON(reader));
            }
            reader.endObject();
            return words;
        } catch (IOException ex) { }

        return words;
    }

    public Word readJSON(JsonReader reader) throws IOException {
        String english = null;
        String furbish = null;

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("english")) {
                english = reader.nextString();
            }
            else if (name.equals("furbish")) {
                furbish = reader.nextString();
            }
            else{
                reader.skipValue();
            }
            //String name2 = reader.nextName();
        }
        reader.endObject();
        return new Word(english, furbish);
    }

}