package homework6;

import java.util.HashSet;
import java.util.Set;

public class Engine {

    public static Set<Notebook> brandFilter(String brand, Set<Notebook> noteSet){
        Set<Notebook> brandFilterSet = new HashSet<>();
        for (Notebook el : noteSet) {
            if (el.brand.equals(brand)) brandFilterSet.add(el);
        } return brandFilterSet;
    }

    public static Set<Notebook> dysplaySizeFilter(int min, int max, Set<Notebook> noteSet) {
        Set<Notebook> dysplaySizeFilterSet = new HashSet<>();
        for (Notebook el : noteSet) {
            if (min <= el.dysplaySize && el.dysplaySize <= max) dysplaySizeFilterSet.add(el);
        } return dysplaySizeFilterSet;
    }

    public static Set<Notebook> frequencyFilter(int min, int max, Set<Notebook> noteSet) {
        Set<Notebook> frequencyFilterSet = new HashSet<>();
        for (Notebook el : noteSet) {
            if (min <= el.frequencyCPU && el.frequencyCPU <= max) frequencyFilterSet.add(el);
        } return  frequencyFilterSet;
    }

    public static Set<Notebook> sizeRAMFilter(int min, int max, Set<Notebook> noteSet) {
        Set<Notebook> sizeRAMFilterSet = new HashSet<>();
        for (Notebook el : noteSet) {
            if (min <= el.sizeRAM && el.sizeRAM <= max) sizeRAMFilterSet.add(el);
        } return sizeRAMFilterSet;
    }

    public static Set<Notebook> storageSizeFilter(int min, int max, Set<Notebook> noteSet) {
        Set<Notebook> storageSizeFilterSet = new HashSet<>();
        for (Notebook el : noteSet) {
            if (min <= el.storageSize && el.storageSize <= max) storageSizeFilterSet.add(el);
        } return storageSizeFilterSet;
    }

    public static Set<Notebook> storageTypeFilter(String storageType, Set<Notebook> noteSet){
        Set<Notebook> storageTypeFilterSet = new HashSet<>();
        for (Notebook el : noteSet) {
            if (el.storageType.equals(storageType)) storageTypeFilterSet.add(el);
        } return storageTypeFilterSet;
    }

    public static Set<String> uniqueBrands (Set<Notebook> inputSet){
        Set<String> uniqueBrandsSet = new HashSet<>();
        for (Notebook el: inputSet) {
            uniqueBrandsSet.add(el.brand);
        } return uniqueBrandsSet;
    }

}
