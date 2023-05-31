package homework6;

import java.util.Set;

public class Engine {
    public static void frequencyChoice(int min, int max, Set<Notebook> noteSet) {
        for (Notebook el : noteSet) {
            if (min < el.frequencyCPU && el.frequencyCPU < max) System.out.println(el);
        }
    }
}
