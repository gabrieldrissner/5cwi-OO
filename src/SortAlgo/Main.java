package SortAlgo;

import org.junit.runner.manipulation.Sorter;

import DataGeneratorAlgo.DataGenerator;

public class Main {
    public static void main(String[] args) {

        Sort sort1 = new BubleSort(); //Sortieralgorithmus erstellen

        int[] list = Data.newDataArray(100, 20, 120); //Array Werte festlegen

        System.out.println("gesamte Liste:"); 
        Data.print(list); //printet gesamtes Array


        System.out.println(); //Leerzeilen
        System.out.println();


        
        System.out.println("sortierte Liste:");
        int[] sortedList = sort1.sort(list); //Array sortieren
        Data.print(sortedList); //printed sortierte Liste
}

}