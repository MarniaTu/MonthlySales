package ru.netology.stats;

public class StatsService {
    public int getAllSalesSum(int[] sales) {
        int salesSum = 0;
        for (int i : sales) {
            salesSum += i;
        }
        return salesSum;
    }

    public int getAllSalesAverage(int[] sales) {
        int salesAverage = getAllSalesSum(sales) / 12;
        return salesAverage;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calcMonthsWithSalesBelowAverage(int[] sales) {
        int countMonths = 0;
        int averageSales = getAllSalesAverage(sales);
        for (int sale : sales) {

            if (sale < averageSales) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int calcMonthsWithSalesAboveAverage(int[] sales) {
        int count = 0;
        int averageSales = getAllSalesAverage(sales);
        for (int sale : sales) {


            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
