package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.HangManGame;
import view.HangmanGamePanel;

public class HangmanKeyListener implements ActionListener {

    private HangmanGamePanel panel;
    private int clicks=0;

    
    public HangmanKeyListener(HangmanGamePanel panel){
           this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if(button == panel.getGameClick()) {
            var HangMan = new HangManGame();
            panel.setHangMan(HangMan);
            panel.setGameState(HangmanGamePanel.GameState.PLAYING);
            int key=HangMan.getKey();
            String random = "" + HangMan.wordPool.get(key) ;
            panel.getGameKeyField().setText(random);
            panel.getGuessKeyField().setText("_ _ _ _ _");

        }
        panel.getCanvas().repaint();
    } 
        
        
        
        
    }

