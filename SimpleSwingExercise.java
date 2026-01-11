import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleSwingExercise {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);

        JPanel mainPanel = new JPanel(new BorderLayout(5, 5));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // TOP PANEL - Input Fields
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        // Row 1: Name
        inputPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        inputPanel.add(nameField);

        JButton submitBtn = new JButton("Submit");
        inputPanel.add(submitBtn);
        inputPanel.add(new JLabel()); // Empty cell

        // Row 2: Username
        inputPanel.add(new JLabel("Username:"));
        JTextField userField = new JTextField();
        inputPanel.add(userField);

        JButton loginBtn = new JButton("Login");
        inputPanel.add(loginBtn);
        inputPanel.add(new JLabel()); // Empty cell

        // Row 3: Checkbox & Radio
        JCheckBox terms = new JCheckBox("Accept Terms");
        inputPanel.add(terms);

        JRadioButton male = new JRadioButton("Male");
        inputPanel.add(male);

        // Row 4: Combo Box
        inputPanel.add(new JLabel("Language:"));
        JComboBox<String> langBox = new JComboBox<>(new String[]{"Java", "Python", "C++"});
        inputPanel.add(langBox);

        // CENTER PANEL - Calculator
        JPanel calcPanel = new JPanel(new GridLayout(4, 4, 2, 2));
        String[] calcButtons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        for (String text : calcButtons) {
            JButton btn = new JButton(text);
            calcPanel.add(btn);
        }

        // RIGHT PANEL - Click Me Button
        JPanel rightPanel = new JPanel(new BorderLayout());
        JButton clickMe = new JButton("Click Me");
        clickMe.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "Button Clicked!")
        );
        rightPanel.add(clickMe, BorderLayout.CENTER);

        // MENU BAR
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        // EVENT HANDLERS
        submitBtn.addActionListener(e -> {
            if (!nameField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Name submitted!");
            }
        });

        loginBtn.addActionListener(e -> {
            if (!userField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            }
        });

        // ASSEMBLE FRAME
        JPanel centerContainer = new JPanel(new GridLayout(1, 2, 10, 0));
        centerContainer.add(calcPanel);
        centerContainer.add(rightPanel);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(centerContainer, BorderLayout.CENTER);

        frame.setJMenuBar(menuBar);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
