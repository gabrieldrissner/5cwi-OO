package SortAlgo;

import java.util.Random;

public class Data {


    
    public static int[] newDataArray(int size, int min, int max) { //static function, Array erstellen
//size für größe, min der mindeste wert, max der höchste wert 

        Random random = new Random(); 
        int[] data = new int[size];  //Array Liste erstllen
        for (int i = 0; i < size; i++) 
        {  
            data[i] = random.nextInt(min, max);  //solange i kleiner als die size ist, werden zufallszahlen erstellt, die mindestens
        }
        //min sind und maximal max
        return data;  
    }



    public static void print(int[] data) { //funktion um Daten zu printen
        for (int a = 0; a < data.length; a++) //for schleife läuft bis zur länge des Arrays druch
        {
            System.out.print(data[a] + "  "); //Jedes mal wenn die Schleife durchläuft wird die aktuelle Zahl ausgegeben
        }
    }
}