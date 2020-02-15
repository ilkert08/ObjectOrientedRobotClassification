
package prolab3;

import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JComponent;



public class Zemin extends JComponent {
    
    @Override
    public void paint(Graphics g) {
    g.drawRect (30, 30, 600, 600);  

        for (int i = 60; i <= 600; i+=30) {
            g.drawLine(30, i, 630, i);
            g.drawLine(i, 30, i, 630);
        }
       }  
}