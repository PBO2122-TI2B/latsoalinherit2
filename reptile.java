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
public class reptile extends hewan  {
    String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID="200";
    }
 
    public void namahewan(){
        namahewan="Reptil";     
    }
 
    public void keterangan(){
        keterangan="Merupakan hewan vertebrata yang berdarah dingin";
    }
 
    public void jenis(){
    }
 
    public void cetakdata(){
        System.out.println("ID = "+ID);
        System.out.println("Nama Hewan = "+namahewan);
        System.out.println("Keterangan = "+keterangan);
    }
}
