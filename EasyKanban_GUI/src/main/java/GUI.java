import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        setVisible(true);
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        setSize(screenWidth, screenHeight);
        setLocation((screenWidth-getSize().width)/2, (screenHeight-getSize().height)/2);
        setIconImage(Toolkit.getDefaultToolkit().getImage("images/logo.png"));
        setTitle("EasyKanban Desktop Manager");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
