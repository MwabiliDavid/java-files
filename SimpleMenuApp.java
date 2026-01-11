import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleMenuApp {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Menu App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        // Create content panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Select an option from the File menu", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(label, BorderLayout.CENTER);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create File menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners
        newItem.addActionListener(e -> {
            label.setText("New File selected");
            JOptionPane.showMessageDialog(frame, "New File menu clicked!");
        });

        openItem.addActionListener(e -> {
            label.setText("Open File selected");
            JOptionPane.showMessageDialog(frame, "Open File menu clicked!");
        });

        exitItem.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(frame,
                    "Exit application?", "Confirm Exit",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // Add items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Add File menu to menu bar
        menuBar.add(fileMenu);

        // Set menu bar to frame
        frame.setJMenuBar(menuBar);

        // Add panel to frame and show
        frame.add(panel);
        frame.setVisible(true);
    }
}
