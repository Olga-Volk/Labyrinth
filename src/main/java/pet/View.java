package pet;

import javax.swing.*;
import java.awt.*;

public class View {
    static JFrame newWindow(){
        JFrame window = new JFrame("Labyrinth");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setResizable(true);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        return window;
    }
}

