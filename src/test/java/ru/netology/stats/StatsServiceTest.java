package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateAllSalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesSum = 180;
        int actualSalesSum = service.getAllSalesSum(sales);

        Assertions.assertEquals(expectedSalesSum, actualSalesSum);

    }

    @Test
    public void shouldCalculateAllSalesAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.getAllSalesAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCalculateMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonths = 5;
        int actualCountMonths = service.calcMonthsWithSalesBelowAverage(sales);

        Assertions.assertEquals(expectedCountMonths, actualCountMonths);
    }

    @Test
    public void shouldCalculateMonthsWithSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsNumber = 5;
        int actualMonthsNumber = service.calcMonthsWithSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonthsNumber, actualMonthsNumber);
    }
}
