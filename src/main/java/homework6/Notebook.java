package homework6;

import java.util.Objects;

public class Notebook {
    String brand;
    double dysplaySize;
    String dysplayType;
    double frequencyCPU;
    String typeCPU;
    int sizeRAM;
    int storageSize;
    String storageType;

    public Notebook(String brand, double dysplaySize, String dysplayType, double frequencyCPU, String typeCPU, int sizeRAM,
                    int storageSize, String storageType) {
        this.brand = brand;
        this.dysplaySize = dysplaySize;
        this.dysplayType = dysplayType;
        this.frequencyCPU = frequencyCPU;
        this.typeCPU = typeCPU;
        this.sizeRAM = sizeRAM;
        this.storageSize = storageSize;
        this.storageType = storageType;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(brand + "/").append("Экран " + dysplaySize + " " + dysplayType + "/")
                .append("CPU " + typeCPU + " (" + frequencyCPU + " ГГц)/").append("RAM " + sizeRAM + " ГБ/")
                .append(storageType + " " + storageSize + " ГБ");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Double.compare(notebook.dysplaySize, dysplaySize) == 0 && Double.compare(notebook.frequencyCPU, frequencyCPU) == 0
                && sizeRAM == notebook.sizeRAM && storageSize == notebook.storageSize && Objects.equals(brand, notebook.brand)
                && Objects.equals(dysplayType, notebook.dysplayType) && Objects.equals(typeCPU, notebook.typeCPU)
                && Objects.equals(storageType, notebook.storageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, dysplaySize, dysplayType, frequencyCPU, typeCPU, sizeRAM, storageSize, storageType);
    }
}
