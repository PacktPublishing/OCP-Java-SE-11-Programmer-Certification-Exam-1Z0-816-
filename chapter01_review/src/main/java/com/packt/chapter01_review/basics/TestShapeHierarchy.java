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
public class TestShapeHierarchy {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(25.5, 30.0);
        Triangle triangle = new Triangle(50, 40);
        
        System.out.println("The area of Rectangle :"+rectangle.calculateArea());
        System.out.println("The area of Triangle :"+triangle.calculateArea());
    }
}
