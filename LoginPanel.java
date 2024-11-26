import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.URL;

public class LoginPanel extends JPanel {

    // Declare the background image as a field of the class
    private Image backgroundImage;

    // Constructor to load the background image
    public LoginPanel() {
        try {
            // Use ClassLoader to get the image from the resources folder
            URL imageUrl = getClass().getClassLoader().getResource("resources/nutflix.jpg");

            if (imageUrl != null) {
                backgroundImage = ImageIO.read(imageUrl);  // Load the image
            } else {
                System.out.println("Image not found!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));  // Set the layout for components
    }

    // Override the paintComponent method to paint the background image
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call the super class method for proper painting
        if (backgroundImage != null) {
            // Draw the image scaled to the size of the panel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    // Static method to open the login frame
    public static void openLoginFrame() {
        JFrame LOGIN_frame = new JFrame("Login Frame");
        LOGIN_frame.setLayout(new GridBagLayout());

        // Create the custom panel with a background image
        LoginPanel login_panel = new LoginPanel();

        // Add the username field panel
        JPanel usernamePanel = new JPanel();
        usernamePanel.setLayout(new BoxLayout(usernamePanel, BoxLayout.X_AXIS));
        usernamePanel.add(new JLabel("Enter Username:"));
        JTextField usernameField = new JTextField(20);
        usernamePanel.add(usernameField);

        // Add the password field panel
        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.X_AXIS));
        passwordPanel.add(new JLabel("Enter Password:"));
        JPasswordField passwordField = new JPasswordField(20);
        passwordPanel.add(passwordField);

        // Add components to the login panel
        login_panel.add(Box.createRigidArea(new Dimension(0, 50))); // Spacing between fields
        login_panel.add(usernamePanel);
        login_panel.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing
        login_panel.add(passwordPanel);

        // Add the login panel to the frame
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 200, 300);  // Set padding around the panel
        LOGIN_frame.add(login_panel, gbc);

        // Set the frame properties
        LOGIN_frame.setSize(1200, 800);  // Size of the window
        LOGIN_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Close when done
        LOGIN_frame.setVisible(true);  // Make the frame visible
    }
}
