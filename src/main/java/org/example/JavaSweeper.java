package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame:
 * setVisible(true) - makes window visible
 * add() - appends the specified component to the end of this container
 * pack() - causes this Window to be sized to fit the preferred size and layouts of its subcomponents
 * setDefaultCloseOperation() - operation that will happen by default when the user
 * initiates a "close" on this frame
 * WindowConstants:
 * DO_NOTHING_ON_CLOSE
 * HIDE_ON_CLOSE
 * DISPOSE_ON_CLOSE
 * EXIT_ON_CLOSE
 * setLocationRelativeTo() - Sets the location of the window relative
 * to the specified component according to the following scenarios
 * <p>
 * JPanel:
 * setPreferredSize(new Dimension())
 */

public class JavaSweeper extends JFrame {

    private JPanel panel;
    private final int COLUMNS = 15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;

    private JavaSweeper() throws HeadlessException {
        initPanel();
        initFrame();
    }

    private void initPanel() {
        int width = COLUMNS * IMAGE_SIZE;
        int height = ROWS * IMAGE_SIZE;
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));
        add(panel);
    }

    private void initFrame() {
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweeper");
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JavaSweeper();
    }
}