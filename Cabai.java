package Hybrid;

public class Cabai extends Dikotil{
    String ID, namaTumbuhan, keterangan, jenis;
 
    public void ID(){
        ID="11";
    }
 
    public void namaTumbuhan(){
        namaTumbuhan="Cabai";     
    }
 
    public void keterangan(){
        keterangan="Merupakan Tumbuhan berakar tunggang berkeping dua";
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
