package Hybrid;

public class TomatHijau extends Tomat{
    String ID, namaTumbuhan, keterangan, jenis;
 
    public void ID(){
        ID="13";
    }
 
    public void namaTumbuhan(){
        namaTumbuhan="Tomat Hijau";     
    }
 
    public void keterangan(){
        keterangan="Merupakan Tumbuhan Dikotil yang memiliki batang bercabang dan berwarna hijau";
    }
 
    public void jenis(){
        jenis="Tomat";
    }
 
    public void cetakdata(){
        System.out.println("==================================================================");
        System.out.println("ID = "+ID);
        System.out.println("Nama Tumbuhan = "+namaTumbuhan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
