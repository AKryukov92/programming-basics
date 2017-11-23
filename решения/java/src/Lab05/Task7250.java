package Lab05;

import java.util.Scanner;

/**
 * Пользователь вводит координаты точки x и y.
 * Программа проверяет, принадлежит ли эта точка закрашенной области.
 * Изображение областей можно найти по адресу:
 * ${папка с заданиями}/images/Области 6.png
 *
 * В исходном коде решения намеренно допущена логическая ошибка.
 * Чтобы выполнить задание, нужно:
 * - Подобрать исходные данные для проверки задачи.
 * - Выяснить в каких случаях программа работает неверно.
 * - Исправить ошибку.
 * - Проверить корректность исправления.
 *
 * Точки внутри областей:
 *
 * Точки на границах:
 *
 * Точки на пересечении границ:
 */

public class Task7250 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = s.nextDouble();
        System.out.println("Введите y:");
        double y = s.nextDouble();
        if (2 < x){
            System.out.println("Не выпоняется");
        } else {
            if (y >= 1){
                System.out.println("Выполняется");
            }
            if (y <= -1.5){
                System.out.println("Выполняется");
            }
            if (y < 1){
                if (1.5 < y) {
                    System.out.println("Не выполняется");
                } else {
                    System.out.println("Выполняется");
                }
            } else {
                System.out.println("Выполняется");
            }
        }
    }
}
