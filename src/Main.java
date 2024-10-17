public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
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

    }
}