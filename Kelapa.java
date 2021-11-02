package Hybrid;

public class Kelapa extends Monokotil{
    String ID, namaTumbuhan, keterangan, jenis;
 
    public void ID(){
        ID="21";
    }
 
    public void namaTumbuhan(){
        namaTumbuhan="Kelapa";     
    }
 
    public void keterangan(){
        keterangan="Merupakan Tumbuhan berakar serabut berkeping satu";
    }
 
    public void jenis(){
        jenis="Monokotil";
    }
 
    public void cetakdata(){
        System.out.println("==================================================================");
        System.out.println("ID = "+ID);
        System.out.println("Nama Tumbuhan = "+namaTumbuhan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
