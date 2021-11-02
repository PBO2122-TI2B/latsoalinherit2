/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ALIFIYUL
 */
public class TestHybridInheritance {
    public static void main(String[] args) {

		// Son object
		Son s = new Son();
		s.land();// Grand father method
		s.Car(); // Father method
		s.home();// Father method
		s.mobile();// son method
                System.out.println("----------------------------------");
                System.out.println();

		// Daughter object
		Daughter d = new Daughter();
		d.land();// Grand father method
		d.Car(); // Father method
		d.home();// Father method
		d.purse();// son method

	}
}
