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
public class Employee {
    public String name, address;
    public int salary;
    
    public Employee(){    
    }
    public Employee(String name, String address, int salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public void tampilDataKaryawan(){
        System.out.println("Name    : "+name);
        System.out.println("Address : "+name);
        System.out.println("Salary  : "+name);
    }
}
