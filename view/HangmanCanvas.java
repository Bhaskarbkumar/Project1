package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class HangmanCanvas extends JPanel {

    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    private HangmanGamePanel panel;

    public HangmanCanvas(HangmanGamePanel panel){
              this.panel = panel;
              setPreferredSize(new Dimension(WIDTH,HEIGHT));
              setBackground(Color.white);
    }

    @Override

    public void paintComponent(Graphics g) {
           super.paintComponent(g);

    }

    
    }
