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
public class StaticBlocks {
    private static int visitorCount;
    private int visitorCode;
    static {
        System.out.println("This is a static block");
        visitorCount=1;
    }
    public static void displayVisitorCount(){
        System.out.println("You are visitor number :"+visitorCount);
    }
    public StaticBlocks(){
        visitorCode=visitorCount;
        visitorCount++;
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        displayVisitorCount();
    }
}
