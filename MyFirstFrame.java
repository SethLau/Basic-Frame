
package za.ac.tut.ui;

import javax.swing.JFrame;
import java.awt.Color;


public class MyFirstFrame extends JFrame
{
    public MyFirstFrame()
    {
        setTitle("Seth Laurick Yomba");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
