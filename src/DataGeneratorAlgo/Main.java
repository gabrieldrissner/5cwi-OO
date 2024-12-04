package DataGeneratorAlgo;

public class Main {

    public static void main(String[] args) {
        int[] array = DataGenerator.generateArrayInRange(5, 0, 20);
        DataGenerator.printArray(array);
        int[] revertedArray = BaseAlgo.revertData(array);
        DataGenerator.printArray(revertedArray);

    }

}
