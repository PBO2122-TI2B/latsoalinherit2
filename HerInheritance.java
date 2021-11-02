/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HierarchicalInheritance;

/**
 *
 * @Nurlaily Asrobika Asus X453
 */
public class HerInheritance {
    public static void main(String args[]){
    KaryawanTetap p = new KaryawanTetap ();
    KaryawanSementara t = new KaryawanSementara();

    System.out.println("Gaji dari Karyawan tetap adalah :" +p.Gaji);
    System.out.println("Kenaikan gaji dari Karyawan tetap adalah:" +p.kenaikan);
    System.out.println("Gaji dari Karyawan sementara adalah :" +t.Gaji);
    System.out.println("Kenaikan gaji dari Karyawan sementara adalah :" +t.kenaikan);
    }
   } 
