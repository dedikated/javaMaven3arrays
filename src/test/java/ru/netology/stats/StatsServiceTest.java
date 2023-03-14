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

    @Test
    public void findBetweenMaxSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void findAveMinSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.averageMinSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void findAveMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        long actual = service.averageMaxSales(sales);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}
