/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori7tg2;

/**
 *
 * @author SMK TELKOM
 */
public class Staff extends Employee{
    public int overtime, deduction;
    String tittle, major;
    
    public Staff(){
    }
    public Staff(String name, String address, int salary, int overtime,int deduction, String tittle, String major){
        super(name, address, salary);
        this.overtime = overtime;
        this.deduction = deduction;
        this.tittle = tittle;
        this.major = major;
    }
    public void TampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Major      : "+major);
        System.out.println("Tittle     : "+tittle);
        System.out.println("Overtime   : "+overtime);
        System.out.println("Deduction  : "+deduction);
        System.out.println("Total Slary: "+(salary+overtime-deduction));
    }
}
