public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Задача №1");
        byte mercury = 127;
        short venus = 32767;
        int earth = 2147483647;
        long mars = 9223372036854775207L;
        float jupiter = 3.4f;
        double saturn = 1.7308;
        System.out.println("Значение переменной mercury с типом byte равно " + mercury);
        System.out.println("Значение переменной venus с типом short равно " + venus);
        System.out.println("Значение переменной earth с типом int равно " + earth);
        System.out.println("Значение переменной mars с типом long равно " + mars);
        System.out.println("Значение переменной jupiter с типом float равно " + jupiter);
        System.out.println("Значение переменной saturn с типом double равно " + saturn);

        System.out.println("Задача №2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short i = -159;
        System.out.println(i);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        System.out.println(" Задача №3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalQuantity = 480;
        int numberOfStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("На каждого ученика расчитано " + totalQuantity / numberOfStudents + " листов бумаги.");

        System.out.println(" Задача №4");
        byte performanceTwoMinutes = 16;
        int performanceOneMinutes = performanceTwoMinutes / 2;
        int performanceTwentyMinutes = performanceOneMinutes * 20;
        byte minutes = 1;
        int hour = minutes * 60;
        int timeDay = hour * 24;
        int performanceDay = timeDay * performanceOneMinutes;
        int performanceThreeDay = performanceDay * 3;
        int performanceMonth = performanceDay * 30;
        System.out.println("За 20 минут машина произвела " + performanceTwentyMinutes + (" штук бутылок."));
        System.out.println(("За сутки машина произвела ") + performanceDay + (" штук бутылок."));
        System.out.println(("За три дня машина произвела ") + performanceThreeDay + (" штук бутылок."));
        System.out.println(("За 1 месяц машина произвела ") + performanceMonth + (" штук бутылок."));

        System.out.println(" Задача №5");
        byte totalBank = 120;
        byte whiteBank = 2;
        byte brownBank = 4;
        int totalCabinet = (totalBank / (whiteBank + brownBank));
        int needToWhiteBank = totalCabinet * whiteBank;
        int needToBrownBank = totalCabinet * brownBank;
        System.out.println("В школе, где " + totalCabinet + " классов, нужно " + needToWhiteBank + (" банок белой краски и ") + needToBrownBank + (" банок коричневой краски."));

        System.out.println(" Задача №6");
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int breakfast = ((bananas * 5) + (milk * 2) + (iceCream * 2) + (egg * 4));
        float translation = breakfast * 0.001f;
        System.out.println("Масса завтрака " + breakfast + " грамм или " + translation + " кг.");

        System.out.println(" Задача №7");
        float target = 7;
        float methodOne = 0.25f;
        float methodTwo = 0.5f;
        int dayMethodOne = (int) (target / methodOne);
        int dayMethodTwo = (int) (target / methodTwo);
        System.out.println("Если спортсмен будет терять по 250 граммов веса в день, то для того, чтобы ему похудеть понадобится " + dayMethodOne + " дней.");
        System.out.println("Если спортсмен будет терять по 500 граммов веса в день, то для того, чтобы ему похудеть понадобится " + dayMethodTwo + " дней.");
        float middleAverageWeight = (methodOne + methodTwo) / 2;
        int middleDay = (int) (target / middleAverageWeight);
        System.out.println("В среднем  при соблюдении диеты, спортсмен должен похудеть в течении " + middleDay + " дней.");

        System.out.println(" Задача №8");
        int MariaSalary = 67760;
        int MariaAmountIncrease = (MariaSalary / 100) * 10;
        int MariaSalaryAfter = MariaSalary + MariaAmountIncrease;
        int MariaAnnualSalaryBeforeIncrease = MariaSalary * 12;
        int MariaAnnualSalaryAfterPromotion = MariaSalaryAfter * 12;
        int MariaDifferenceInAnnualIncome = MariaAnnualSalaryAfterPromotion - MariaAnnualSalaryBeforeIncrease;
        System.out.println(("Мария теперь получает ") + MariaSalaryAfter + (" рублей. Годовой доход вырос на ") + MariaDifferenceInAnnualIncome + (" рублей."));
        int DenisSalary = 83690;
        int DenisAmountIncrease = (DenisSalary / 100) * 10;
        int DenisSalaryAfter = DenisSalary + DenisAmountIncrease;
        int DenisAnnualSalaryBeforeIncrease = DenisSalary * 12;
        int DenisAnnualSalaryAfterPromotion = DenisSalaryAfter * 12;
        int DenisDifferenceInAnnualIncome = DenisAnnualSalaryAfterPromotion - DenisAnnualSalaryBeforeIncrease;
        System.out.println(("Денис теперь получает ") + DenisSalaryAfter + (" рублей. Годовой доход вырос на ") + DenisDifferenceInAnnualIncome + (" рублей."));
        int CristinSalary = 76230;
        int CristinAmountIncrease = (CristinSalary / 100) * 10;
        int CristinSalaryAfter = CristinSalary + CristinAmountIncrease;
        int CristinAnnualSalaryBeforeIncrease = CristinSalary * 12;
        int CristinAnnualSalaryAfterPromotion = CristinSalaryAfter * 12;
        int CristinDifferenceInAnnualIncome = CristinAnnualSalaryAfterPromotion - CristinAnnualSalaryBeforeIncrease;
        System.out.println(("Кристина теперь получает ") + CristinSalaryAfter + (" рублей. Годовой доход вырос на ") + CristinDifferenceInAnnualIncome + (" рублей."));


    }
}