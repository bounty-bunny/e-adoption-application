// src/com/eadoption/Main.java
package com.eadoption;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("E-Adoption Portal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);

            // Create and set up the dashboard
            Dashboard dashboard = new Dashboard();
            frame.add(dashboard);
        });
    }
}
