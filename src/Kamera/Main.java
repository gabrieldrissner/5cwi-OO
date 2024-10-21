package Kamera;

public class Main {
    public static void main(String[] args) {
        SDCard sdCard1 = new SDCard(50, 6);
        Camera Kamera1 = new Camera(1250, 44, 9, sdCard1);


Kamera1.makePicture();
Kamera1.makePicture();

Kamera1.printAllFiles();

    }
}