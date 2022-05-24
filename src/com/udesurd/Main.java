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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите ваше Первое число: ");
        double a = scanner.nextInt();
        System.out.println("Пожалуйста, введите ваше Второе число: ");
        double b = scanner.nextInt();
        System.out.println("Пожалуйста, введите ваше Третье число: ");
        double c = scanner.nextInt();
//      Математическая формула и ответ:
        double res = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Ответ: " + res);
    }
//  Задание Третье:
    private static void task1_3() {
        System.out.println("Вычислить значение выражения по формуле (все переменные принимают действительные значения)");
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
}