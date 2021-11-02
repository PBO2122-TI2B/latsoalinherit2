package Hybrid;

public class KendaraanMesin {
    public String bahanBakar;
    private boolean isOn = false;
    private double kecepatan;

    public void turnOn() {
        this.isOn = true;
    }

    public void tambahKecepatan(double newValue) {
        if(this.isOn = true) {
            this.kecepatan += newValue;
        } else {
            System.out.println("Nayalakan mesin terlebih dahulu");
        }
    }

    public void kurangiKecepatan(double newValue) {
        if(this.isOn = true && this.kecepatan >= newValue) {
            this.kecepatan -= newValue;
        } else {
            System.out.println("Kecepatan = 0");
        }
    }
}
