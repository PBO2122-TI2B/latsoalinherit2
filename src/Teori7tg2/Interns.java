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
public class Interns extends Employee{
    public int range = 3000000, workHour = 100;
    public String collage, sid;
    public Interns(){
    }
    public Interns(String name, String address, int salary, String collage, String sid){
        super(name, address, salary);
        this.collage = collage;
        this.sid = sid;
    }
    public void ShowInterns(){
         System.out.println("***************Interns Data***************");
         System.out.println("Collage's Name     : "+collage);
         System.out.println("Sid                : "+sid);
         super.tampilDataKaryawan();
         System.out.println("Interns Salary     : "+(super.salary - range));
         System.out.println("Total Work Hour    : "+workHour);
         System.out.println("Total Gaji         : "+(super.salary - range)*workHour);
         
    }
}

