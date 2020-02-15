
package prolab3;

public class GezginSpider implements GezginRobot {
   public int BacakSayisi;
   public int MotorSayisi;
   public int YukMiktari;
   public int GezinmeHizi; 
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
