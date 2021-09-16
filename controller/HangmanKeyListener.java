package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;

import model.HangManGame;
import view.HangmanGamePanel;

public class HangmanKeyListener implements ActionListener {

    private HangmanGamePanel panel;
    private int clicks=0;
    public String random;

    
    public HangmanKeyListener(HangmanGamePanel panel){
           this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button == panel.getGameClick()) {
            var HangMan = new HangManGame();
            panel.setHangMan(HangMan);
            panel.setGameState(HangmanGamePanel.GameState.READY);
            int key=HangMan.getKey();
            String random = "" + HangMan.wordPool.get(key) ;
            panel.getGameKeyField().setText(random);
            panel.getGuessKeyField().setText("");

            for (var b:panel.getLetterButtons()){
                b.setEnabled(true);

            }
            panel.getCanvas().repaint();
        } else {
            button.setEnabled(false);
            JTextField guessField = panel.getGuessKeyField();
            if (clicks == 0) guessField.setText("");

            HangManGame hangman = panel.getHangMan();
            String n = button.getText();
     
            guessField.setText(guessField.getText() + n); 
            clicks++;
            
        }   if (clicks == random.length() ) {
            panel.getCanvas().repaint();;
                 

            }
        }
    } 
        
        
        
        


