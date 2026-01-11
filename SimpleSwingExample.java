import javax.swing.*;

public class SimpleSwingExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);

        // Create panel
        JPanel panel = new JPanel();

        // Create components
        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        // Add action to button
        button.addActionListener(e -> {
            String text = textField.getText();
            JOptionPane.showMessageDialog(frame, "You entered: " + text);
        });

        // Add components to panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add panel to frame
        frame.add(panel);

        // Display window
        frame.setVisible(true);
    }
}
