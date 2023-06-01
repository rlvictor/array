import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sumSales = service.sumSales(sales);
        System.out.println(sumSales);

        int averageSales = service.averageSales(sales);
        System.out.println(averageSales);

        int maxSales = service.maxSales(sales);
        System.out.println(maxSales);

        int minSales = service.minSales(sales);
        System.out.println(minSales);

        int belowAverageSales = service.belowAverageSales(sales);
        System.out.println(belowAverageSales);

        int underAverageSales = service.underAverageSales(sales);
        System.out.println(underAverageSales);
    }
}