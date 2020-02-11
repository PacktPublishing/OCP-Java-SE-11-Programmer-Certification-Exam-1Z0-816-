/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packt.chapter01_review.pkgs;

/**
 *
 * @author Nancy
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        AbstractShape shape;
        shape = new Rectangle(25,30);
        System.out.println("Area of Rectangle :"+shape.calculateArea());
        //double peri=shape.getPerimeter(); 
        shape = new Triangle(20,10);
        System.out.println("Area of Triangle :"+shape.calculateArea());
    }
}
