-/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog6112_test1;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunGamingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Console Type: ");
        String console = input.nextLine();

        System.out.print("Enter City Name: ");
        String city = input.nextLine();

        System.out.print("Enter Total Sales: ");
        int sales = input.nextInt();

        GamingSalesReport report = new GamingSalesReport(console, city, sales);
        report.printSalesReport();

        input.close();
    }
}