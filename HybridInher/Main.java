package HybridInher;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();

        kucing.nama = "Kucing";
        kucing.berlari();
        kucing.makan();
        kucing.mengeong();

        System.out.println();
        
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan";
        ikan.berenang();
        ikan.makan();
        ikan.bertelur();
    }
    
}