/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.inheritance2.teori;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class HybridInheritance {
    public static void main(String[]args)
    {
        Son obj = new Son(); //instance object from class Son
        obj.printSon();  // Accessing Son class method
        obj.printFather();  // Accessing Father class method
        obj.printGrandFather();  // Accessing GrandFather class method
        System.out.println("");
        Daughter obj2 = new Daughter(); //instance object from class Daughter
        obj2.printDaughter();  // Accessing Daughter class method
        obj2.printFather();    // Accessing Father class method
        obj2.printGrandFather();   // Accessing GrandFather class method
    }
}
