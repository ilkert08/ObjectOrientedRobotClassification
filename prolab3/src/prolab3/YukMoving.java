
package prolab3;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComponent;

public class YukMoving extends JComponent {
    ArrayList<Integer> yukyerlerix=new ArrayList();
    ArrayList<Integer> yukyerleriy=new ArrayList();
    public int hareket;
    public String yon;
    public int RobotX;
    public int RobotY;
    public int Yukx;
    public int Yuky;
    public int KolBoyu;
    public float BitisSuresi=0;
    public int YukHizi;
    
    public void YukYeni(){
        RobotX=Yukx;
        RobotY=Yuky;
         Scanner scan1 = new Scanner ( System.in);    
          System.out.println("Saga tasimak icin D");
          System.out.println("Sola tasimak icin A");
          System.out.println("Geri taşimak icin W");
          System.out.println("Ileri gitmek icin S");
          System.out.println("Cikmak icin 0'i");
          System.out.print("Tuslayiniz.");
          for(;;)
          {
           System.out.print("Yon giriniz:");
           yon =scan1.next();
           if(yon.equals("0")==true)
               break;           
           System.out.print("Kac birim gidilecek:");
           hareket = scan1.nextInt();
           BitisSuresi+=(float)(hareket*10)/(float)YukHizi;
           if(hareket*10>KolBoyu || KolBoyu-hareket*10<0){
               System.out.println("Kol boyundan uzun deger girdiniz!");
               System.exit(0);
           }
           else{
            KolBoyu-=hareket*10;  
               
           }
           
            if(yon.equals("w")){      
               Yuky-= hareket;
               if(Yuky<1){
                   Yuky=1;
                   System.out.println("Zeminin disina ciktiniz!");
                   break;
               }
               yukyerlerix.add(Yukx);
               yukyerleriy.add(Yuky);
                     }
           if(yon.equals("s")){
               Yuky+= hareket;  
               if(Yuky>20){
                   Yuky=20;
                   System.out.println("Zeminin disina ciktiniz!");
                   break;
               }
               yukyerlerix.add(Yukx);
               yukyerleriy.add(Yuky);
           }
           if(yon.equals("a")){
               Yukx-= hareket;
               if(Yukx<1){
                   
                   Yukx=1;
                   System.out.println("Zeminin disina ciktiniz!");
                   break;
               }
               yukyerlerix.add(Yukx);
               yukyerleriy.add(Yuky);
           }
           if(yon.equals("d")){
               Yukx+= hareket;
               if(Yukx>20){
                   Yukx=20;
                   System.out.println("Zeminin disina ciktiniz!");
                   break;
               }
               yukyerlerix.add(Yukx);
               yukyerleriy.add(Yuky);
           }
           
          }     
   
    }

    
    
     
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        for (int i = 0; i < yukyerlerix.size(); i++) {
            
             g.drawString("Y",yukyerlerix.get(i)*30+10,(yukyerleriy.get(i)+1)*30-10);
        }
       
          
    }
     }
    
    
    
    
    
    
    

