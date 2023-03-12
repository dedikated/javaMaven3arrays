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

}
