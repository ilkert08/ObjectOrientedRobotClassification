
package prolab3;

import java.awt.Graphics;
import javax.swing.JComponent;

public class RobotilkYer extends JComponent{
    
        int robotyerx;
        int robotyery;
    public void paint(Graphics g) {
        
        //super.paint(g);
   g.drawString("R", robotyerx*30+10 , (robotyery+1)*30-10);
   
          
    }
}
