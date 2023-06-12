
import java.awt.GridLayout;

import javax.swing.*;

public class __43GridLayout extends JFrame{
 
    
    __43GridLayout(){
       
        this.setTitle("GRID"); //set frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setSize(750, 750); //sets the x-dimension, and y-dimension of frame
        this.setLayout(new GridLayout(3,3,15,15));
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));


        this.setVisible(true); //make frame visible


    } 


public static void main(String arg[]) {
    new __43GridLayout();
}


}


