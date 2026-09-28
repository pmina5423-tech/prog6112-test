/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public abstract class ConsoleSales implements IConsoleS{
    public abstract class GamingSales implements IGamingSales {
    private String consoleType;
    private String cityName;
    private int totalSales;

    public GamingSales(String consoleType, String cityName, int totalSales) {
        this.consoleType = consoleType;
        this.cityName = cityName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getCityName() {
        return cityName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
}
