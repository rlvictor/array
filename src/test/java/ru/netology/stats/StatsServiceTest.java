package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void testSumStatsService() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Сумма продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void testAverageStatsService() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void testMaxSalesStatsService() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц, в котором был максимум продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void testMinSalesStatsService() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц, в котором был минимум продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void testBelowAverageStatsService() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, где продажи ниже среднего " + actual + " " + (expected == actual));
    }

    @Test
    public void testUnderAverageStatsService() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.underAverageSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, где продажи выше среднего " + actual + " " + (expected == actual));
    }

}