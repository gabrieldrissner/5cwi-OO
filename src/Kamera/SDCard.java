package Kamera;
import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private List<File> files = new ArrayList<File>();
    private int memory;
    private int warningMessage;



    public SDCard(int memory, int warningMessage)
    {
        this.memory = memory;
        this.warningMessage = warningMessage;
    }



    public void SaveFile(File file)
    {
        if(memory -file.getSize() <= 0)
        {
            FullMemory();
            return;
        }
        else if(memory -file.getSize() <= warningMessage)
        {
            WarningAlmostFullMemory();
        }
        files.add(file);
        memory -= file.getSize();
    }



    public List<File> GetAllFiles()
    {
        return files;
    }



    private void WarningAlmostFullMemory()
    {
        System.out.println("Speicher fast voll");
    }

    private void FullMemory()
    {
        System.out.println("Speicher voll");
    }
}
