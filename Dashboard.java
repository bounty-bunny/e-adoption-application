// src/com/eadoption/Dashboard.java
package com.eadoption;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JPanel {
    private JTextArea textArea;

    public Dashboard() {
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);

        JButton viewButton = new JButton("View Dashboard");
        viewButton.addActionListener(new ViewButtonListener());
        add(viewButton, BorderLayout.SOUTH);
    }

    private class ViewButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText("Displaying Parent and Mother Dashboard...");
        }
    }
}
