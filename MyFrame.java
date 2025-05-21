import java.awt.Color;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {
        
        this.setTitle("In-Post");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1920, 1080);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("images.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.YELLOW);
        
    }
    
}