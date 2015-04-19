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

    Word affirmative = new Word("affirmative", "ee");
    Word again = new Word("again", "koh-koh");
    Word and = new Word("and", "koh");
    Word another = new Word("another", "koh-koh");
    Word ask = new Word("ask", "oh-too-mah");
    Word baby = new Word("baby", "bay-bee");
    Word bad = new Word("bad", "boo-dah");
    //Word be = new Word("be", "boh");
    Word beautiful = new Word("beautiful", "ee-kah");
    Word pretty = new Word("pretty", "ee-kah");
    Word big = new Word("big", "dah");
    Word bigNo = new Word("big no", "dah-boo");
    Word noWay = new Word("no way!", "dah-boo");
    Word bigYes = new Word("big yes", "dah-ee-tah");
    Word bye = new Word("bye", "bye-bye");
    Word change = new Word("change", "boo-tay");
    Word cloud = new Word("cloud", "ay-loh-may-lah");
    Word comparative = new Word("comparative", "tay");
    Word complete = new Word("complete", "toh");
    Word dance = new Word("dance", "noh-lah");
    Word diamond = new Word("diamond", "ay-koo");
    Word dizzy = new Word("dizzy", "ay-way");
    Word do1 = new Word("do", "doo-dah");
    Word done = new Word("done", "toh-dye");
    Word down = new Word("down", "nah-bah");
    Word dream = new Word("dream", "way-loo");
    Word dude = new Word("dude", "dee-doh");
    Word face = new Word("face", "kah-tay");
    Word feed = new Word("feed", "ah-tah");
    Word food = new Word("food", "ah-tah");
    Word finally1 = new Word("finally", "oo-tah-toh-toh");
    Word friend = new Word("friend", "noo-lah");
    Word buddy = new Word("buddy", "noo-lah");
    Word full = new Word("full", "oo-loo");
    Word fun = new Word("fun", "doo-ay");
    Word funny = new Word("funny", "doo-loo");
    Word game = new Word("game", "doo-ay-loo-lah");
    Word genius = new Word("genius", "dah-way");
    Word go = new Word("go", "bye-bye");
    Word  getOut = new Word("get out!", "bye-bye");
    Word  good = new Word("good", "ee-day");
    Word  goodMorning = new Word("good morning", "dah-ay-loh-oo-tye");
    Word  goodNight = new Word("good night", "dah-ay-loh-nah-bah");
    Word  happy = new Word("happy", "noo-loo");
    Word  have = new Word("have", "ah-mah");
            Word  health = new Word("health", "koo-doh");
            Word  healthy = new Word("healthy", "koo-doh");
            Word  help = new Word("help", "ah-noo");
            Word  hide = new Word("hide", "woo-bye");
            Word  high = new Word("high", "oo-tah");
            Word  hmm = new Word("hmm?", "doo?");
            Word  home = new Word("home", "lay-lah");
            Word  hug = new Word("hug", "may-lah");
            Word  huh = new Word("huh?", "doo?");
            Word  hungry = new Word("hungry", "ay-tay");
            Word  eat = new Word("eat", "ay-tay");
            Word  why = new Word("why", "doo");
            Word  interrogative = new Word("interrogative", "doo");
            Word  island = new Word("island", "koo-wah");
            Word  kiss = new Word("kiss", "may-tah");
            Word  life = new Word("life", "tee");
            Word  light = new Word("light", "ay-loh");
            Word  lightness = new Word("lightness", "ay");
            Word  like = new Word("like", "toh-loo");
            Word  listen = new Word("listen", "ay-ay-lee-koo");
            Word  little = new Word("little", "dee");
            Word  live = new Word("live", "boh-dah");
            Word  log = new Word("log", "tee-loh");
            Word  look = new Word("look", "ay-ay");
            Word  love = new Word("love", "may-may");
            Word  me = new Word("me", "kah");
            Word  money = new Word("money", "moo-lah");
            Word  monster = new Word("monster", "moh-moh");
            Word  more = new Word("more", "koh-koh");
            Word  mountain = new Word("mountain", "koo-dah");
            Word  music = new Word("music", "ee-kah-lee-koo");
            Word  stop = new Word("stop", "boo");
            Word  no = new Word("no", "boo");
            Word  noise = new Word("noise", "bah-boo");
            Word  now = new Word("now", "nee-way");
            Word  ok = new Word("ok", "oh-kay");
            Word  omg = new Word("omg", "oh-kah-tee");
            Word  over = new Word("over", "oo-bah");
            Word  party = new Word("party", "dah-noh-lah");
            Word  path = new Word("path", "bye-way");
            Word  pet = new Word("pet", "ah-may");
            Word  play = new Word("play", "loo-lay");
            Word  humor = new Word("humor", "loo");
            Word  joke = new Word("joke", "loo");
            Word  please = new Word("please", "wah-wee-tee");
            Word  rock = new Word("rock", "boo-koo");
            Word  sad = new Word("sad", "boo-noo-loo");
            Word  scared = new Word("scared", "dah-boh-bay");
            Word  sea = new Word("sea", "ee-wah");
            Word  shake = new Word("shake", "koo-bah");
            Word  sing = new Word("sing", "wee-tee");
            Word  sleep = new Word("sleep", "way-loh");
            Word  smallness = new Word("smallness", "dee");
            Word  so = new Word("so", "doh");
            Word  song = new Word("song", "wah-tee");
            Word  sound = new Word("sound", "lee-koo");
            Word  stand = new Word("stand", "oo-boh");
            Word  story = new Word("story", "wee-loo");
    Word  sun = new Word("sun", "dah-ay-loh");
    Word  sweet = new Word("sweet", "nee-may");
    Word  talk = new Word("talk", "noo-noo");
    Word  tell = new Word("tell", "wee-tah");
    Word  thank = new Word("thank", "doh-kah");
    Word  thinking = new Word("thinking", "way");
    Word  tickle = new Word("tickle", "nee-tye");
    Word  time = new Word("time", "toh-toh");
    Word  touching = new Word("touching", "ah");
    Word  tough = new Word("tough", "tay-boo-koo");
    Word  tree = new Word("tree", "tee-tah");
    Word  twinkle = new Word("twinkle", "tee-wee-lah");
    Word  uhOh = new Word("uh-oh", "uh-oh");
    Word  uncle = new Word("uncle", "oo-kah");
    Word  up = new Word("up", "oo-tye");
    Word  very = new Word("very", "mee-mee");
    Word  wassup = new Word("wassup", "doo-oo-tye");
    Word  water = new Word("water", "wah-tah");
    Word  rain = new Word("rain", "wah");
    Word  when = new Word("when", "doo");
    Word  what = new Word("what", "doo");
    Word  where = new Word("where", "doo");
    Word  wise = new Word("wise", "doo");
    Word  wonder = new Word("wonder", "way-nah");
    Word  worried = new Word("worried", "boh-bay");
    Word  yay = new Word("yay", "yay");
    Word  yeah = new Word("yeah", "doo");
    Word  yes = new Word("yes", "ee-tay");
    Word  you = new Word("you", "oo-nye");

    List<Word> testList = new ArrayList<>();


    JSON_parse parser = new JSON_parse();
    //public static final String JSON_FILE = "english_furbish_ae.json";
    public static final String JSON_FILE = "[{\"english\":\"another\",\"furbish\":\"koh-koh\"},{\"english\":\"ask\",\"furbish\":\"oh-too-mah\"},{\"english\":\"baby\",\"furbish\":\"bay-bee\"},{\"english\":\"bad\",\"furbish\":\"boo-dah\"}]";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //testList.add(you);
        testList.add(yes);
        testList.add(yeah);
        testList.add(yay);
        testList.add(worried);
        testList.add(wonder);
        testList.add(wise);
        testList.add(where);
        testList.add(what);
        testList.add(when);
        testList.add(rain);
        testList.add(water);
        testList.add(wassup);
        testList.add(very);
        testList.add(up);
        testList.add(uncle);
        testList.add(uhOh);
        testList.add(twinkle);
        testList.add(tree);
        testList.add(tough);
        testList.add(touching);
        testList.add(time);
        testList.add(tickle);
        testList.add(thinking);
        //testList.add(thank);
        testList.add(tell);
        testList.add(talk);
        testList.add(sweet);
        testList.add(sun);
        testList.add(story);
        testList.add(stand);
        testList.add(sound);
        testList.add(song);
        //testList.add(so);
        testList.add(smallness);
        testList.add(sleep);
        testList.add(sing);
        testList.add(shake);
        testList.add(sea);
        testList.add(scared);
        testList.add(sad);
        testList.add(rock);
        //testList.add(rain);
        testList.add(please);
        //testList.add(joke);
        testList.add(humor);
        testList.add(play);
        testList.add(pet);
        testList.add(path);
        testList.add(party);
        testList.add(over);
        testList.add(omg);
        testList.add(ok);
        testList.add(now);
        testList.add(noise);
        //testList.add(no);
        testList.add(stop);
        testList.add(music);
        testList.add(mountain);
        testList.add(more);
        testList.add(monster);
        testList.add(money);
        testList.add(me);
        testList.add(love);
        testList.add(look);
        testList.add(log);
        testList.add(live);
        testList.add(little);
        testList.add(like);
        //testList.add(lightness);
        testList.add(life);
        testList.add(kiss);
        testList.add(affirmative);
        testList.add(again);
        testList.add(and);
        testList.add(another);
        testList.add(ask);
        testList.add(baby);
        testList.add(bad);
        //testList.add(be);
        testList.add(beautiful);
        testList.add(pretty);
        //testList.add(big);
        testList.add(bigNo);
        testList.add(noWay);
        testList.add(bigYes);
        testList.add(bye);
        testList.add(change);
        testList.add(cloud);
        testList.add(comparative);
        testList.add(complete);
        testList.add(dance);
        testList.add(diamond);
        testList.add(dizzy);
        //testList.add(do1);
        testList.add(done);
        testList.add(down);
        testList.add(dream);
        testList.add(dude);
        testList.add(face);
        testList.add(feed);
        testList.add(food);
        //testList.add(food);
        testList.add(finally1);
        testList.add(friend);
        testList.add(buddy);
        testList.add(full);
        //testList.add(fun);
        //testList.add(funny);
        testList.add(funny);
        testList.add(game);
        testList.add(genius);
        //testList.add(go);
        testList.add(getOut);
        //testList.add(good);
        testList.add(goodMorning);
        testList.add(goodNight);
        testList.add(happy);
        testList.add(have);
        //testList.add(health);
        testList.add(healthy);
        testList.add(help);
        testList.add(hide);
        testList.add(high);
        testList.add(hmm);
        testList.add(home);
        testList.add(hug);
        testList.add(huh);
        testList.add(hungry);
        testList.add(eat);
        testList.add(why);
        testList.add(interrogative);
        testList.add(island);
        testList.add(joke);
        testList.add(light);
        testList.add(listen);



        try {
            InputStream fis = new FileInputStream(JSON_FILE);
            parser.readJsonStream(fis);
            System.out.println("Successfully read input steam");
        } catch(IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Couldn't read in input stream"); }

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
    /*
        finds the user's English search term from the View, calls search, prints to screen
    */
        EditText userInputA = (EditText)findViewById(R.id.searchInput);
        String userInput = userInputA.getText().toString();
        userInput = userInput.toLowerCase();

        TextView translation = (TextView)findViewById(R.id.translation_result);

        String result = translate(userInput);

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
