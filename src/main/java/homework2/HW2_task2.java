package homework2;

import java.io.File;
import java.util.HashSet;

public class HW2_task2 {
//    Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//    1 Расширение файла: txt
//    2 Расширение файла: pdf
//    3 Расширение файла:
//    4 Расширение файла: jpg
    public static void main(String[] args) {
        getFilesExtantion("C:\\Program Files\\Git");
 //       files_ex();

    }
    private static void getFilesExtantion(String pathDir) {
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())) {
            return;
        }

        HashSet<String> extantionHashSet = new HashSet<>();
        for (String fileName : file.list()) {
            if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
                extantionHashSet.add(fileName.substring(fileName.lastIndexOf(".") + 1));
            else extantionHashSet.add(" ");
        }
        System.out.println(extantionHashSet);
        int i = 1;
        for ( String j: extantionHashSet) {
            System.out.println(i + "  Расширение файла:  " + j);
            i++;
        }
    }
}
