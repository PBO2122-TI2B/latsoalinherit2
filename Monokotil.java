package Hybrid;

public class Monokotil extends Tumbuhan {
    String ID, namaTumbuhan, keterangan, jenis;
 
    public void ID(){
        ID="20";
    }
 
    public void namaTumbuhan(){
        namaTumbuhan="Monokotil";     
    }
 
    public void keterangan(){
        keterangan="Merupakan Tumbuhan yang memiliki biji berkeping satu";
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
