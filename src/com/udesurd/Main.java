package com.udesurd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Линейные программы:
        task1_1();
        task1_2();
        task1_3();
        task1_4();
        task1_5();
        task1_6();
//      Ветвления:
        task2_1();
        task2_2();
        task2_3();
        task2_4();
    }



//  Тема "Линейные программы"
//  Задание Первое:
    private static void task1_1() {

//      Внесение значений в программу:
        System.out.println("1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 'a': ");
        Integer a = scanner.nextInt();
        System.out.println("Введите 'b': ");
        Integer b = scanner.nextInt();
        System.out.println("Введите 'c': ");
        Integer c = scanner.nextInt();

//      Функция:

        int z = ((a - 3) * b / 2) + c;
        System.out.println("Результат: " + z);
    }
//  Задание Второе:
    private static void task1_2() {
        System.out.println("2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)");
        double a = 6.0;
        double b = 0.2;
        double c = 10.0;
//      Математическая формула и ответ:
        double res = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Ответ: " + res);
    }
//  Задание Третье:
    private static void task1_3() {
        System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 'x': ");
        double x = scanner.nextInt();
        System.out.println("Введите 'y': ");
        double y = scanner.nextInt();

        double res = (int) ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
        System.out.println("Ответ: " + res);
    }
//  Задание Четвертое:
    private static void task1_4() {
        System.out.println("4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите nnn.ddd значение: ");
        double x = scanner.nextDouble();
        double res = (x * 1000.0) % 1000.0 + (int) x / 1000.0;
        System.out.println("Ответ: " + res);
    }
//  Задание Пятое:
    private static void task1_5() {
        System.out.println("5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
                "Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. ");
//      Исходная длительность:
        int T = 3800;
//      Расчет значений:
        int hours = (T / 3600);
        int t = T - (hours * 3600);
        int min = t / 60;
        int sec = t - (min * 60);
//      Вывод ответа:
        System.out.println("Исходная длительность прошедшего времени: " + T);
        System.out.println(hours + " ч. " + min + " мин. " + sec + " c.");
    }
//  Задание Шестое:
    private static void task1_6(){}

//  Тема "Ветвления"
//  Задание Первое:
    private static void task2_1(){
    int angleFirst = 100;
    int angleSecond = 45;
    int sum=angleFirst+angleSecond;
    if(sum<180)
    {
        System.out.print("Существует, ");
        if(180 - sum == 90 || angleFirst == 90|| angleSecond == 90)
            System.out.println("Прямоугольный.");
        else
            System.out.println("Непрямоугольный.");
    }else
        System.out.println("Не существует.");
}
//  Задание Второе:
    private static void task2_2(){
        System.out.println("Найти max{min(a, b), min(c, d)}.");
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;

        int res = Math.max(Math.min(a, b), Math.min(c,d));
        System.out.println("Ответ: " + res);
    }
//  Задание Третье:
private static void task2_3() {
    System.out.println("3.  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.");
    int x1 = 1;
    int y1 = 3;
    int x2 = 5;
    int y2 = 0;
    int x3 = 5;
    int y3 = 0;

    if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0)
        System.out.println("На одной прямой");
    else
        System.out.println("Не на одной прямой");
}
    private static void task2_4(){
        System.out.println("4.  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через\n" +
                "отверстие.");
        int a = 5;
        int b = 5;

        int x= 6;
        int y = 6;
        int z = 5;

        if ((x <= a && y <= b) || (y <= a && x <= b) ||
                (x <= a && z <= b) || (z <= a && x <= b) ||
                (z <= a && y <= b) || (y <= a && z<= b))
            System.out.println("Пролезет.");
        else
            System.out.println("Не пролезет.");


    }
}