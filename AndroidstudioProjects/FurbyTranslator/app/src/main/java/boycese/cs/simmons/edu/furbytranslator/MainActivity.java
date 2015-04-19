package boycese.cs.simmons.edu.furbytranslator;

/**
 * Created by susanboyce on 4/18/15.
 */
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import java.util.*;
import java.io.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Word affirm = new Word("affirmative", "ee");
    Word again = new Word("again", "koh-koh");
    Word baby = new Word("baby", "bay-bee");
    List<Word> testList = new ArrayList<>();


    JSON_parse parser = new JSON_parse();
    public static final String JSON_FILE = "english_furbish_A-E.json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testList.add(again);
        testList.add(affirm);
        testList.add(baby);


        try {
            InputStream fis = new FileInputStream(JSON_FILE);
            parser.readJsonStream(fis);
        } catch(Exception e) { }

        Collections.sort(testList);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // event onClick for submit button

    public void submit(View view) {

        System.out.println("hello world");
    /*
        finds the user's English search term from the View, calls search, prints to screen
    */
        EditText userInputA = (EditText)findViewById(R.id.searchInput);
        String userInput = userInputA.getText().toString();
        userInput = userInput.toLowerCase();

        TextView translation = (TextView)findViewById(R.id.translation_result);

        String result = translate(userInput);
        System.out.println(result);

        // display the translation on the screen
        if(result == null) {
            translation.setText("Not found");
        }
        else {
            translation.setText(result);
        }

    }

    public String translate(String userInput){
     /*
        searches for user's search term in the dictionary
     */

         // search for the userInput in the array on Word.english

        Comparator<Word> comp = new Comparator<Word>() {
            @Override
            public int compare(Word word1, Word word2) {
                return word1.getEnglish().compareTo(word2.getEnglish());
            }
        };

        int index = Collections.binarySearch(testList, new Word(userInput, null), comp);
        // access (& return) Word.furbish for the Word.english that the above matched
        // otherwise return not found
        if(index < 0) { return null; }
        else { return testList.get(index).getFurbish(); }

    }




}
