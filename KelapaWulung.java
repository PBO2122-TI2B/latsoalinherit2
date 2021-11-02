package Hybrid;

public class KelapaWulung extends Kelapa{
    String ID, namaTumbuhan, keterangan, jenis;
 
    public void ID(){
        ID="13";
    }
 
    public void namaTumbuhan(){
        namaTumbuhan="Kelapa Wulung";     
    }
 
    public void keterangan(){
        keterangan="Merupakan Tumbuhan berakar serabut berkeping satu dan memiliki warna buah pink";
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
