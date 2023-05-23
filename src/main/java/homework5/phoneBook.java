package homework5;

import java.util.*;

public class phoneBook {
    public static void main(String[] args) {
//        1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
//        2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("1234567", "Иван Иванов");
        phoneBook.put("4264663", "Иван Иванов");
        phoneBook.put("7427433", "Светлана Петрова");
        phoneBook.put("3737237", "Кристина Белова");
        phoneBook.put("3837377", "Анна Мусина");
        phoneBook.put("2363632", "Анна Крутова");
        phoneBook.put("3232632", "Анна Крутова");
        phoneBook.put("1287361", "Иван Юрин");
        phoneBook.put("3398323", "Петр Лыков");
        phoneBook.put("6376126", "Павел Чернов");
        phoneBook.put("2129667", "Павел Чернов");
        phoneBook.put("3396376", "Петр Чернышов");
        phoneBook.put("1262172", "Мария Федорова");
        phoneBook.put("3939639", "Марина Светлова");
        phoneBook.put("2126266", "Мария Савина");
        phoneBook.put("2109229", "Мария Рыкова");
        phoneBook.put("3963263", "Марина Лугова");
        phoneBook.put("2291629", "Анна Владимирова");
        phoneBook.put("2112629", "Иван Мечников");
        phoneBook.put("1269761", "Петр Петин");
        phoneBook.put("1221212", "Иван Ежов");
        phoneBook.put("1226126", "Иван Ежов");

        Map<String, Integer> namesCountMap = new HashMap<>();
        Set<String> uniquePeoples = new HashSet<>(phoneBook.values());
        List<String> names = new ArrayList<>();
        for ( String people: uniquePeoples  ) {
            String[] onePeople = people.split(" ");
            names.add(onePeople[0]);
        }
        System.out.println(names);
        for ( String name: names) {
            if (namesCountMap.containsKey(name)) namesCountMap.put(name, namesCountMap.get(name) + 1);
            else namesCountMap.put(name, 1);
        }
        System.out.println(namesCountMap);
        namesCountMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
