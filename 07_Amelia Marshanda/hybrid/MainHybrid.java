/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hybrid;

/**
 *
 * @author Amelia
 */
public class MainHybrid {
    public static void main(String[] args){
        Hewan h = new Hewan();
        Mamalia m = new Mamalia();
        Anjing a = new Anjing("darat", "Pitbull", "coklat");
        Paus p = new Paus("air", "Beluga", "putih");
        
        a.info();
        p.info();
    }
}
