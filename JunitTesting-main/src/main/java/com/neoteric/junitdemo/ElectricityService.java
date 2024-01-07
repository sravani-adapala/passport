package com.neoteric.junitdemo;

import jdk.jfr.Name;

import java.util.Date;
import java.util.jar.Attributes;

public class ElectricityService {
    public ElectriCityBill generateElectricityBill(int units,String custId, String name, String houseName, String flatNo, int currentUnits, int amount, Date month) {
        System.out.println(" from ElectricityService  generateBill ");

        int currentCharge = 0;

        if (units == 100) {
            currentCharge = units * 1;

        }
        if (units == 200) {
            currentCharge = units * 2;

        }
        if (units == 300) {
            currentCharge = units * 3;


        }
        ElectriCityBill bill = new ElectriCityBill(custId, name, houseName, flatNo, currentUnits, amount, month);
        return bill;




    }

}
