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
public class Address {
    private String line1;
    private String areaName;
    private String cityName;
    private String pinCode;
    private String stateName;    
    private String country;

    public Address() {
    }
    public Address(String line1, String areaName, String cityName) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
    }

    public Address(String line1, String areaName, String cityName, String pinCode) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
        this.pinCode = pinCode;
    }

    public Address(String line1, String areaName, String cityName, String stateName, String pinCode) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.pinCode = pinCode;
    }

    public Address(String line1, String areaName, String cityName, String stateName, String pinCode, String country) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.pinCode = pinCode;
        this.country = country;
    }
    public void setAddress(String line1, String areaName, String cityName) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
    }

    public void setAddress(String line1, String areaName, String cityName, String pinCode) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
        this.pinCode = pinCode;
    }

    public void setAddress(String line1, String areaName, String cityName, String stateName, String pinCode) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.pinCode = pinCode;
    }

    public void setAddress(String line1, String areaName, String cityName, String stateName, String pinCode, String country) {
        this.line1 = line1;
        this.areaName = areaName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.pinCode = pinCode;
        this.country = country;
    }
    public void getAddress() {
        System.out.println("Address:");
        System.out.println(this.line1 +"\n"+
                this.areaName +"\n" +
                this.cityName  +"\n" +
                this.pinCode + "\n" +
                this.stateName + "\n" +                 
                this.country);
    }
   /* public void setAddress (String areaName, String cityName, String stateName, String pinCode){
        
    }*/
    
}
