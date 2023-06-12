import java.awt.Color;
import javax.swing.*;

public class __39GUIBasic extends JFrame{
    __39GUIBasic(){
        this.setTitle("GUI BASIC"); //set frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized

        this.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible
        ImageIcon image= new ImageIcon("javaimg.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(Color.GRAY); //change color of background
        this.getContentPane().setBackground(new Color(200,100,200)); //change color of background to customize
    } 


public static void main(String arg[]) {
    new __39GUIBasic();
}
}


//Another way of doing the above code 
// public class demo {
//      public static void main(String[] args){
//         JFrame frame = new JFrame(); //creates frame
//         frame.setTitle("Learning"); //set frame title
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//         frame.setResizable(false); //prevent frame from being resized

//         frame.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
//         frame.setVisible(true); //make frame visible
//         ImageIcon image= new ImageIcon("javaimg.jpg"); //create an ImageIcon
//         frame.setIconImage(image.getImage()); //change icon of frame
//         frame.getContentPane().setBackground(Color.GRAY); //change color of background
//         frame.getContentPane().setBackground(new Color(200,100,200)); //change color of background to customize
//     }
// }