package kz.kaznu.satjan.domawka;

import java.util.Arrays;
import java.util.Scanner;

public class Domawka2 {
    public static void main(String[] args) {
        int[] array = arrayData();
        arraySumElements(array);
    }

    public static int[] arrayData() {
        Scanner scanner = new Scanner(System.in);
        int arrayLength;

        // Проверка ввода для длины массива
        while (true) {
            System.out.print("Введите размер массива (положительное число): ");
            if (scanner.hasNextInt()) {
                arrayLength = scanner.nextInt();
                if (arrayLength > 0) {
                    break;
                }
            } else {
                scanner.next(); // Очистка некорректного ввода
            }
            System.out.println("Пожалуйста, введите положительное число.");
        }

        int[] array = new int[arrayLength];
        System.out.println("Массив следующей длины: " + arrayLength);
        System.out.println("и имеет вид " + Arrays.toString(array));

        // Ввод данных для массива
        System.out.println("Введите данные массива: ");
        for (int i = 0; i < arrayLength; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Пожалуйста, введите целое число.");
                    scanner.next(); // Очистка некорректного ввода
                }
            }
            System.out.println("Массив имеет вид " + Arrays.toString(array));
        }

        System.out.println("Массив заполнен и имеет следующий вид " + Arrays.toString(array));
        scanner.close(); // Закрытие Scanner
        return array;
    }

    public static void arraySumElements(int[] array) {
        int sum = 0;
        for (int value : array) {
            if (value > 5) {
                sum += value;
            }
        }
        System.out.println("Сумма элементов массива, которые больше 5: " + sum);
    }
}
