package model;

import java.util.Random;

import javax.swing.JTextField;

import java.util.ArrayList;
import java.util.ArrayList;

public class HangManGame {

    private int key ;
    private int guess;
    private String random ;
    private int healthCount;
    public ArrayList<String> wordPool = new ArrayList<>(32);
    private ArrayList<String> wordGuess = new ArrayList<>(33);

    public HangManGame() {
        generateKey();
    }

    public void generateKey() {
      
        wordPool.add("communication" );
        wordPool.add("science");
        wordPool.add("programming");
        wordPool.add("language");
        wordPool.add("difficulty");
        wordPool.add("artificial");
        wordPool.add("intelligence");
        wordPool.add("attempts");
        wordPool.add("screenshot");
        wordPool.add("baseball");
        wordPool.add("windows");
        wordPool.add("learning");
        wordPool.add("electronics");
        wordPool.add("beautiful");
        wordPool.add("internet");
        wordPool.add("database");
        wordPool.add("organization");
        wordPool.add("application");
        wordPool.add("network");
        wordPool.add("friendly");
        wordPool.add("validation");
        wordPool.add("attempts");
        wordPool.add("statistics");
        wordPool.add("physics");
        wordPool.add("chemistry");
        wordPool.add("engineering");
        wordPool.add("school");
        wordPool.add("industry");
        wordPool.add("revolution");
        wordPool.add("progress");
        wordPool.add("characters");
        wordPool.add("heavily");
        wordPool.add("graphics");

    Random r = new Random();
    key =r.nextInt(wordPool.size());
 
    
    }
   
    
	public int getKey() {
		return key;
	}

    public void setGuess(int pos, int i) {
    
    }
    
    public void computeHealthCount() {
       }
    }

