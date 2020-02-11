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
public class Rectangle extends Shape{

    public Rectangle() {
    }

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double calculateArea(){
        return dim1 * dim2;
    }
    public double calculatePerimeter(){
        return 2 *( dim1 + dim2 );
    }
    
}
