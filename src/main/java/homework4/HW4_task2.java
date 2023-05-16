package homework4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HW4_task2 {
    public static void main(String[] args) {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        int num = 10;
        List<Integer> workLinkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            workLinkedList.add(random.nextInt(50));
        }
        System.out.println(workLinkedList);
        reverseLinkedList(workLinkedList);
        System.out.println(workLinkedList);
    }

    private static void reverseLinkedList(List<Integer> linkedList) {
        int temp = 0;
        for (int i = 0; i < linkedList.size() - 1; i++) {
            temp = linkedList.get(linkedList.size()- 1);
            linkedList.add(i, temp);
            linkedList.remove(linkedList.size()- 1);
        }
    }
}
