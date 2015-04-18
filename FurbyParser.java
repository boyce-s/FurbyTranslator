//FurbyParser

import com.google.gson.Gson;

public class FurbyParser{
  
  public static void main(String[]args) throws Exception {
    
        String json = "{" +
                "'english': 'affirmative',"+
                "'furbish': 'ee'"+
            "}";

        // Now do the magic.
        Word word = new Gson().fromJson(json, Word.class);

        // Show it.
        System.out.println(word);
    }


  class Word{
    //instance vars
  private String english;
  private String furbish;
  
  //getter and setter methods
  public String getEnglish() { return english; }
  public String getFurbish() { return furbish; }
  public void setEnglish(String english) { this.english = english; }
  public void setFurbish(String furbish) { this.furbish = furbish; }
  
  //toString method
   public String toString() 
   { return ("English: " + english + "/ Furbish : " + furbish) ; }
  }
  
}