/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author ASUS
 */
public class sapi extends mamalia {
    String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID="101";
    }
 
    public void namahewan(){
        namahewan="Sapi";     
    }
 
    public void keterangan(){
        keterangan="Merupakan hewan berkaki empat dan menghasilkan susu";
    }
 
    public void jenis(){
        jenis="Mamalia";
    }
 
    public void cetakdata(){
        System.out.println("ID = "+ID);
        System.out.println("Nama Hewan = "+namahewan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
