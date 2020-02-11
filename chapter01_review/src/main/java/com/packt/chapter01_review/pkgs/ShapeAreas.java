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
public class ShapeAreas {
    public double area(Rectangle rectangle){
        return rectangle.calculateArea();
    }
    public double area(Triangle triangle){
        return triangle.calculateArea();
    }
}
