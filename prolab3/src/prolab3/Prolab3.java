package prolab3;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class Prolab3 {

    public static void main(String[] args) {
        String kisimGezgin=".";
        String kisimManipulator=".";
        ArrayList<String> cins = new ArrayList();
        Zemin Zemin1 = new Zemin();
        GezginPaletli d1 = new GezginPaletli();
        YukMoving Yuk = new YukMoving();
        int HibritSayaci=0;
        RobotMoving robot = new RobotMoving();
        Engeller engeller1 = new Engeller();
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(500, 200, 720, 720);

        window.getContentPane().add(Zemin1);

        // window.getContentPane().add(new Engeller());
        window.setVisible(true);
        Scanner scan1 = new Scanner(System.in);
        engeller1.EngelAl();
        // engeller1.robotyeri();
        window.getContentPane().add(engeller1);
        window.setVisible(true);
        /* robot.robotyery2=engeller1.robotyery;
      robot.robotyerx2= engeller1.robotyerx; 
    
      robot.robotyeni();
      window.getContentPane().add(robot);
      window.setVisible(true);*/
        System.out.println("Kac tane robot olacak?");
        int robotSayisi = scan1.nextInt();
        ArrayList<String> robotTipi = new ArrayList<>();
        ArrayList<Robot> Robotlar = new ArrayList();
        ArrayList<Integer> robotHizlari = new ArrayList();
        ArrayList<Integer> robotYukleri = new ArrayList();
        ArrayList<String> HibritGezgin = new ArrayList<>();
        ArrayList<String> HibritManipule = new ArrayList<>();
        for (int i = 0; i < robotSayisi; i++) {
            System.out.println("Robot turu:");
            String RobotTipiT = scan1.next();
            robotTipi.add(RobotTipiT);
            if (RobotTipiT.equals("gezgin")) {
                System.out.println("Gezgin robotun cinsi:");
                String c = scan1.next();
                cins.add(c);
                if (c.equals("paletli")) {
                    int temp1;
                    GezginPaletli gecici = new GezginPaletli();
                    System.out.print("Robotun motor sayisi:");   
                    temp1=scan1.nextInt();
                    gecici.SetMotor(temp1);
                    System.out.print("Robotun palet sayisi:");
                    gecici.PaletSayisi = scan1.nextInt();
                    System.out.print("Robotun yuk miktari:");
                    temp1=scan1.nextInt();
                    gecici.SetYuk(temp1);
                    System.out.print("Robotun hizini giriniz:");
                    int t = scan1.nextInt();
                   

                //#Minimum hiz belirliyoruz!
                   
                   for (int j = 0; j < robotHizlari.size(); j++) {
                        if (cins.get(j).equals("tekerlekli") && robotHizlari.get(j) < t) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        if (cins.get(j).equals("spider") && robotHizlari.get(j) > t) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        else{
                            gecici.setGezinmehizi(t);
                        }
                    }
                    robotHizlari.add(t);
                    Robotlar.add(gecici);
                    GezginPaletli g2 = (GezginPaletli) Robotlar.get(Robotlar.size() - 1);
                }
                if (c.equals("tekerlekli")) {
                    int temp1;
                    GezginTekerlekli gecici = new GezginTekerlekli();
                    System.out.print("Robotun motor sayisi:");
                    temp1=scan1.nextInt();
                    gecici.SetMotor(temp1);
                    System.out.print("Robotun tekerlek sayisi:");
                    gecici.TekerlekSayisi = scan1.nextInt();
                    System.out.print("Robotun yuk miktari:");
                    temp1=scan1.nextInt();
                    gecici.SetYuk(temp1);
                    System.out.print("Robotun hizini giriniz:"); 
                   
                   /* int t;
                    for(;;){
                       t = scan1.nextInt();
                       if(t<50){
                      System.out.print("Tekrar giriniz:");
                      
                       }
                       else{
                        gecici.setGezinmehizi(t);
                       break;   
                       } 
                    } */
                        int t = scan1.nextInt();
                        for (int j = 0; j < robotHizlari.size(); j++) {
                        if (cins.get(j).equals("paletli") && robotHizlari.get(j) > t) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        if (cins.get(j).equals("spider") && robotHizlari.get(j) > t) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        else{
                            gecici.setGezinmehizi(t);
                        }

                    }
          
                    robotHizlari.add(t);
                    Robotlar.add(gecici);
                    GezginTekerlekli g2 = (GezginTekerlekli) Robotlar.get(Robotlar.size() - 1);                  
                }
                if (c.equals("spider")) {
                    int temp1;
                    GezginSpider gecici = new GezginSpider();
                    System.out.print("Robotun motor sayisi:");
                    temp1=scan1.nextInt();
                    gecici.SetMotor(temp1);
                    System.out.print("Robotun bacak sayisi:");
                    gecici.BacakSayisi = scan1.nextInt();
                    System.out.print("Robotun yuk miktari:");
                    temp1=scan1.nextInt();
                    gecici.SetYuk(temp1);
                    System.out.print("Robotun hizini giriniz:");
                    int t = scan1.nextInt();
                    for (int j = 0; j < robotHizlari.size(); j++) {
                        if (cins.get(j).equals("tekerlekli") && robotHizlari.get(j) < t) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        if (cins.get(j).equals("paletli") && robotHizlari.get(j) < t) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        else{
                            gecici.setGezinmehizi(t);
                        }

                    }
                    robotHizlari.add(t);
                    Robotlar.add(gecici);
                    GezginSpider g2 = (GezginSpider) Robotlar.get(Robotlar.size() - 1);
                 
                }
            } else if (RobotTipiT.equals("manipulator")) {
                int temp1;
                System.out.println("Manipulator robotun cinsi:");
                String c = scan1.next();
                cins.add(c);
                if (c.equals("paralel")) {
                    ManipuleParalel gecici = new ManipuleParalel();
                    System.out.print("Robotun maximum yuk miktari:");
                    temp1=scan1.nextInt();
                    gecici.SetMaxyuk(temp1);
                    System.out.print("Robotun kol uzunlugu:");
                    temp1=scan1.nextInt();
                    gecici.SetKoluzunlugu(temp1);
                    Yuk.KolBoyu = gecici.KolUzunlugu;
                    System.out.print("Robotun tasima hizi:");
                    temp1=scan1.nextInt();
                    gecici.SetTasimahizi(temp1);
                    System.out.print("Robotun tasiyacagi yuk miktari:");
                    gecici.YukMiktari=scan1.nextInt();
                    for (;;) {
                        if (gecici.YukMiktari > gecici.maxYuk) {
                            System.out.println("Tasinacak yuk miktarini tekrar giriniz.");
                            System.out.print("Robotun tasiyacagi yuk miktari:");
                            gecici.YukMiktari = scan1.nextInt();
                        } else {
                            robotYukleri.add(gecici.YukMiktari);
                            gecici.SetYuk(gecici.YukMiktari);
                            break;
                        }
                    }
                    for (int j = 0; j < robotHizlari.size(); j++) {
                        if (cins.get(j).equals("seri") && robotHizlari.get(j) > gecici.TasimaHizi) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        if (cins.get(j).equals("seri") && robotYukleri.get(j) > gecici.YukMiktari) {
                            System.out.println("Yuk degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        

                    }
                    robotHizlari.add(gecici.TasimaHizi);
                    Robotlar.add(gecici);
                    ManipuleParalel g2 = (ManipuleParalel) Robotlar.get(Robotlar.size() - 1);

                }
                if (c.equals("seri")) {
                    ManipuleSeri gecici = new ManipuleSeri();
                    System.out.print("Robotun maximum yuk miktari:");
                    temp1=scan1.nextInt();
                    gecici.SetMaxyuk(temp1);
                    System.out.print("Robotun kol uzunlugu:");
                    temp1=scan1.nextInt();
                    gecici.SetKoluzunlugu(temp1);
                    Yuk.KolBoyu = gecici.KolUzunlugu;
                    System.out.print("Robotun tasima hizi:");
                    temp1=scan1.nextInt();
                    gecici.SetTasimahizi(temp1);
                    robotHizlari.add(gecici.TasimaHizi);
                    System.out.print("Robotun tasiyacagi yuk miktari:");
                    gecici.YukMiktari = scan1.nextInt();
                    for (;;) {
                        if (gecici.YukMiktari > gecici.maxYuk) {
                            System.out.println("Tasinacak yuk miktarini tekrar giriniz.");
                            System.out.print("Robotun tasiyacagi yuk miktari:");
                            gecici.YukMiktari = scan1.nextInt();
                        } else {
                            robotYukleri.add(gecici.YukMiktari);
                            gecici.SetYuk(gecici.YukMiktari);
                            break;
                        }
                    }
                    for (int j = 0; j < robotHizlari.size(); j++) {
                        if (cins.get(j).equals("paralel") && robotHizlari.get(j) < gecici.TasimaHizi) {
                            System.out.println("Hiz degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                        if (cins.get(j).equals("paralel") && robotYukleri.get(j) < gecici.YukMiktari) {
                            System.out.println("Yuk degerlerini yanlis girdiginiz icin program sonlandirildi!");
                            System.exit(0);
                        }
                    }
                    robotHizlari.add(gecici.TasimaHizi);
                    Robotlar.add(gecici);
                    ManipuleSeri g2 = (ManipuleSeri) Robotlar.get(Robotlar.size() - 1);

                }}
            else if (RobotTipiT.equals("hibrit")) {          
                    HibritRobot hibrit =new HibritRobot();                 
                    System.out.println("Hibrit robotun gezgin kismi:");
                    kisimGezgin=scan1.next();
                    HibritGezgin.add(kisimGezgin);
                    cins.add("hibrit");
                   
                    System.out.println("Hibrit robotun manipulator kismi:");
                    kisimManipulator=scan1.next();
                    HibritManipule.add(kisimManipulator);
                    System.out.println("Motor sayisini giriniz:");
                    int temp;
                    temp=scan1.nextInt();
                    hibrit.SetMotor(temp);
                    System.out.println("Max yuku giriniz:");
                    temp=scan1.nextInt();
                    hibrit.SetMaxyuk(temp);
                    
                  
                    for(;;){
                        System.out.println("Yuk miktarini giriniz:");
                        temp=scan1.nextInt();
                        if(temp>hibrit.GetMaxyuk()){
                            System.out.println("Max yuku astiniz, yeni yuk miktari:");
                        }
                        else 
                        {
                            hibrit.SetYuk(temp);
                            break;
                        }
                    }
                    hibrit.SetYuk(temp);
                    System.out.println("Kol uzunlugunu giriniz:");
                    temp=scan1.nextInt();
                    hibrit.SetKoluzunlugu(temp);
                    System.out.println("Gecis suresini giriniz:"); 
                    temp=scan1.nextInt();
                    hibrit.GecisSuresi=temp;
                    System.out.println("Sabitlenme suresini giriniz:");
                    hibrit.SabitlenmeSuresi=scan1.nextInt();
                    
                    System.out.println("Tasima hizini giriniz:");
                    temp=scan1.nextInt();
                    hibrit.SetTasimahizi(temp);
                    System.out.println("Gezinme hizini giriniz:");
                    temp=scan1.nextInt();
                    robotHizlari.add(temp);
                    hibrit.setGezinmehizi(temp);
                    if(kisimGezgin.equals("tekerlekli")){
                                   
                        System.out.print("Tekerlek sayisini giriniz:");
                         temp=scan1.nextInt();
                        hibrit.SetTekerlek(temp);   
                    }
                    if(kisimGezgin.equals("paletli")){
                        System.out.print("Palet sayisini giriniz:");
                        temp=scan1.nextInt();
                       hibrit.SetPaletsayisi(temp);
                       
                       
                    }
                    if(kisimGezgin.equals("spider")){    
                        System.out.print("Bacak sayisini giriniz:");
                         temp = scan1.nextInt();
                        hibrit.SetBacaksayisi(temp);
                     
                        
                    }
                    
                    
                    if(kisimManipulator.equals("seri")){
                        
                    }
                    if(kisimManipulator.equals("paralel")){
                        
                    }
                    
                    
                    Robotlar.add(hibrit);
 
     
                }

            }

        
      

        RobotilkYer ilkYer = new RobotilkYer();
        robot.x = engeller1.engelx.clone();
        robot.y = engeller1.engely.clone();
        for (int i = 0; i < robotSayisi; i++) {
            
            double SonSure = 0;
            robot.engelgecikmesi = 0;
            robot.bitisSuresi = 0;
            Yuk.BitisSuresi = 0;
            System.out.println("Devam etmek icin 0 i tuslayiniz:");
            int y=scan1.nextInt();
            if(y==0){
            Yuk.yukyerlerix.clear();
            Yuk.yukyerleriy.clear();
            robot.robotyerlerix.clear();
            robot.robotyerleriy.clear();
           
             window.getContentPane().remove(robot);
             window.getContentPane().remove(ilkYer);
             window.getContentPane().remove(Yuk);
            }
            System.out.println("Hangi robotla islem yapilacak?");
            int RobotSec = scan1.nextInt();
            if (robotTipi.get(i).equals("gezgin")) {
                robot.robotcinsi = cins.get(RobotSec - 1);
                robot.robotHizi = robotHizlari.get(RobotSec - 1);
            }
            System.out.println(RobotSec + ". robotun yeri(X,Y):");
            System.out.print("X:");
            ilkYer.robotyerx = scan1.nextInt();
            System.out.print("Y:");
            ilkYer.robotyery = scan1.nextInt();
            Yuk.Yukx = ilkYer.robotyerx;
            Yuk.Yuky = ilkYer.robotyery;
            robot.robotyerx2 = ilkYer.robotyerx;
            robot.robotyery2 = ilkYer.robotyery;
             //window.getContentPane().remove(robot);
            window.getContentPane().add(ilkYer);
            window.setVisible(true);
           
            if (robotTipi.get(RobotSec - 1).equals("gezgin")) {
                robot.robotyeni();
                window.getContentPane().add(robot);
                window.setVisible(true);
                //window.getContentPane().remove(ilkYer);
                if (cins.get(RobotSec - 1).equals("tekerlekli")) {
                    GezginTekerlekli gecici;
                    gecici = (GezginTekerlekli) Robotlar.get(RobotSec - 1);
                    gecici.EngelGecmeSuresiBul();
                    SonSure = robot.engelgecikmesi * gecici.EngelGecmeSuresiBul() + robot.bitisSuresi;

                }
                if (cins.get(RobotSec - 1).equals("paletli")) {
                    GezginPaletli gecici;
                    gecici = (GezginPaletli) Robotlar.get(RobotSec - 1);
                    SonSure = robot.engelgecikmesi * gecici.EngelGecmeSuresiBul() + robot.bitisSuresi;

                }
                if (cins.get(RobotSec - 1).equals("spider")) {
                    SonSure = robot.bitisSuresi;
                }
                System.out.print("Robotun hareket suresi :");
                System.out.println(SonSure);
            } 
            else if (robotTipi.get(RobotSec - 1).equals("manipulator")) {
                Yuk.YukHizi = robotHizlari.get(RobotSec - 1);
                Yuk.YukYeni();
                System.out.println("Gecen sure:" + Yuk.BitisSuresi);
                window.getContentPane().add(Yuk);
                window.setVisible(true);

            }
            
            else if(robotTipi.get(RobotSec-1).equalsIgnoreCase("hibrit")){
                
               
                
                if(HibritGezgin.get(HibritSayaci).equals("tekerlekli")){
                HibritRobot gecici= new HibritRobot();
                gecici = (HibritRobot) Robotlar.get(RobotSec-1);
                System.out.println(gecici.MotorSayisi);
                 robot.robotcinsi=HibritGezgin.get(HibritSayaci);
                 robot.robotHizi=gecici.getGezinmehizi();
                 robot.robotyeni();
                window.getContentPane().add(robot);
                window.setVisible(true);
               // window.getContentPane().remove(ilkYer);
                SonSure=robot.engelgecikmesi*gecici.EngelGecmeSuresiBulT(gecici.MotorSayisi);
                SonSure=SonSure+gecici.SabitlenmeSuresi+gecici.GecisSuresi+robot.bitisSuresi;
                
                Yuk.Yukx=robot.robotyerx2;
                Yuk.Yuky=robot.robotyery2;
                Yuk.KolBoyu=gecici.GetKoluzunlugu();
                Yuk.YukHizi=gecici.GetTasimahizi();
                System.out.println("Yuk icin yer bilgisi giriniz:");
                Yuk.YukYeni();
                window.getContentPane().add(Yuk);
                window.setVisible(true);
                SonSure=SonSure+Yuk.BitisSuresi;
                    System.out.println("Sure:"+SonSure);
                Robotlar.set(RobotSec-1, gecici);
                }
                if(HibritGezgin.get(HibritSayaci).equals("paletli")){
                HibritRobot gecici= new HibritRobot();
                gecici = (HibritRobot) Robotlar.get(RobotSec-1);
                System.out.println(gecici.MotorSayisi);
                robot.robotcinsi=HibritGezgin.get(HibritSayaci);
                robot.robotHizi=gecici.getGezinmehizi();
                robot.robotyeni();
                window.getContentPane().add(robot);
                window.setVisible(true);
                //window.getContentPane().remove(ilkYer);
                SonSure=robot.engelgecikmesi*gecici.EngelGecmeSuresiBulP(gecici.MotorSayisi);
                SonSure=SonSure+gecici.SabitlenmeSuresi+gecici.GecisSuresi+robot.bitisSuresi;
                
                Yuk.Yukx=robot.robotyerx2;
                Yuk.Yuky=robot.robotyery2;
                Yuk.KolBoyu=gecici.GetKoluzunlugu();
                Yuk.YukHizi=gecici.GetTasimahizi();
                System.out.println("Yuk icin yer bilgisi giriniz:");
                Yuk.YukYeni();
                window.getContentPane().add(Yuk);
                window.setVisible(true);
                SonSure=SonSure+Yuk.BitisSuresi;
                    System.out.println("Sure:"+SonSure);
                Robotlar.set(RobotSec-1, gecici);
                    
                }
                if(HibritGezgin.get(HibritSayaci).equals("spider")){
                HibritRobot gecici= new HibritRobot();
                gecici = (HibritRobot) Robotlar.get(RobotSec-1);     
                robot.robotcinsi=HibritGezgin.get(HibritSayaci);
                robot.robotHizi=gecici.getGezinmehizi();
                robot.robotyeni();
                window.getContentPane().add(robot);
                window.setVisible(true);
                //window.getContentPane().remove(ilkYer);
                    SonSure = robot.bitisSuresi;
                    SonSure=SonSure+gecici.GecisSuresi+gecici.SabitlenmeSuresi;
                    
                Yuk.Yukx=robot.robotyerx2;
                Yuk.Yuky=robot.robotyery2;
                Yuk.KolBoyu=gecici.GetKoluzunlugu();
                Yuk.YukHizi=gecici.GetTasimahizi();
                System.out.println("Yuk icin yer bilgisi giriniz:");
                Yuk.YukYeni();
                window.getContentPane().add(Yuk);
                window.setVisible(true);
                SonSure=SonSure+Yuk.BitisSuresi;
                    System.out.println("Sure:"+SonSure);
                Robotlar.set(RobotSec-1, gecici);
                }
                
                
                
                
              HibritSayaci++;  
            }

        }

    }

}