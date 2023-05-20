package ru.netology.statsService;

import java.util.Arrays;

public class StatsService {

    //1 Сумма всех продаж
    public int sum(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
        return sum;
    }

    //2 Средняя сумма всех продаж
    public int averageSales(int[] sales) {
        int sum = sum(sales);
        int averageSales = sum / sales.length;
        return averageSales;
    }

    //3 Месяц с максимальным числом продаж
    public int getMaxSales(int[] sales) {
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) {
                monthMaxSales = i;
            }
        }
        return monthMaxSales + 1;
    }

    //4 Месяц с минимальным числом продаж
    public int getMinSales(int[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    //5 количество месяцев, в которых продажи были ниже среднего;
    public int belowAverage(int[] sales) {
        int averageSales = averageSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                month = month + 1;
            }
        }
        return month;

    }

    //6 количество месяцев, в которых продажи были выше среднего;
    public int afterAverage(int[] sales) {
        int averageSales = averageSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                month = month + 1;
            }
        }
        return month;
    }
}
