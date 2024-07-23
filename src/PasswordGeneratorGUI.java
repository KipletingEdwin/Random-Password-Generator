//render the GUI components
//this class will inherit from the JFrame class

import javax.swing.*;

public class PasswordGeneratorGUI extends JFrame {
    public  PasswordGeneratorGUI(){
        //render the frame and the title
        super("Password Generator");

        //set the size of the GUI
        setSize(540, 570);

        //prevent GUI from being able to be resized

        setResizable(false);

        //we will set the layout to be null to have control over the position and the size of our components in our app

        setLayout(null);
        //terminate the program when the GUI is closed(ends the process)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //centre the GUI to the screen
        setLocationRelativeTo(null);

    }
}
