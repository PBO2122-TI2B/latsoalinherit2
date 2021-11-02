/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HybridInheritance;

/**
 *
 * @author Asus X453
 */
public class HybridInheritence {
    public static void main(String[] args) {

		AnakLaki lak = new AnakLaki();
		lak.lahan();
		lak.mobil();
		lak.rumah();
		lak.Handphone();

                AnakPerempuan per = new AnakPerempuan();
                per.lahan();
		per.mobil();
		per.rumah();
		per.Tas();
        }
}
