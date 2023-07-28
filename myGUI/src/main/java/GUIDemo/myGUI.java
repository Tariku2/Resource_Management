package GUIDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myGUI implements ActionListener {
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel label;
    private JButton button;
    private JFrame frame;


    public myGUI(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();

        label=new JLabel("number of clicks:0");


        JLabel userLabel=new JLabel("user");

        userLabel.setBounds(100,30,25,25);
        panel.add(userLabel);
        panel.setBorder(BorderFactory.createEmptyBorder(20,30,25,23));
        panel.setLayout(new GridLayout(1,2));

        panel.add(userLabel);
        JTextField userText=new JTextField(25);
        userText.setBounds(100,31,45,54);
        panel.add(userText);


      passwordLabel=new JLabel("password");
        passwordLabel.setBounds(20,35,50,100);
        panel.add(passwordLabel);
        JTextField pwdText=new JTextField(25);
        pwdText.setBounds(20,31,45,54);
        panel.add(pwdText);
        JButton button=new JButton("Log in");
        button.addActionListener(this);
        panel.add(button);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[]args){
        new myGUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

       label.setText("number of clicks:2");


    }
}
