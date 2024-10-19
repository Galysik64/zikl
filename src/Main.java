public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Целое число: " + i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Целое число: " + i);
        }
        System.out.println("Задача 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Четное число: " + i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");

        for (int leap = 1904; leap < 2096; leap = leap + 4) {
            System.out.println(leap + " год является високосным");
        }
        System.out.println("Задача 6");
        for (int i = 0; i < 100; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i < 520; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for( int i = 1; i <= 12; i = i + 1){
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +" рублей.");
        }
        System.out.println("Задача 9");
         int salaryTwo = 29000;
         float totalTwo = 0;
        for(int i = 1; i <= 12; i = i + 1){ totalTwo = totalTwo + totalTwo/100;
            totalTwo = totalTwo + salaryTwo;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalTwo +" рублей.");
        }
        System.out.println("Задача 10");
        int table = 2;
        int number = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (table * i));
        }
    }
}