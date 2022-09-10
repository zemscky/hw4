public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1 ");
        int apple = 10;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        byte bananas = 5;
        System.out.println("Значение переменной bananas с типом byte равно " + bananas);
        short cucumber = 20;
        System.out.println("Значение переменной cucumber с типом short равно " + cucumber);
        long pineapple = 100L;
        System.out.println("Значение переменной pineapple с типом long равно " + pineapple);
        float carrotWeight = 1f;
        System.out.println("Значение переменной carrotWeight с типом float равно " + carrotWeight);
        double tomatoWeight = 1.5;
        System.out.println("Значение переменной tomatoWeight с типом double равно " + tomatoWeight);
        // Задача 2
        System.out.println("Задача 2 ");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        boolean vegetablesWeight = tomatoWeight + carrotWeight > 5;
        System.out.println(vegetablesWeight);
        short d = 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        char f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
        // Задача 3
        System.out.println("Задача 3 ");
        byte pupilsInFirstClass = 23;
        System.out.println("У первого учителя " + pupilsInFirstClass + " ученика");
        byte pupilsInSecondClass = 27;
        System.out.println("У второго учителя " + pupilsInSecondClass + " ученика");
        byte pupilsInThridClass = 30;
        System.out.println("У третьего учителя " + pupilsInThridClass + " ученика");
        int studentsTotal = pupilsInFirstClass + pupilsInSecondClass + pupilsInThridClass;
        System.out.println("Всего учеников " + studentsTotal);
        short paperCounts = 480;
        System.out.println("Закуплено " + paperCounts + " листов бумаги");
        int paperForOneStudent = paperCounts / studentsTotal;
        System.out.println("На каждого ученика расчитано " + paperForOneStudent + " листов бумаги");
        // Задача 4
        System.out.println("Задача 4 ");
        int bottles = 16;
        int minutes = 2;
        int machinePerformance = bottles / minutes;
        short twentyMinutes = 20;
        System.out.println("За 20 минут машина произвела бутылок " + twentyMinutes * machinePerformance + " штук");
        int minutesInDay = 24 * 60;
        short machinePerformance2 = 1440 * 8;
        System.out.println("За сутки машина произвела бутылок " + machinePerformance * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За 3 дня машина произвела бутылок " + machinePerformance * minutesInThreeDays + " штук");
        int minutesInMonth = minutesInDay * 30; // В месяце 30 дней
        System.out.println("За 1 месяц машина произвела бутылок " + machinePerformance * minutesInMonth + " штук");
        // Задача 5
        System.out.println("Задача 5 ");
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int paintForOneClass = whiteCansPerClass + brownCansPerClass;
        System.out.println(paintForOneClass + " банок краски уходит на один класс");
        int totalClasses = totalCans / paintForOneClass;
        System.out.println("Всего в школе " + totalClasses + " классов");
        int totalWhiteCans = whiteCansPerClass * totalClasses;
        int totalBrownCans = brownCansPerClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
        // Задание 6
        System.out.println("Задание 6 ");
        short bananas1 = 5 * 80;
        short milk = 105 * 2;
        short iceCream = 100 * 2;
        short eggs = 4 * 70;
        System.out.println("Бананы -  " + bananas1 + " грамм");
        System.out.println("Молоко -  " + milk + " грамм");
        System.out.println("Мороженое пломбир -  " + iceCream + " грамм");
        System.out.println("Сырые яйца -  " + eggs + " грамм");
        int sportsBreakfastWeight = bananas1 + milk + iceCream + eggs;
        float sportsBreakfastWeight1 = sportsBreakfastWeight / 1000f;
        System.out.println("Все спортивного завтрака составляет " + sportsBreakfastWeight + " грамм или " + sportsBreakfastWeight1 + " килограмм");
        // Задание 7
        System.out.println("Задание 7 ");
        short weight = 7 * 1000;
        short diet1 = 250;
        short diet2 = 500;
        int weightLoss1 = weight / diet1;
        int weightLoss2 = weight / diet2;
        System.out.println("Спортсмену нужно сбросить " + weight + " грамм");
        System.out.println("При соблюдении первой диеты, спортсмену понадобится " + weightLoss1 + " дней");
        System.out.println("При соблюдении второй диеты, спортсмену понадобится " + weightLoss2 + " дней");
        int weightLossAverage = (weightLoss1 + weightLoss2) / 2;
        System.out.println("В среднем спортсмену понадобится " + weightLossAverage + " день");
        // Задание 8
        System.out.println("Задание 8 ");
        //Зарплата рабоиников
        int employeeWages1 = 67760;
        int employeeWages2 = 83690;
        int employeeWages3 = 76230;
        System.out.println("Зарплата у Маши в месяц стставляет: " + employeeWages1 + " рублей");
        System.out.println("Зарплата у Дениса в месяц стставляет: " + employeeWages2 + " рублей");
        System.out.println("Зарплата у Кристины в месяц стставляет: " + employeeWages3 + " рублей");
        //Годовая зарплата
        int yearSalary1 = employeeWages1 * 12;
        int yearSalary2 = employeeWages2 * 12;
        int yearSalary3 = employeeWages3 * 12;
        System.out.println("Маша получает " + yearSalary1 + " рублей в год");
        System.out.println("Денис получает " + yearSalary2 + " рублей в год");
        System.out.println("Кристина получает " + yearSalary3 + " рублей в год");
        //10% от зарплаты
        int wagePercent1 = employeeWages1 / 10;
        int wagePercent2 = employeeWages2 / 10;
        int wagePercent3 = employeeWages3 / 10;
        System.out.println("10% от зарплаты у Маши, составляет: " +wagePercent1 + " рублей в месяц");
        System.out.println("10% от зарплаты у Дениса, составляет: " +wagePercent2 + " рублейв в месяц");
        System.out.println("10% от зарплаты у Кристины, составляет: " +wagePercent3 + " рублейв в месяц");
        //Новая зарплата работников
        int employeesNewSalary1 = employeeWages1 + wagePercent1;
        int employeesNewSalary2 = employeeWages2 + wagePercent2;
        int employeesNewSalary3 = employeeWages3 + wagePercent3;
        System.out.println("Зарплата с повышением у Маши составляет " + employeesNewSalary1 + " рублей");
        System.out.println("Зарплата с повышением у Дениса составляет " + employeesNewSalary2 + " рублей");
        System.out.println("Зарплата с повышением у Кристины составляет " + employeesNewSalary3 + " рублей");
        //Новая годовая зарплата работников
        int newSalaryForTheYear1 = employeesNewSalary1 * 12;
        int newSalaryForTheYear2 = employeesNewSalary2 * 12;
        int newSalaryForTheYear3 = employeesNewSalary3 * 12;
        System.out.println("Годовой доход с повышением на 10% у Маши составляет " + newSalaryForTheYear1);
        System.out.println("Годовой доход с повышением на 10% у Дениса составляет " + newSalaryForTheYear2);
        System.out.println("Годовой доход с повышением на 10% у Кристины составляет " + newSalaryForTheYear3);
        //Разница между годовым доходом с нынешней зарплатой и после повышения
        int salaryDifference1 = newSalaryForTheYear1 - yearSalary1;
        int salaryDifference2 = newSalaryForTheYear2 - yearSalary2;
        int salaryDifference3 = newSalaryForTheYear3 - yearSalary3;
        System.out.println("Маша теперь получает " + employeesNewSalary1 + " рублей. Годовой доход вырос на " + salaryDifference1 + " рублей");
        System.out.println("Денис теперь получает " + employeesNewSalary2 + " рублей. Годовой доход вырос на " + salaryDifference2 + " рублей");
        System.out.println("Крситина теперь получает " + employeesNewSalary3 + " рублей. Годовой доход вырос на " + salaryDifference3 + " рублей");



    }
}