package ru.netology.statsService;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    //1 Сумма всех продаж
    @Test
    public void amountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountSales = 180;
        int actualAmountSales = service.sum(sales);

        Assertions.assertEquals(expectedAmountSales, actualAmountSales);
        System.out.println(expectedAmountSales + " == ? == " + actualAmountSales);
    }

    //2 Средняя сумма всех продаж
    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 15;
        int actualAverageSales = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
        System.out.println(expectedAverageSales + " == ? == " + actualAverageSales);
    }

    //3 Месяц с максимальным числом продаж
    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 8;
        int actualAverageSales = service.getMaxSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
        System.out.println(expectedAverageSales + " == ? == " + actualAverageSales);
    }

    //4 Месяц с минимальным числом продаж
    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 8;
        int actualAverageSales = service.getMinSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
        System.out.println(expectedAverageSales + " == ? == " + actualAverageSales);
    }

    //5 количество месяцев, в которых продажи были ниже среднего;
    @Test
    public void findTheNumberOfMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 5;
        int actualAverageSales = service.belowAverage(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
        System.out.println(expectedAverageSales + " == ? == " + actualAverageSales);
    }

    //6 количество месяцев, в которых продажи были выше среднего;
    @Test
    public void findTheNumberOfMonthsWithSalesAfterAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 5;
        int actualAverageSales = service.afterAverage(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
        System.out.println(expectedAverageSales + " == ? == " + actualAverageSales);
    }
}

