public class GamingConsoleReport {
    
    public static void main(String[] args) {
        
        // 1D: City names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // 1D: Console types (columns)
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // 2D: Sales data — [city][console]
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

      
        System.out.println("----------------------------------------");
        System.out.println("         GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------");
        
        // Header row with console names
        System.out.printf("%-18s %-10s %-10s %-10s %n", 
                          "", consoles[0], consoles[1], consoles[2]);

        int[] cityTotals = new int[cities.length];
        int highestSales = 0;
        String topCity = "";

        for (int row = 0; row < sales.length; row++) {
            // Print city name
            System.out.printf("%-18s", cities[row]);
            
            // Print each console's sales + accumulate total
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("%-10d", sales[row][col]);
                cityTotals[row] += sales[row][col];
            }
            System.out.println(); // New line after each city
        }
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");
        
        for (int row = 0; row < cities.length; row++) {
            System.out.printf("%-18s %d %n", cities[row], cityTotals[row]);
            
            // Track city with highest sales
            if (cityTotals[row] > highestSales) {
                highestSales = cityTotals[row];
                topCity = cities[row];
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("----------------------------------------");
    }
}