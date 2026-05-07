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
//    window.getContentPane().setBackground(Color.WHITE);

    // JFrames are the actual window, while JPanels are like the containers
    // Default Layout is FlowLayout
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout(5, 5));
    panel.setBackground(Color.YELLOW);


    JButton button = new JButton("Button");
    button.setSize(30, 30);
    panel.add(button);


    window.add(panel);

    // JLabels display Images with ImageIcon or Text
    // Creates a new label called "AutoTyper" in the center
    JLabel title = new JLabel("AutoTyper", SwingConstants.CENTER);
    // Adds it to the window and adjusts it to Top center
    panel.add(title, BorderLayout.PAGE_START);

    // Adds Image to window
    // Creates a new ImageIcon with the file location
    ImageIcon kanye = new ImageIcon("src/assets/kanye64x64.jpg");
    JLabel kanyeLabel = new JLabel(kanye);
    // This works too: JLabel kanyeLabel = new JLabel(new ImageIcon("src/assets/kanye64x64.jpg"));
    // Sets the Image automatically or can set it manually ex: (200, 200)
    kanyeLabel.setSize(kanye.getIconWidth(), kanye.getIconHeight());
//    window.add(kanyeLabel);

    window.add(panel);





}
