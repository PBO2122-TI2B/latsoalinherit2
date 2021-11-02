/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarki;

/**
 *
 * @author Amelia
 */
public class MainHierarki {
    public static void main(String[] args){
        Unggas u = new Unggas();
        Ayam a = new Ayam("tidak berselaput", "merah", "ya");
        Bebek be = new Bebek("berselaput", "putih", "dilapisi lilin");
        Burung bu = new Burung("tidak berselaput", "hijau");
        
        a.info();
        be.info();
        bu.info();
    }
}
