/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_test1;

/**
 *
 * @author Student
 */
public class ConsoleSalesReport {
    public class GamingSalesReport extends GamingSales {

    public GamingSalesReport(String consoleType, String cityName, int totalSales) {
        super(consoleType, cityName, totalSales);
    }

    public void printSalesReport() {
        System.out.println("----------------------------------------");
        System.out.println("        GAMING SALES REPORT");
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("CITY: " + getCityName());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("----------------------------------------");
    }
}
}
