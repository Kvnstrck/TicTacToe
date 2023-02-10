package GUI;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class GuidedUserInterface {

    Mouse mouse = new Mouse();
    JLabel xyLabel = createXYLabel(getX(), getY());

    int x;
    int y;

    public void createNewFrame(int width, int height) {
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.add(xyLabel);
        frame.addMouseListener(mouse);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void drawGrid(JFrame frame) {
    }

    public JLabel createXYLabel(int x, int y) {
        return new JLabel("x: " + x + ",y: " + y);
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}