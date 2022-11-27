package pet;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control extends JFrame implements KeyListener {
    JLabel label;

    public Control() {
        super(s);
        JPanel p = new JPanel();
        label = new JLabel("Key Listener!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            System.out.println("left");
        }

        if (key == KeyEvent.VK_RIGHT) {
            System.out.println("right");
        }

        if (key == KeyEvent.VK_UP) {
            System.out.println("up");
        }

        if (key == KeyEvent.VK_DOWN) {
            System.out.println("down");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            System.out.println("left");
        }

        if (key == KeyEvent.VK_RIGHT) {
            System.out.println("right");
        }

        if (key == KeyEvent.VK_UP) {
            System.out.println("up");
        }

        if (key == KeyEvent.VK_DOWN) {
            System.out.println("down");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            System.out.println("left");
        }

        if (key == KeyEvent.VK_RIGHT) {
            System.out.println("right");
        }

        if (key == KeyEvent.VK_UP) {
            System.out.println("up");
        }

        if (key == KeyEvent.VK_DOWN) {
            System.out.println("down");
        }
    }
}
