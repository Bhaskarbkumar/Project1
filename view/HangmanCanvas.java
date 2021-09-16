package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.JPanel;

public class HangmanCanvas extends JPanel {

    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    private int words;
    private int health;
    private int j;

    private HangmanGamePanel panel;

    public HangmanCanvas(HangmanGamePanel panel){
              this.panel = panel;
              setPreferredSize(new Dimension(WIDTH,HEIGHT));
              setBackground(Color.white);
    }

    @Override

    public void paintComponent(Graphics g) {
           super.paintComponent(g);

           Graphics2D g2 = (Graphics2D) g;

      
           HangmanGamePanel.GameState state = panel.getGameState();
           if (state == HangmanGamePanel.GameState.READY) {
               g2.setColor(Color.BLUE);
               g2.setFont(new Font("Courier", Font.ITALIC,40));
               g2.drawString("Health Level",50,150);

               for(j = 0; j < 5; j++) {
                 g2.draw3DRect(j*60 + 60, 180, 40, 40, true);
                 g2.setColor(Color.BLUE);
                 g2.fill3DRect(j*60 + 60, 180, 40, 40, true);
               }
               
             }
           
    }

    public void setWordsHealthCount(int words, int health) {
        this.words = words;
        this.health = health;     
    }
    }
