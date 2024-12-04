package DataGeneratorAlgo;

public class BaseAlgo {
    
    public static int[] revertData (int[] array) {

        int[] revertedArray = new int[array.length];


        int i2 = 0;

        for (int i = array.length -1; i >= 0; i--){
            revertedArray[i2]=array [i];
            i2++;
        }
        return revertedArray;
    }
}
