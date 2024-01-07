package com.neoteric.junitdemo;

import java.sql.Date;

public class ElectricityBillProcessing {
    ElectricityService electricityService;
    public ElectriCityBill generateBill(CustomerElectricityBill bill){
        int units = bill.getCurrentUnits() - bill.getPreviousUnits();
        ElectriCityBill bill1=electricityService.generateElectricityBill(units,bill.getCustId(),bill.getName(),bill.getHouseName(), bill.getFlatNo(), bill.getCurrentUnits(),bill.getAmount(),bill.getDate());
        return bill1;
    }

    public void setElectricityService(ElectricityService electricityService){
        this.electricityService=electricityService;
    }

}
