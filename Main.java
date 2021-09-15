import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JButton;

import view.MenuScreen;

public class Main{

    public static void main(String[] args){
        
        char c;
        JButton[] second = new JButton[26];

        for (c = 'a', c <='Z', ++c){
            int i;
          second[i] = System.out.println(c);
      }

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(500,500);

        var menu = new MenuScreen(window);
        menu.init();

        window.pack();
        window.setVisible(true);

    }
}