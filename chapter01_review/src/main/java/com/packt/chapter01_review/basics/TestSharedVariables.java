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
public class TestSharedVariables {
    public static void main(String[] args) {
        SharedVariables.displayObjectCounter();
        SharedVariables obj1 = new SharedVariables(37);
        SharedVariables.displayObjectCounter();
        SharedVariables obj2 = new SharedVariables(45);
        SharedVariables.displayObjectCounter();
        SharedVariables obj3 = new SharedVariables(134);
        SharedVariables.displayObjectCounter();
        obj1.displayObject();
        obj2.displayObject();
        obj3.displayObject();
    }
}
