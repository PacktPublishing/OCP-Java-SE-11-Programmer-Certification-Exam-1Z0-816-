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
public class TestAddress {
    public static void main(String[] args) {
        Address address1= new Address("No.7, Royal Garden Apts.", "Gokulam", "Mysore");
        Address address2= new Address("No.9, Royal Garden Apts.", "Gokulam", "Mysore","570002");
        Address address3= new Address("No.12, Sankalp Apts.", "Gokulam", "Mysore","Karnataka","570002");
        Address address4= new Address("No.12, Sankalp Apts.", "Gokulam", "Mysore","Karnataka","570002","india");
        
        address1.getAddress();
        address2.getAddress();
        address3.getAddress();
        address4.getAddress();
    }
}
