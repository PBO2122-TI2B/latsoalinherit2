package Inheritance2.Hierarchical;
public class TestInheritance {
    public static void main(String[] args) {
        MobilA obj1 = new MobilA();
        obj1.merk = "BMW";
        obj1.speed = 800;
        obj1.kecepatanSekarang = 100;
        obj1.warna = "Merah";
        obj1.gantiWarnaMobil();
        obj1.info();
        obj1.tambahKecepatan();
        System.out.println();

        MobilB obj2 = new MobilB();
        obj2.merk = "Honda";
        obj2.speed = 100;
        obj2.kecepatanSekarang = 200;
        obj2.aturTangki = 50;
        obj2.aturTangkiMobil();
        obj2.info();
        obj2.tambahKecepatan();
        System.out.println();

        MobilC obj3 = new MobilC();
        obj3.merk = "Jeep";
        obj3.speed = 400;
        obj2.kecepatanSekarang = 50;
        obj3.kapasitas = 4;
        obj3.aturKapasitasMobil();
        obj3.info();
        obj2.tambahKecepatan();
    }
}
