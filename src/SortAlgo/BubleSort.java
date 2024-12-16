package SortAlgo;

public class BubleSort implements Sort{

    @Override
    public int[] sort(int[] data) { //Sort funcion 

        for (int i = 0; i < data.length - 1; i++) { //i läuft durch solange kleiner als größe des arrays -1
//beim letzten kein Vergleich nötig
            for (int k = 0; k < data.length - i - 1; k++) {  //diese schleife vergleicht elemente, ist element 
//kleinere Elemente werden getauscht mit größeren


                if (data[k] > data[k + 1]) { //wenn ein k element kleiner ist als data k+1, werden sie vertausch

                    int b = data[k];
                    data[k] = data[k + 1]; 
                    data[k + 1] = b; //temporäre Variable b, tauscht die abfolge des Arrays
                }
            }

        }


      return data;
    }
    
}
