package homework6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 2.2, "Intel Core i3", 8, 500, "HDD");
        Notebook note2 = new Notebook("Fujitsu", 14.3,  "IPS (1920×1080) Full HD"
                , 2.2, "Intel Core i5", 16, 500, "SSD");
        Notebook note3 = new Notebook("Fujitsu", 15.0,  "IPS (1920×1080) Full HD"
                , 3.2, "Intel Core i7", 32, 1000, "SSD");
        Notebook note4 = new Notebook("Fujitsu", 13.3,  "IPS (1920×1080) Full HD"
                , 2.5, "Intel Core i5", 32, 500, "HDD");
        Notebook note5 = new Notebook("Toshiba", 14,  "IPS (1920×1080) Full HD"
                , 2.7, "Intel Core i3", 8, 500, "HDD");
        Notebook note6 = new Notebook("Toshiba", 14,  "IPS (1920×1080) Full HD"
                , 3.4, "Intel Core i5", 16, 750, "SSD");
        Notebook note7 = new Notebook("Toshiba", 15,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i7", 24, 500, "SSD");
        Notebook note8 = new Notebook("Lenovo", 13.3,  "IPS (1920×1080) Full HD"
                , 2.4, "Intel Core i3", 16, 1000, "HDD");
        Notebook note9 = new Notebook("Lenovo", 14.5,  "IPS (1920×1080) Full HD"
                , 3.4, "Intel Core i5", 16, 500, "SSD");
        Notebook note10 = new Notebook("Lenovo", 14.5,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i7", 32, 1000, "SSD");
        Notebook note11 = new Notebook("HP", 14.5,  "IPS (1920×1080) Full HD"
                , 4.4, "Intel Core i7", 32, 1000, "SSD");

        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(note1);
        notebookSet.add(note2);
        notebookSet.add(note3);
        notebookSet.add(note4);
        notebookSet.add(note5);
        notebookSet.add(note6);
        notebookSet.add(note7);
        notebookSet.add(note8);
        notebookSet.add(note9);
        notebookSet.add(note10);
        notebookSet.add(note11);

        Set<Notebook> resultSet = new HashSet<>(notebookSet);
        StringBuilder builderOfFilters = new StringBuilder("Ваши фильтры:\n");
        while (true) {
            System.out.println("Введите параметры для отбора: \n1 - производитель\n2 - диагональ монитора\n3 - частота процессора\n" +
                    "4 - размер ОЗУ\n5 - ёмкость накопителя\n6 - тип накопителя\nДля запуска фильтра нажмите 0");
            Scanner scanner = new Scanner(System.in);
            int inputValue = scanner.nextInt();
            if(inputValue == 0) break;
            else {
                switch (inputValue){
                    case 1:
                        Set<String> uniqueBrandsSet;
                        uniqueBrandsSet = Engine.uniqueBrands(notebookSet);
                        String[] uniqueBrandsArray = uniqueBrandsSet.toArray(new String[uniqueBrandsSet.size()]);
                        System.out.println(" Доступны следующие производители: ");
                        for (int i = 0; i < uniqueBrandsArray.length; i++) {
                            System.out.printf("%s - %s \n", i + 1, uniqueBrandsArray[i] );
                        }
                        System.out.println(" Выберите номер производителя");
                        Scanner scanner1 = new Scanner(System.in);
                        int inputBrandNumber = scanner1.nextInt();
                        String inputBrandName = uniqueBrandsArray[inputBrandNumber - 1];
                        Set<Notebook> resSetBrand = new HashSet<>(Engine.brandFilter(inputBrandName, notebookSet));
                        builderOfFilters.append("Производитель - ").append(inputBrandName).append("\n");
                        resultSet.retainAll(resSetBrand);
                        break;
                    case 2:
                        System.out.print("Введите диапазон размера диагонали экрана\nот: ");
                        Scanner scanner2 = new Scanner(System.in);
                        int inputMinDisplaySize = scanner2.nextInt();
                        System.out.print("до: ");
                        Scanner scanner3 = new Scanner(System.in);
                        int inputMaxDisplaySize = scanner3.nextInt();
                        Set<Notebook> resSetDisplaySize = new HashSet<>(Engine.dysplaySizeFilter(inputMinDisplaySize, inputMaxDisplaySize, notebookSet));
                        resultSet.retainAll(resSetDisplaySize);
                        builderOfFilters.append("Диагональ экрана - от ").append(inputMinDisplaySize).append(" до ").append(inputMaxDisplaySize).append("\n");
                        break;
                    case 3:
                        System.out.println("Введите диапазон частоты процессора \nот: ");
                        Scanner scanner4 = new Scanner(System.in);
                        int inputMinFrequensy = scanner4.nextInt();
                        System.out.println("до: ");
                        Scanner scanner5 = new Scanner(System.in);
                        int inputMaxFrequensy = scanner5.nextInt();
                        Set<Notebook> resSetFrequency = new HashSet<>(Engine.frequencyFilter(inputMinFrequensy, inputMaxFrequensy, notebookSet));
                        resultSet.retainAll(resSetFrequency);
                        builderOfFilters.append("Частота процессора - от ").append(inputMinFrequensy).append(" до ").append(inputMaxFrequensy).append("\n");
                        break;
                    case 4:
                        System.out.println("Введите диапазон размера ОЗУ \nот: ");
                        Scanner scanner6 = new Scanner(System.in);
                        int inputMinRAM = scanner6.nextInt();
                        System.out.println("до: ");
                        Scanner scanner7 = new Scanner(System.in);
                        int inputMaxRAM = scanner7.nextInt();
                        Set<Notebook> resSetRAM = new HashSet<>(Engine.sizeRAMFilter(inputMinRAM, inputMaxRAM, notebookSet));
                        resultSet.retainAll(resSetRAM);
                        builderOfFilters.append("Размер ОЗУ - от ").append(inputMinRAM).append(" до ").append(inputMaxRAM).append("\n");
                        break;
                    case 5:
                        System.out.println("Введите диапазон ёмкости накопителя \nот: ");
                        Scanner scanner8 = new Scanner(System.in);
                        int inputMinStorageSize = scanner8.nextInt();
                        System.out.println("до: ");
                        Scanner scanner9 = new Scanner(System.in);
                        int inputMaxStorageSize = scanner9.nextInt();
                        Set<Notebook> resSetStorageSize = new HashSet<>(Engine.storageSizeFilter(inputMinStorageSize, inputMaxStorageSize, notebookSet));
                        resultSet.retainAll(resSetStorageSize);
                        builderOfFilters.append("Ёмкость накопителя - от ").append(inputMinStorageSize).append(" до ").append(inputMaxStorageSize).append("\n");
                        break;
                    case 6:
                        System.out.println("Выберите тип накопителя\n1 - SSD\n2 - HDD: ");
                        Scanner scanner10 = new Scanner(System.in);
                        int inputStorageTypeNumber = scanner10.nextInt();
                        String inputStorageTypeName = "";
                        switch (inputStorageTypeNumber){
                            case 1:
                                inputStorageTypeName = "SSD";
                                break;
                            case 2:
                                inputStorageTypeName = "HDD";
                                break;
                        }
                        Set<Notebook> resSetStorageType = new HashSet<>(Engine.storageTypeFilter(inputStorageTypeName, notebookSet));
                        resultSet.retainAll(resSetStorageType);
                        builderOfFilters.append("Тип накопителя - ").append(inputStorageTypeName).append("\n");
                        break;
                    default:
                        System.out.println("Такого параметра нет ");
                }
            }
        }
        System.out.println(builderOfFilters);
        for ( Notebook el: resultSet) {
            System.out.println(el);
        }
    }
}
