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
public class Person {
    private String name;
    {
        System.out.println("Anonymous block");
        name="kim";
    }

    public Person() {
        System.out.println("Default Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
