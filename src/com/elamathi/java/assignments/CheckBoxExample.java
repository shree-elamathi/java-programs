package com.elamathi.java.assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create checkboxes
        JCheckBox checkBox1 = new JCheckBox("Checkbox 1", true);
        JCheckBox checkBox2 = new JCheckBox("Checkbox 2");
        JCheckBox checkBox3 = new JCheckBox("Checkbox 3");
        JCheckBox checkBox4 = new JCheckBox("Checkbox 4");

        // Add item listener to checkboxes
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // Display checkbox status when state is changed
                System.out.println("Checkbox 1: " + checkBox1.isSelected());
                System.out.println("Checkbox 2: " + checkBox2.isSelected());

                System.out.println("Checkbox 3: " + checkBox3.isSelected());
                System.out.println("Checkbox 4: " + checkBox4.isSelected());
                System.out.println("----------------------");
            }
        };

        checkBox1.addItemListener(itemListener);
        checkBox2.addItemListener(itemListener);
        checkBox3.addItemListener(itemListener);
        checkBox4.addItemListener(itemListener);

        // Add checkboxes to the frame
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}

