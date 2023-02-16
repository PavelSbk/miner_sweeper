package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame:
 * setVisible(true) - makes window visible
 * pack() - causes this Window to be sized to fit the preferred size and layouts of its subcomponents
 * setDefaultCloseOperation() - operation that will happen by default when the user
 * initiates a "close" on this frame
 *              WindowConstants:
 *                      DO_NOTHING_ON_CLOSE
 *                      HIDE_ON_CLOSE
 *                      DISPOSE_ON_CLOSE
 *                      EXIT_ON_CLOSE
 * setLocationRelativeTo() - Sets the location of the window relative
 * to the specified component according to the following scenarios
 */

public class JavaSweeper extends JFrame {

    private JavaSweeper() throws HeadlessException {
        initFrame();
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