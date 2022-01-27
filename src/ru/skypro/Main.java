package ru.skypro;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
// 1 Task
        System.out.println("1 Task ");
        System.out.println("See in source code.");
        // Целочисленные
        byte b1 = 8;
        short s1 = 333;
        int i1 = 40_000;
        long l1 = 1_000_000L;
        // С плаваюдей точкой
        float f1 = 3.14f;
        double d1 = 2.888880013;

// 2 Task
        System.out.println();
        System.out.println("2 Task ");
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        System.out.println("Общий вес двух боксеров = " + (weightBoxer1 + weightBoxer2) + " кг. ");
        System.out.println("Разница между весами боксеров = " + (weightBoxer2 - weightBoxer1) + " кг.");

// 3 Task
        System.out.println();
        System.out.println("3 Task ");
        //– Бананы – 5 штук (1 банан - 80 грамм);
        int banansCount = 5;
        int weightOneBanan = 80;
        int weightBananas = banansCount * weightOneBanan;

        //– Молоко – 200 мл (100 мл = 105 грамм);
        int milksCount = 200;
        int milkCount = 100;
        int weightOneMilk = 105;
        int weightMilks = ( milksCount / milkCount ) * weightOneMilk;

        //– Мороженое пломбир – 2 брикета по 100 грамм;
        int icesCount = 2;
        int weightOneIce = 100;
        int weightIces = icesCount * weightOneIce;

        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        int eggsCount = 4;
        int weightOneEgg = 70;
        int weightEggs = eggsCount * weightOneEgg;

        int weightTotal = weightBananas + weightMilks + weightIces + weightEggs;
        System.out.println("Вес завтрака  = " + weightTotal + " гр. ");
        int kgInGramm = 1000;
        System.out.println("Вес завтрака  = " + weightTotal / kgInGramm + " кг. " + weightTotal % kgInGramm + " гр.");

// 4 Task
        System.out.println();
        System.out.println("4 Task ");
        // спортсмену нужно сбросить 7 кг,
        int weightThrow = 7 * kgInGramm;
        // терять в весе от 250 до 500 грамм в день.
        int weight250 = 250;
        int weight500 = 500;
        System.out.println(weightThrow / weight250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(weightThrow / weight500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");

        // Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        System.out.println( (weightThrow / weight250 + weightThrow / weight500 )/2 + " дней в среднем может поьребобваться, чтобы добиться результата похудения");

// 5 Task
        System.out.println();
        System.out.println("5 Task ");
        // Маша получает 67 760 рублей в месяц
        // Денис получает 83 690 рублей в месяц
        // Кристина получает 76 230 рублей в месяц
        float incRate = 0.1f;
        int monthCount = 12;
        int salaryMashaDo = 67_760;
        float salaryMashaPosleYear = (incRate  * salaryMashaDo * monthCount);
        System.out.println( "Маша теперь получает "  + salaryMashaDo * (incRate + 1) + " рублей." + " Годовой доход вырос на " +
                                                       salaryMashaPosleYear  + " рублей");
        //894432
        //813120
        int salaryDenisDo = 83_690;
        float salaryDenisPosleYear =  (incRate  * salaryDenisDo * monthCount);
        System.out.println( "Маша теперь получает "  + salaryDenisDo * (incRate + 1) + " рублей." + " Годовой доход вырос на " +
                                                       salaryDenisPosleYear  + " рублей");
        //1004280
        //1104708
        int salaryKristyDo = 76_230;
        float salaryKristyPosleYear =  (incRate * salaryKristyDo * monthCount);
        System.out.println( "Маша теперь получает " + salaryKristyDo * (incRate + 1) + " рублей." + " Годовой доход вырос на " +
                                                      salaryKristyPosleYear  + " рублей");
        // 1006236
        // 914760
        // Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        // Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        // “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.

    }
}
