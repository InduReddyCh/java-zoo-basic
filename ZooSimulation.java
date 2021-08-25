/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.csis;

/**
 *
 * @author S545151
 */
public class ZooSimulation {
    static String greeting = "Welcome to Zoo!";
        
    /*
    * Execution begins here
    */
    public static void main(String args[]) {

      System.out.println(greeting.toUpperCase());
      
      Hippopotamus h1 = new Hippopotamus();
      h1.speak();
      h1.move();
      h1.run();
      
    }
}
