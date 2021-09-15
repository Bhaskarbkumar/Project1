package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.BorderLayout;


public class MenuScreen{
    
    private JFrame  window;
    private JTextField gameKeyField = new JTextField();
    private JTextField guessField = new JTextField();
    private JTextField display = new JTextField("press <NEW> to start");
    private JButton[] first = new JButton[26];
    private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


public MenuScreen (JFrame window) {
    this.window=window;
}

public void init() {
       Container cp =window.getContentPane();

       JPanel northpanel =new JPanel();
       northpanel.setLayout(new GridLayout(2,1));
       northpanel.add(new JTextField());
       northpanel.add(gameKeyField);


       cp.add(BorderLayout.NORTH,northpanel);

       JPanel centrePanel = new JPanel();
       centrePanel.setPreferredSize(new Dimension(500,500));
       centrePanel.add(display);

       cp.add(BorderLayout.CENTER,centrePanel);

      JPanel southPanel = new JPanel();
      southPanel.setLayout(new GridLayout(4,7));
      for (int i=0;i<26;i++) {
           
            first[i]=new JButton("a"); 
            southPanel.add(first[i],BorderLayout.SOUTH);
    }
    cp.add(BorderLayout.SOUTH,southPanel);

}



      





}

