package Kamera;

public class File {
    private String name;
    private int size;
    private long createDate;



    public File(int size, String name)
    {
        this.size = size;
        this.name = name;
        this.createDate = System.currentTimeMillis();
    } 



    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}