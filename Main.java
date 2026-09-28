public class Main {

    public static void main(String[] args) {

        // Cities and their console sales
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[] ps5Sales   = {1000, 2000, 1500};
        int[] xboxSales  = {2000, 3000, 1100};
        int[] switchSales = {3000, 4000, 1200};

        // 1. Product breakdown table
        System.out.println("Place\t\tPS5\tXbox\tSwitch");
        System.out.println("----------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            // Extra tab for shorter city names so columns stay aligned
            String spacing = cities[i].length() < 10 ? "\t\t" : "\t";
            System.out.println(cities[i] + spacing
                    + ps5Sales[i] + "\t"
                    + xboxSales[i] + "\t"
                    + switchSales[i]);
        }

        // 2. Total sales per city + track the highest
        System.out.println("\nCity\t\tTotal Sales");
        System.out.println("--------------------------");

        int highestTotal = -1;
        String topCity = "";

        for (int i = 0; i < cities.length; i++) {
            int cityTotal = ps5Sales[i] + xboxSales[i] + switchSales[i];

            String spacing = cities[i].length() < 10 ? "\t\t" : "\t";
            System.out.println(cities[i] + spacing + cityTotal);

            // Keep track of the city with the most sales so far
            if (cityTotal > highestTotal) {
                highestTotal = cityTotal;
                topCity = cities[i];
            }
        }

        // 3. Announce the winner
        System.out.println("\nCity with the most sales: " + topCity);
    }
}



