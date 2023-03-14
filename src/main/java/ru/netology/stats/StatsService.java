package ru.netology.stats;

public class StatsService {
    // месяц мин суммы продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
//вся сумма
    public long allSum (long[] sales){
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
// средняя сумма продаж в месяц
    public long averageSales (long[] sales) {
         return allSum(sales) / 12;
    }
// месяц мак суммы продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
// месяцы, когда продажи были ниже среднего

    public int averageMinSales(long[] sales) {
        long averageAmountMin = averageSales(sales);
        int aveMinSales = 0;
        for (long sale : sales) {
            if (sale < averageAmountMin){
                aveMinSales++;
            }
        }
        return aveMinSales;
    }
// месяцы, когда продажи были выше среднего

    public int averageMaxSales(long[] sales) {
        long averageAmountMax = averageSales(sales);
        int aveMaxSales = 0;
        for (long sale : sales) {
            if (sale > averageAmountMax){
                aveMaxSales++;
            }
        }
        return aveMaxSales;
    }
}
