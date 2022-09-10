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
        byte teacher1 = 23;
        System.out.println("У первого учителя " + teacher1 + " ученика");
        byte teacher2 = 27;
        System.out.println("У второго учителя " + teacher2 + " ученика");
        byte teacher3 = 30;
        System.out.println("У третьего учителя " + teacher3 + " ученика");
        int studentsTotal = teacher1 + teacher2 + teacher3;
        System.out.println("Всего учеников " + studentsTotal);
        short paper = 480;
        System.out.println("Закуплено " + paper + " листов бумаги");
        int paperForOneStudent = paper / studentsTotal;
        System.out.println("На каждого ученика расчитано " + paperForOneStudent + " листов бумаги");




    }
}