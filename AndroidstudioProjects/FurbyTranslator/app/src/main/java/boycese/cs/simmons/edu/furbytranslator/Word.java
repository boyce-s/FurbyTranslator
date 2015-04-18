package boycese.cs.simmons.edu.furbytranslator;

/**
 * Created by susanboyce on 4/18/15.
 */
public class Word {

    private String english;
    private String furbish;

    public Word(String en, String fb){
        english = en;
        furbish = fb;
    }

    public void setEnglish(String en){ english = en; }

    public void setFurbish(String fb){ furbish = fb; }

    public String getEnglish() { return english; }

    public String getFurbish() { return furbish; }

    //toString method
    public String toString() {
        return ("English: " + english + "/ Furbish : " + furbish);
    }

}
