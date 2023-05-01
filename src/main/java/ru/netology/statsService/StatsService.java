package ru.netology.statsService;

import java.util.Arrays;

public class StatsService {

    //1 Сумма всех продаж
    public  int sum(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
        return sum;
    }

    //2 Средняя сумма всех продаж
    public  int averageSales(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
            int i = sales.length;
            int averageSales = sum / i;

            return averageSales;
        }

    //3 Месяц с максимальным числом продаж
    public int getMaxSales(int[] sales) {
        int maxSales = sales[0];
        for (int t : sales) {
            if (t < maxSales) {
                maxSales = t + 1;
            }
        }
        return maxSales;
    }


    //4 Месяц с минимальным числом продаж
    public int getMinSales(int[] sales) {
        int minSales = sales[0];
        for (int t : sales) {
            if (t < minSales) {
                minSales = t + 1;
            }
        }
        return minSales;
    }

    //5 количество месяцев, в которых продажи были ниже среднего;
    public int belowAverage(int[] sales) {
        int averageSales = Arrays.stream(sales).sum() / sales.length;
        int month = 0;
        for (int x = 0; x < sales.length; x++)
            if (sales[x] < averageSales) {
                month = month + 1;
            } else {
                month = month;
            }
        return month;
    }

    //5 количество месяцев, в которых продажи были выше среднего;
    public int afterAverage(int[] sales) {
        int averageSales = Arrays.stream(sales).sum() / sales.length;
        int month = 0;
        for (int x = 0; x < sales.length; x++)
            if (sales[x] > averageSales) {
                month = month + 1;
            } else {
                month = month;
            }
        return month;
    }
}