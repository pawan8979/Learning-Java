import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class _41JPanel extends JFrame{
    //JPanel= a GUI component that functions as a container to hold other components

    _41JPanel(){
        ImageIcon icon= new ImageIcon("javaimg.jpg");
        JLabel label = new JLabel();
        label.setText("Name");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);

        
        JPanel redPanel= new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        
        JPanel bluePanel= new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        
        JPanel greenPanel= new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());

        this.setTitle("Panel"); //set frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setLayout(null);
        this.setSize(750, 750); //sets the x-dimension, and y-dimension of frame
        
        this.setVisible(true); //make frame visible

        greenPanel.add(label); //label added inside red Panel
        add(redPanel);
        add(bluePanel);
        add(greenPanel);
    } 


public static void main(String arg[]) {
    new _41JPanel();
}
}


