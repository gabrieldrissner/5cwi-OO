package Kamera;

import java.util.Random;

public class Camera {
    private int fileSize;
    private SDCard sdCard;
    private Random random = new Random();
    private int pixel;
    private int weight;


    public Camera(int pixel, int weight, int fileSize, SDCard sdCard)
    {
        this.pixel = pixel;
        this.weight = weight;
        this.fileSize = fileSize;
        this.sdCard = sdCard;
    }

    public void makePicture()
    {
        File newFile = new File(fileSize, "" + random.nextInt() + ".jpg");
        System.out.println("made Picture" + newFile.getName());
        sdCard.SaveFile(newFile);
    }

    public void printAllFiles()
    {
        for (File file : sdCard.GetAllFiles()) {
            System.out.println(file.getName());
        }
    }
}