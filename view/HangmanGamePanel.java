package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.BorderLayout;

public class HangmanGamePanel {
    
    private JFrame window;
    private HangmanCanvas canvas;
    private JTextField gameKeyField = new JTextField();
    private JTextField guessKeyField = new JTextField();
    private JButton[] letterButtons = new JButton[26];
    private JButton gameClick = new JButton("New");


    public HangmanGamePanel(JFrame window){
        this.window = window;
    }
 
    public void init() {
        Container cp =window.getContentPane();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,1));
        northPanel.add(gameKeyField);
        gameKeyField.setEditable(false);
        northPanel.add(guessKeyField);

        cp.add(BorderLayout.NORTH, northPanel);
  
        canvas =  new HangmanCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(4,7));

        for (int i=0;i<26;i++) {
           
            letterButtons[i]=new JButton("a"); 
            letterButtons[i].setEnabled(true);
            southPanel.add(letterButtons[i],BorderLayout.SOUTH);
    }
          
          southPanel.add(gameClick);
          cp.add(BorderLayout.SOUTH,southPanel);


     




    }
}
