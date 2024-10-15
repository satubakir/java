package kz.kaznu.satjan.domawka;

public class domawka3 {
        public static void main(String[] args) {
    // Реализуем метод sumOfPositiveElements(..)
    // принимающий в качестве аргумента целочисленный двумерный массив,
    // метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
     int[][] array = {{1, -2}, {1, 2}, {1, 2}, {1, 2}};
     int sum = sumOfPositiveElements(array);
    System.out.println("Сумма положительных элементов массива: " + sum);
}

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                if (value > 0) {
                    sum += value;
                }
            }
        }
        return sum;
    }
}
