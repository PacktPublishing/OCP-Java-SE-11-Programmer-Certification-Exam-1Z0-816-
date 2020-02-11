/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packt.chapter01_review.pkgs;
import com.packt.chapter01_review.basics.SimpleClass;
/**
 *
 * @author Nancy
 */
public class NonSubClassDifferentPkg {
    public static void main(String[] args) {
        SimpleClass simpleOb = new SimpleClass();
        //private variables are not available here, can you tell the reason for it?
        //simpleOb.privateVar=11;
        //default variable cannot be accessed in this class, 
        //as default variables can be accessed only within the same package
        //simpleOb.defaultVar=22;
        //protected variable cannot be accessed as it can be accessed only 
        //in a sub-class in a different package
        //simpleOb.protectedVar=33;
        simpleOb.publicVar=44;
        simpleOb.display();
        
    }
}
