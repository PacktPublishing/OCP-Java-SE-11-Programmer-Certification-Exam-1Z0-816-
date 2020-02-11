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
public class TestAbstractShape {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(20,40);
        Triangle triangle = new Triangle(10,15);
        
        System.out.println("The area of Rectangle :"+rectangle.calculateArea());
        System.out.println("The area of Triangle :"+triangle.calculateArea());
    }
}
