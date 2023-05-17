import javax.swing.*;
import java.awt.event.*;

public class _40newWindow extends JFrame implements ActionListener{
 
    JButton button= new JButton("new window");
    _40newWindow(){
       
        button.setBounds(50,50,200,100);
        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(450,450);
        this.setVisible(true);
        this.add(button);
    }  

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            this.dispose();
            new NewWindow();
        }
    }

public static void main(String arg[]) {
    new _40newWindow();
}


}




