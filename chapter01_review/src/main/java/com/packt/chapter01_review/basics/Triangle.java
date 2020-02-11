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
public class Triangle extends Shape {

    public Triangle() {
    }

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * dim1 * dim2;
    }
}
