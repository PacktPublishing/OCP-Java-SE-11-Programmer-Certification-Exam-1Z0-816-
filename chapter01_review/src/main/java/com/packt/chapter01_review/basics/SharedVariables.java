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
public class SharedVariables {
    // static variables objectCounter is a class variable
    private static int objectCounter;
    private int objectVar;
    
    public SharedVariables(int data){
        objectCounter++;
        objectVar=data;
    }
    public static void displayObjectCounter(){
        System.out.println("Number of objects created : "+objectCounter);
    }
    public void displayObject(){
        System.out.println("Value of objectCounter :"+objectCounter);
        System.out.println("Value of objectVar :"+objectVar);
    }
}
