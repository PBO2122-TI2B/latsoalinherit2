package Hybrid;

public class Tomat extends Dikotil {
    String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID="12";
    }
 
    public void namaTumbuhan(){
        namaTumbuhan="Tomat";     
    }
 
    public void keterangan(){
        keterangan="Merupakan Tumbuhan berbatang cabang dan berkeping dua";
    }

    public void jenis(){
        jenis="Dikotil";
    }
 
    public void cetakdata(){
        System.out.println("==================================================================");
        System.out.println("ID = "+ID);
        System.out.println("Nama Tumbuhan = "+namaTumbuhan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
