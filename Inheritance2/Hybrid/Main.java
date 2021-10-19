package Inheritance2.Hybrid;

public class Main {
    public static void main(String[] args) {
        Windows obj = new Windows();
        obj.merk = "Asus";
        obj.sizeMemory = 8;
        obj.processor = "AMD";
        obj.tampilData();
        obj.aturKapasitasBaterai(20000);
        obj.tambahFitur("Scanning Virus");

        System.out.println();

        Handphone obj2 = new Handphone();
        obj2.merk = "Xiomi";
        obj2.sizeMemory = 3;
        obj2.processor = "Snapdragon";
        obj2.tampilData();
        obj2.aturUkuranLayar(6);

    }
}
