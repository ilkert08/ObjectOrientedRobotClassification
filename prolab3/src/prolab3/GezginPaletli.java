package prolab3;

public class GezginPaletli implements GezginRobot {
  public int PaletSayisi;
  public int MotorSayisi;
  public int YukMiktari;
  public int GezinmeHizi;
   
  
    public double EngelGecmeSuresiBul(){
        double EngelSuresi;
            EngelSuresi= 3*this.MotorSayisi; 
          return EngelSuresi;
    }

    

    @Override
    public void SetMotor(int MotorSayisi) {
            this.MotorSayisi= MotorSayisi;
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
  
    
}
