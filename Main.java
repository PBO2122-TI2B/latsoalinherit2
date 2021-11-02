package Hybrid;

public class Main {
    public static void main(String args []){
        Dikotil dikot = new Dikotil();
        Cabai cab = new Cabai();
        Kelapa kelap = new Kelapa();
        Tomat tom = new Tomat();
        TomatHijau tomh = new TomatHijau();
        Monokotil monokot = new Monokotil();
        KelapaWulung kelapw = new KelapaWulung();

        System.out.println("Berikut daftar klasifikasi tumbuhan beserta contoh jenisnya: ");
        System.out.println(" ");
        dikot.ID();
        dikot.namaTumbuhan();  
        dikot.keterangan();
        dikot.jenis();
        dikot.cetakdata();
        System.out.println(" ");

        cab.ID();
        cab.namaTumbuhan();
        cab.keterangan();
        cab.jenis();
        cab.cetakdata();
        System.out.println(" ");

        kelap.ID();
        kelap.namaTumbuhan();
        kelap.keterangan();
        kelap.jenis();
        kelap.cetakdata();
        System.out.println(" ");

        tom.ID();
        tom.namaTumbuhan();
        tom.keterangan();
        tom.jenis();
        tom.cetakdata();
        System.out.println(" ");

        monokot.ID();
        monokot.namaTumbuhan();
        monokot.keterangan();
        monokot.jenis();
        monokot.cetakdata();
        System.out.println(" ");

        tomh.ID();
        tomh.namaTumbuhan();
        tomh.keterangan();
        tomh.jenis();
        tomh.cetakdata();
        System.out.println(" ");
    
        kelapw.ID();
        kelapw.namaTumbuhan();
        kelapw.keterangan();
        kelapw.jenis();
        kelapw.cetakdata();
        System.out.println(" ");
        }
}
