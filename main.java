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
public class main {
    public static void main(String args []){
    mamalia mamaliaku = new mamalia();
    sapi sapiku = new sapi();
    reptile reptilku = new reptile();
    ular ularku = new ular();
 
 
    System.out.println("Berikut daftar klasifikasi hewan beserta contoh hewannya: ");
    System.out.println(" ");
    mamaliaku.ID();
    mamaliaku.namahewan();
    mamaliaku.keterangan();
    mamaliaku.jenis();
    mamaliaku.cetakdata();
    System.out.println(" ");
 
    sapiku.ID();
    sapiku.namahewan();
    sapiku.keterangan();
    sapiku.jenis();
    sapiku.cetakdata();
    System.out.println(" ");
 
    reptilku.ID();
    reptilku.namahewan();
    reptilku.keterangan();
    reptilku.jenis();
    reptilku.cetakdata();
    System.out.println(" ");

    ularku.ID();
    ularku.namahewan();
    ularku.keterangan();
    ularku.jenis();
    ularku.cetakdata();
    System.out.println(" "); 
    }
}
