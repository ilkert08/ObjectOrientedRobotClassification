package prolab3;

public class ManipuleParalel implements ManipulatorRobot {
    public int maxYuk=0;
    public int KolUzunlugu=0;
    public int TasimaHizi=0;
    public int YukMiktari=0;
    public int MotorSayisi=0;
    
    
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
 
    
    
}