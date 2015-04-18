package boycese.cs.simmons.edu.furbytranslator;

/**
 * Created by susanboyce on 4/18/15.
 */
public class Word implements Comparable<Word> {

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

    public int compareTo(Word compWord){
        int diff = 0;
        int i = 0;
        do{
            diff = this.english.charAt(i) - compWord.english.charAt(i));
            i++;
        }while(diff == 0);
        return diff;
    }

}
