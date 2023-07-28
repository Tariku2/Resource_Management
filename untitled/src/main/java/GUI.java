import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,30,25,23));
        panel.setLayout(new GridLayout(1,2));
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[]args){

    }
}
