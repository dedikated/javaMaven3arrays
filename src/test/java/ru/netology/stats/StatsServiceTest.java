package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void findBetweenMinSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void findAllSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.allSum(sales);

        Assertions.assertEquals(expected,actual);
        System.out.println(actual);

    }

    @Test
    public void findAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}
