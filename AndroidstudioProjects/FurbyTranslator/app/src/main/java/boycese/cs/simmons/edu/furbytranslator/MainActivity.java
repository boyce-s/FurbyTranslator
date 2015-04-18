package boycese.cs.simmons.edu.furbytranslator;

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
    ArrayList<Word> testList = new ArrayList<Word>();


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

    public void translate(View view){
     /*
        finds the user's English search term from the View and searches for it in the dictionary
     */
        String searchTerm = "";
        EditText userInputA = (EditText)findViewById(R.id.searchInput);
        String userInput = userInputA.getText().toString();
         // search for the userInput in the array on Word.english
        int index = Collections.binarySearch(testList, userInput);


         // access (& return) Word.furbish for the Word.english that the above matched


         // otherwise return not found
         // display the translation on the screen

    }


}
