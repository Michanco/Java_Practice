package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW3_task1 {
    public static void main(String[] args) {

        task_1();
    }
//    Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
//            Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    private static void task_1() {
        String[] stringIntegerArray = {"один", "два", "три", "четыре", "1", "2", "3", "4"};
        Random random = new Random();
        List<String> workList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            workList.add(stringIntegerArray[random.nextInt(stringIntegerArray.length)]);
        }
        System.out.println(workList);
        for (int i = workList.size() - 1; i >= 0 ; i--) {
            try {
                Integer.parseInt(workList.get(i));
                workList.remove(workList.get(i));
            } catch (Exception e) {
            }
        }
        System.out.println(workList);
    }

}
