package Lab05;

import java.util.Scanner;

/**
 * Пользователь вводит координаты точки x и y.
 * Программа проверяет, принадлежит ли эта точка закрашенной области.
 * Изображение областей можно найти по адресу:
 * ${папка с заданиями}/images/Области 3.png
 *
 * В исходном коде решения намеренно допущена логическая ошибка.
 * Чтобы выполнить задание, нужно:
 * - Подобрать исходные данные для проверки задачи.
 * - Выяснить в каком случае программа работает неверно.
 * - Исправить ошибку.
 * - Проверить корректность исправления.
 *
 * Точки внутри областей:
 *
 * Точки на границах:
 *
 * Точки на пересечении границ:
 */
public class Task6351 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = s.nextDouble();
        System.out.println("Введите y:");
        double y = s.nextDouble();
        if (y <= 4) {
            if (1 <= x) {
                if (x <= 2) {
                    System.out.println("Выполняется");
                } else {
                    System.out.println("Не выполняется");
                }
            }
        } else {
            if (1 <= x) {
                if (x <= 2) {
                    System.out.println("Выполняется");
                } else {
                    System.out.println("Не выполняется");
                }
            } else {
                System.out.println("Не выполняется");
            }
        }
    }
}
