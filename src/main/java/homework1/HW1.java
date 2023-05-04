package homework1;
import java.time.LocalTime;
import java.util.Scanner;


public class HW1 {
    public static void main(String[] args) {
 //       hw1_task1();
 //       hw1_task2();
 //       hw1_task3();
        hw1_task4();

    }
    /*4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59*/
    private static void hw1_task4() {
        Scanner myScanner = new Scanner((System.in));
        System.out.println("Введите ваше имя:  ");
        String name = myScanner.nextLine();
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        if (hour >= 5 & hour < 12) System.out.printf("Доброе утро ,  %s !%n", name);
        if (hour >= 12 & hour < 18) System.out.printf("Добрый день ,  %s !%n", name);
        if (hour >= 18 & hour < 23) System.out.printf("Добрый вечер ,  %s !%n", name);
        if (hour >= 23 & hour < 5) System.out.printf("Доброй ночи ,  %s !%n", name);
    }

    /*3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    private static void hw1_task3() {
        Scanner myScanner = new Scanner((System.in));
        System.out.println("Введите размер квадратного массива:  ");
        int len = myScanner.nextInt();
        int[][] arr = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    arr[i][len - 1 - i] = 1;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for ( int j: arr[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
    private static void hw1_task2() {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,1,-9,8,-66,4,3,1};
        int min = arr[0];
        int max = arr[0];
        for ( int i: arr ) {
            if( i < min) min = i;
            if( i > max) max = i;
        }
        System.out.printf("Минимальное значение %d\nМаксимальное значение %d", min, max );
    }

    /*1. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    private static void hw1_task1() {
        Scanner myScanner = new Scanner((System.in));
        System.out.println("Введите длину массива:  ");
        int len = myScanner.nextInt();
        System.out.println("Введите значение:  ");
        int value = myScanner.nextInt();
        int[] outArr = new int[len];
        for (int i = 0; i < len; i++) {
            outArr[i] = value;
        }
        for ( int i: outArr) {
            System.out.print(i + " ");
        }
    }
}