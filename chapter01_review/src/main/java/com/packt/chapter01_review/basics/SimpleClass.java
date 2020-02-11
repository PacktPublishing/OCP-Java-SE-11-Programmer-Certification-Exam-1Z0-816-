/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packt.chapter01_review.basics;

/**
 *
 * @author Nancy
 */
public class SimpleClass {
    //private variables are accessible only within the class
    private int privateVar;
    //Default variables are accessible only within the same package
    int defaultVar;
    //protected variables are accessible in the same package and to subclass in another package
    protected int protectedVar;
    //public variables are accessible everywhere
    public int publicVar;
    
    public SimpleClass(){
        privateVar=1;
        defaultVar=2;
        protectedVar=3;
        publicVar=4;        
    }
    public void display(){
        System.out.println("Private Variable :"+privateVar);
        System.out.println("Default variable :"+defaultVar);
        System.out.println("Protected variable :"+protectedVar);
        System.out.println("Public Variable :"+publicVar);
    }
    public static void main(String[] args) {
        SimpleClass simpleObject= new SimpleClass();
        simpleObject.display();
    }
}
