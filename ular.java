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
public class ular extends reptile{
    String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID="210";
    }
 
    public void namahewan(){
        namahewan="Ular";     
    }
 
    public void keterangan(){
        keterangan="Digolongkan dalam reptil bersisik.";
    }
 
    public void jenis(){
        jenis="Reptil";
    }
 
    public void cetakdata(){
        System.out.println("ID = "+ID);
        System.out.println("Nama Hewan = "+namahewan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
