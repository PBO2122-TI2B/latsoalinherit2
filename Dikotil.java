package Hybrid;

public class Dikotil extends Tumbuhan{
    String ID, namaTumbuhan, keterangan, jenis;
 
    public void ID(){
        ID="10";
    }
 
    public void namaTumbuhan(){
        namaTumbuhan ="Dikotil";     
    }
 
    public void keterangan(){
        keterangan="Merupakan Tumbuhan yang memiliki biji berkeping dua";
    }
 
    public void jenis(){
    }
 
    public void cetakdata(){
        System.out.println("==================================================================");
        System.out.println("ID = "+ID);
        System.out.println("Nama Tumbuhan = "+namaTumbuhan);
        System.out.println("Keterangan = "+keterangan);
    }
}
