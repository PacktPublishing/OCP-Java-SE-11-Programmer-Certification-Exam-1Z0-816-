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
public class TestShapeArray {
    public static void main(String[] args) {
        AbstractShape [] shapes = new AbstractShape[5];
        shapes[0]= new Triangle(10,15);
        shapes[1]= new Rectangle(20,5);
        shapes[2]= new Rectangle(10,50);
        shapes[3]= new Triangle(20,25);
        shapes[4]= new Rectangle(100,50);
        
        for (AbstractShape shape: shapes){
            if (shape instanceof Rectangle){
                System.out.println("Area of Rectangle :"+shape.calculateArea());
                System.out.println("Perimeter of Rectangle :"+((Rectangle)shape).calculatePerimeter());
            } else if (shape instanceof Triangle){
                System.out.println("Area of Triangle :"+shape.calculateArea());
            }
        }
        
    }
}
