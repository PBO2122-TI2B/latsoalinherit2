/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepart2;

/**
 *
 * @author ALIFIYUL
 */
public class Test {
    public static void main(String[] args) {
        Sapi s=new Sapi();
        s.nama1();
        s.melenguh();
        s.warnasapi();
        s.kategori();
        s.makanan();
        s.jmlhkaki();
        System.out.println("----------------------------------");
        System.out.println();
        Kambing k=new Kambing();
        k.nama2();
        k.mengembik();
        k.warnakambing();
        k.kategori();
        k.makanan();
        k.jmlhkaki();
        System.out.println("----------------------------------");
        System.out.println();
        Kuda kd=new Kuda();
        kd.nama3();
        kd.meringkik();
        kd.warnakuda();
        kd.kategori();
        kd.makanan();
        kd.jmlhkaki();
    }
}
