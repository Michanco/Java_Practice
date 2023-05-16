package homework4;

import java.util.LinkedList;
import java.util.Scanner;

public class HW4_task1 {
    public static void main(String[] args) {
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
        LinkedList<String> dataBase = new LinkedList<>();
        System.out.println("Введите строку \nДля вывода строк в обратном порядке " +
                "введите print\nДля удаления последней строки введите  revert\nДля остановки введите exit");
        while (true){
            Scanner scanner = new Scanner(System.in);
            String inputValue = scanner.nextLine();
            if (inputValue.equals("exit")) break;
            else if (inputValue.equals("print")) reverseLinkedList(dataBase);
            else if (inputValue.equals("revert")) dataBase.remove(dataBase.get(dataBase.size() - 1));
            else dataBase.add(inputValue);
        }
    }
    private static void reverseLinkedList(LinkedList<String> linkedList) {
        for (int i = linkedList.size() - 1; i >= 0 ; i--) {
            System.out.println(linkedList.get(i));
        }
    }
}
