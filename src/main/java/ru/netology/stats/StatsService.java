package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = sumSales(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int underAverageSales(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}
