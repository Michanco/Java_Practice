package homework6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 1.2, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note2 = new Notebook("Fujitsu", 14.3,  "IPS (1920×1080) Full HD"
                , 2.2, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note3 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 3.2, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note4 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 4.2, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note5 = new Notebook("Toshiba", 13.3,  "IPS (1920×1080) Full HD"
                , 5.2, "Intel Core i5-10210U", 8, 500, "SSD");
        Notebook note6 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note7 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note8 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note9 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i5-10210U", 16, 500, "SSD");
        Notebook note10 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i5-10210U", 16, 500, "SSD");

        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(note1);
        notebookSet.add(note2);
        notebookSet.add(note3);
        notebookSet.add(note4);
        notebookSet.add(note5);

        int min = 3;
        int max = 5;
        Engine.frequencyChoice(min, max, notebookSet);

    }

}
