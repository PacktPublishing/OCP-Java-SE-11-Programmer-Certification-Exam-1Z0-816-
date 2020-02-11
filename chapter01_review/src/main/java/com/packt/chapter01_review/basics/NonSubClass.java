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
public class NonSubClass {
    public static void main(String[] args) {
        SimpleClass simpleObj = new SimpleClass();
        //private variable is not accessible here, as it can be 
        //accessed only within a class where it is declared
        //simpleObj.privateVar=10;
        simpleObj.defaultVar=20;
        simpleObj.protectedVar=30;
        simpleObj.publicVar=40;
        simpleObj.display();
    }
}
