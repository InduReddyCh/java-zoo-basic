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
public class Hippopotamus  extends Animal {
    
    @Override
    public void speak() {
        System.out.println("I'm an Hippopotamus!");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    @Override
    public void run(){
        System.out.println("I am running");
    }
}
