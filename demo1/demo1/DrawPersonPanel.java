import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
public class DrawPersonPanel extends JPanel {

    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private int headX = 60;
    private int headY = 40;
    private int[] hairX = {62,75,84,85,88,90,93,99,104,110};
    private int[] hairY = {45,46,37,38,39,30,31,32,33,54};
    private int[] shirtX = {60,0,20,60,50,130,120,160,180,120};
    private int[] shirtY = {100,150,180,160,250,250,160,180,150,100};
    private int[] zigzagX = {70,75,80,85,90,95,100,105,110};
    private int[] zigzagY = {135,140,135,140,135,140,135,140,135};
    private int[] pantsX = {50,130,150,110,90,70,30};
    private int[] pantsY = {250,250,375,375,300,375,375};


    //--------------------------------------
// Constructor: Set up the panel.
//--------------------------------------
    public DrawPersonPanel()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    //--------------------------------------
// Draw person
//--------------------------------------
    public void paintComponent (Graphics page)
    {
        page.setColor(Color.blue);
        page.fillPolygon(shirtX, shirtY, shirtX.length);

        page.setColor(new Color(255, 228, 181));
        page.fillOval(headX, headY, 60, 60 - 10);


        page.setColor(Color.BLACK);
        page.fillPolygon(hairX, hairY, hairX.length);


        page.setColor(Color.WHITE);
        page.drawPolyline(zigzagX, zigzagY, zigzagX.length);


        page.setColor(Color.cyan);
        page.fillPolygon(pantsX, pantsY, pantsX.length);



    }

    private void movePerson(int x, int y){
// Increment head.
        headX += x;
        headY += y;

        for (int i = 0; i < hairX.length; i++)
        {hairX[i] += x;}

        for (int i = 0; i < hairY.length; i++)
        {hairY[i] += y;}

        // Increment shirt.
        for (int i = 0; i < shirtX.length; i++)
        {shirtX[i] += x;}

        for (int i = 0; i < shirtY.length; i++)
        {shirtY[i] += y;}

        // Increment zig-zag on shirt.
        for (int i = 0; i < zigzagX.length; i++)
        {zigzagX[i] += x;}

        for (int i = 0; i < zigzagY.length; i++)
        {zigzagY[i] += y;}

        // Increment pants.
        for (int i = 0; i < pantsX.length; i++)
        {pantsX[i] += x;}

        for (int i = 0; i < pantsY.length; i++)
        {pantsY[i] += y;}


        repaint();

    }



}