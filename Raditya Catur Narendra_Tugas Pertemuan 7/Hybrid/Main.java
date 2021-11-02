package Hybrid;

public class Main {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        Motor mtr = new Motor();
        Kapal kpl = new Kapal();

        mbl.bahanBakar = "Bensin";
        mbl.jumlahRoda = 4;
        mbl.merk = "Suzuka";
        mbl.turnOn();
        mbl.tambahKecepatan(40);
        mbl.kurangiKecepatan(30);

        mtr.bahanBakar = "Bensin";
        mtr.jumlahRoda = 2;
        mtr.merk = "Hondi";
        mtr.turnOn();
        mtr.tambahKecepatan(30);
        mtr.kurangiKecepatan(20);

        kpl.bahanBakar = "Bensin";
        kpl.besarLayar= 30;
        kpl.merk = "Banana";
        kpl.turnOn();
        kpl.tambahKecepatan(50);
        kpl.kurangiKecepatan(30);
    }
}
