import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //til scanner-box
import java.awt.*; //til scanner-box

public class Main {

    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame HOME_frame = new JFrame("NUTFLIX");
        // Set layout manager to GridBagLayout (fine control over placement)
        HOME_frame.setLayout(new GridBagLayout());
        // Create a GridBagConstraints object for precise control over placement
        GridBagConstraints gbc = new GridBagConstraints();

        // Create buttons with fixed size
        JButton login_button = new JButton("Login");
        login_button.setPreferredSize(new Dimension(100, 40));

        // Add ActionListener to the "Login" button
        login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HOME_frame.setVisible(false);
                LoginPanel.openLoginFrame(); // Call the method to open a new frame
            }
        });

        JButton createUser_button = new JButton("Create User");
        createUser_button.setPreferredSize(new Dimension(100, 40));

        JButton exit_button = new JButton("Exit");
        exit_button.setPreferredSize(new Dimension(100, 40));


        JLabel label = new JLabel("NUTFLIX");
        label.setFont(new Font("Charter", Font.BOLD, 100));

        // Set constraints for the label (position at row 0, column 1)
        gbc.gridx = 0;
        gbc.gridy = 0;  // Position the label below the buttons
        HOME_frame.add(label, gbc);

        // Set constraints for button 1 (position at row 1, column 0)
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(100, 10, 5, 10); // Add space around button 1
        HOME_frame.add(login_button, gbc);

        // Set constraints for button 2 (position at row 2, column 0)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(30, 10, 5, 10); // Add space around button 2
        HOME_frame.add(createUser_button, gbc);

        // Set constraints for button 3 (position at row 3, column 0)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(30, 10, 5, 10); // Add space around button 3
        HOME_frame.add(exit_button, gbc);

        // Set window size and make sure buttons are placed correctly
        HOME_frame.setSize(1200, 800);  // Adjust the frame size to your liking
        HOME_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HOME_frame.setVisible(true);
    }





}

