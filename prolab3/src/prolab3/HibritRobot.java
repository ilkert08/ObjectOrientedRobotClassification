package prolab3;

public class HibritRobot implements ManipulatorRobot, IGezginPaletli,IGezginSpider,IGezginTekerlekli {
    public int maxYuk;
    public int KolUzunlugu;
    public int TasimaHizi;
    public int SabitlenmeSuresi;
    public int GecisSuresi;
    public int MotorSayisi;
    public int YukMiktari;
    public int GezinmeHizi;
    private int PaletSayisi;
    private int TekerlekSayisi;
    private int BacakSayisi;
    
    
    
     @Override
    public void SetMaxyuk(int maxyuk) {
            this.maxYuk= maxyuk;
    }

    @Override
    public int GetMaxyuk() {
        return this.maxYuk;
    }

    @Override
    public void SetKoluzunlugu(int koluzunlugu) {
        this.KolUzunlugu=koluzunlugu;
    }

    @Override
    public int GetKoluzunlugu() {
            return this.KolUzunlugu;
    }

    @Override
    public void SetTasimahizi(int tasimahizi) {
        this.TasimaHizi=tasimahizi;
    }

    @Override
    public int GetTasimahizi() {
            return this.TasimaHizi;
    }

    @Override
    public void SetMotor(int MotorSayisi) {
        this.MotorSayisi=MotorSayisi;
    }

    @Override
    public void SetYuk(int yukMiktari) {
        this.YukMiktari=yukMiktari;
    }

    @Override
    public int GetMotor() {
        return this.MotorSayisi;
    }

    @Override
    public int GetYuk() {
           return this.YukMiktari;
    }

    @Override
    public void setGezinmehizi(int GezinmeHizi) {
        this.GezinmeHizi=GezinmeHizi;
    }

    @Override
    public int getGezinmehizi() {
        return this.GezinmeHizi;
    }

    @Override
    public void SetPaletsayisi(int paletsayisi) {
        this.PaletSayisi=paletsayisi;
    }

    @Override
    public int GetPaletsayisi() {
        return this.PaletSayisi;
    }

    @Override
    public void SetBacaksayisi(int bacaksayisi) {
        this.BacakSayisi=bacaksayisi;
    }

    @Override
    public int GetBacaksayisi() {
        return this.BacakSayisi;
    }

    @Override
    public void SetTekerlek(int tekerleksayisi) {
        this.TekerlekSayisi=tekerleksayisi;
    }

    @Override
    public int GetTekerlek() {
        return this.TekerlekSayisi;
    }
    
    @Override
    public double EngelGecmeSuresiBulP(int motorsayisi) {
       double temp=3*motorsayisi;  
        return temp ;
    }
    
    @Override
    public double EngelGecmeSuresiBulT(int motorsayisi) {
        
        double temp= (0.5)*motorsayisi;  
        return temp ;
        
    }
    
  

}
