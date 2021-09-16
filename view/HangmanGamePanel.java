package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.HangmanKeyListener;

import javax.swing.JPanel;

import model.HangManGame;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;

public class HangmanGamePanel {
    
    public enum GameState {
        READY,PLAYING,GAMEFINISHED
    }

    private JFrame window;
    private HangmanCanvas canvas;
    private JTextField gameKeyField = new JTextField();
    private JTextField guessKeyField = new JTextField();
    private JButton[] letterButtons = new JButton[26];
    private JButton gameClick = new JButton("New");
    private GameState gameState = GameState.READY;

    private HangManGame HangMan;

    public HangmanGamePanel(JFrame window){
        this.window = window;
    }
 
    public void init() {
        Container cp =window.getContentPane();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,1));
        northPanel.add(gameKeyField);

        gameKeyField.setEditable(true);
        northPanel.add(guessKeyField);

        cp.add(BorderLayout.NORTH, northPanel);
  
        canvas =  new HangmanCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(4,7));

        HangmanKeyListener keyListener = new HangmanKeyListener(this);

        for (int i=0;i<26;i++) {
           
            letterButtons[i]=new JButton("a"); 
            letterButtons[i].setEnabled(true);
            southPanel.add(letterButtons[i],BorderLayout.SOUTH);
            letterButtons[i].addActionListener(keyListener);
    }
          gameClick.addActionListener(keyListener);
          southPanel.add(gameClick);
          cp.add(BorderLayout.SOUTH,southPanel);

     
     }
     
     public HangManGame getHangManGame() {
        return HangMan;
     }

    public JFrame getWindow() {
        return window;
    }
     
    public HangmanCanvas getCanvas() {
        return canvas;
    }

    public JTextField getGameKeyField() {
        return gameKeyField;
    }

    public JTextField getGuessKeyField() {
        return guessKeyField;
    }

    public JButton[] getLetterButtons() {
        return letterButtons;
    }
     
    public JButton getGameClick() {
        return gameClick;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState state){
        this.gameState = state;
    }

    public HangManGame getHangMan() {
        return HangMan;
    }
     
    public void setHangMan(HangManGame HangMan) {
        this.HangMan = HangMan;
    }

    }

