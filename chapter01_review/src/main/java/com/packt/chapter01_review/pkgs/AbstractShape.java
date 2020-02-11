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
public abstract class AbstractShape {
     protected double dim1;
    protected double dim2;

    public AbstractShape() {
    }
    public AbstractShape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }
    public abstract double calculateArea();
}
