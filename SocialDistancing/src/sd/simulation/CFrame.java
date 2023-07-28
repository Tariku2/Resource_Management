package sd.simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CFrame extends Panel implements ActionListener {
    ArrayList<Person> people=new ArrayList<Person>();
    int time=0;
    ArrayList<Point> points=new ArrayList<Point>();
    public static void main(String[] args) {

        CFrame c=new CFrame();
    }
    public void paint(Graphics g){

       // g.fillOval(10,10,100,100);
        time+=16;
        points.add(new Point(time/16,Person.numInfected));
        super.paintComponents(g);

        for (Person p:people){
            p.paint(g);

        }
        for (int i = 0;  i< people.size(); i++) {
            for (int j = i+1; j < people.size(); j++) {
                people.get(i).Collision(people.get(j));
            }

        }
        g.setColor(Color.blue);
        for (Point p:points){
            g.fillOval(p.time,200-p.value,10,10);
        }
    }
    public CFrame(){
        JFrame frame= new JFrame("Simulation");
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        for (int i = 0; i < 100; i++) {
            people.add(new Person());


        }
        //timer for Animation
        Timer t=new Timer(16,this);
        t.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();

    }
}
