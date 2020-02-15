package prolab3;

import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JComponent;

public class Engeller extends JComponent{
  int cikis=0;
  public static int c;
    Scanner scan1= new Scanner(System.in);
    int engelx[]= new int[10];
    int engely[]= new int[10];
    int a;
    int b;
    int i=0;
   public int robotyerx;
   public int robotyery;
   public int robotyerx2;
  public int robotyery2;
    String robotturu;
      public void EngelAl(){
        System.out.println("Engeller:");
     System.out.println("Bitirmek icin koordinati 0 giriniz.");
          for (;;) {
              System.out.print("Engel X:");
        this.engelx[i]= scan1.nextInt();
        a=this.engelx[i];
          b=this.engely[i];
         System.out.print("Engel Y:");
         this.engely[i] = scan1.nextInt();
         i++;    
         if(this.engelx[i-1]==0|| this.engely[i-1]==0)
          break;
          }      
     }
      public void robotyeri()
      {
          System.out.println("x:");
          robotyerx=scan1.nextInt();
          System.out.println("y:");
          robotyery=scan1.nextInt();
          robotyery2=robotyery;
          robotyerx2=robotyerx;
          cikis=1;
      }
      
      
      
  
     @Override
     public void paint(Graphics g) {
         for (int i= 0; engelx[i]!=0; i++) {
           g.drawString("X", engelx[i]*30 +10 , (engely[i]+1)*30-10);
    }
          //g.drawString("R", robotyerx*30+10 , (robotyery+1)*30-10);
          g.drawRect (30, 30, 600, 600);  
            for (int i = 60; i <= 600; i+=30) {
            g.drawLine(30, i, 630, i);
            g.drawLine(i, 30, i, 630);
        }          
}

     
     
}