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
        task2_5();
//      Циклы:
        task3_1();
        task3_2();
        task3_3();
        task3_4();
        task3_5();
        task3_6();
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
//  Задание Четвертое:
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
            System.out.println("Пройдет.");
        else
            System.out.println("Не пройдет.");


    }
//  Задание Пятое:
    private static void task2_5(){
        System.out.println("5. Вычислить значение функции: ");
        double x = 2;
        double res;
        if (x<=3) {
            res = Math.pow(x, 2) - 3 * x + 9;
        } else {
            res = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Ответ: " + res);
    }
//  Задание Первое:
    private static void task3_1() {
    System.out.println("1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует\n" +
            "все числа от 1 до введенного пользователем числа.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Сумма от 1 до " + number + " равна " + sum);
        System.out.println();
    }
//
    private static void task3_2(){
        System.out.println("2. Вычислить значения функции на отрезке [а,b] c шагом h: ");
        int a = 2;
        int b = 5;
        int h = 4;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
               y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
    }
//
    private static void task3_3(){
        System.out.println("3. Составить программу нахождения произведения квадратов первых двухсот чисел: ");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов чисел от 1 до 100: " + sum);
    }
//
    private static void task3_4() {
        System.out.println("4. Составить программу нахождения произведения квадратов первых двухсот чисел: ");

    }
//  Задание Седьмое:
    private static void task3_5() {
        System.out.println("5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен\n" +
                "заданному е. Общий член ряда имеет вид:");
        int n = 10;
        double sum = 0.0;
        double e = 0.1;
        double a = 0.0;

        for (int i = 0; i <= n; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum += a;
            }
            System.out.println("Сумма равна: " + sum);
        }
    }
//
    private static void task3_6(){
        System.out.println("6 . Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
//      Таблица ASCII
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
    }

}