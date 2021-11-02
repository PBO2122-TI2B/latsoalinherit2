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
public class MainEmployee {
    public static void main(String[] args) {
    // instance object emp1 and emp2
    FullTimeEmployee emp1 = new FullTimeEmployee();
    InternEmployee emp2 = new InternEmployee();
 
    System.out.println("Salary of a full-time employee before incrementing:");
    emp1.displaySalary();
 
    System.out.println("Salary of an intern before incrementing:");
    emp2.displaySalary();
 
    // salary incremented
    emp1.incrementSalary();
    emp2.incrementSalary();
 
    System.out.println("Salary of a full-time employee after incrementing:");
    emp1.displaySalary();
 
    System.out.println("Salary of an intern after incrementing:");
    emp2.displaySalary();
    }
}
