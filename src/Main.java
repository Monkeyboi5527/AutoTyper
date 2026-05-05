import javax.swing.*;
import java.awt.*;

void main() {


    // JFrames are a way to display a window
    // Simple JFrame start:
    // Creates an Instance with a name
    JFrame window = new JFrame("AutoTyper");
    // When the window is closed it stops the program
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Window size (Width, Height) in pixels
    window.setSize(600, 400);
    // Makes the window visible
    window.setVisible(true);
    // Starts window in center
    window.setLocationRelativeTo(null);
    // Stops user from resizing window
    window.setResizable(false); // temp
    // Sets background to a certain color
    window.getContentPane().setBackground(Color.GRAY);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    // For Displaying strings or Images
    // Creates a new label called "AutoTyper" in the center
    JLabel title = new JLabel("AutoTyper", SwingConstants.CENTER);
    // Adds it to the window and adjusts it to Top center
    window.add(title, BorderLayout.NORTH);

    // Adds Image to window
    ImageIcon kanye = new ImageIcon("src/assets/kanye64x64.jpg");
    JLabel kanyeLabel = new JLabel(kanye);
    kanyeLabel.setSize(kanye.getIconWidth(), kanye.getIconHeight());
    window.add(kanyeLabel);

    JButton button = new JButton("Button");
    panel.add(button, BorderLayout.PAGE_START);




}
