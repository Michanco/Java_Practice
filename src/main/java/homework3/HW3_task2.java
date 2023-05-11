package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW3_task2 {
    public static void main(String[] args) {
        task_2();
    }
//    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//    что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//    Напишите метод для заполнения данной структуры.

    private static void task_2()  {
        List<List<String>> library = new ArrayList<List<String>>();
        String[] first = new String[]{"детектив", "Пуаро "};
        library.add(List.of(first));
        Scanner myScanner = new Scanner((System.in));
        System.out.println("Введите жанр книги и название через пробел");
        String inputBook = myScanner.nextLine();
        String[] inputBookArr = inputBook.split(" ");
        for ( String el:
             inputBookArr) {
            System.out.println(el);
        }

        for (int i = 0; i < library.size(); i++) {
            if (inputBookArr[0].equals((library.get(i)).get(0))){
                //library.get(i).add(inputBookArr[1]);
            } else{
                library.add(List.of(inputBookArr));
            }
        }
        System.out.println(library);
    }
}
