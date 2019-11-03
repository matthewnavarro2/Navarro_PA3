import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    public DuplicateCounter()
    {
        this.wordCounter = 0;
        this.map = new HashMap<>();
    }

    private Integer wordCounter;
    private Map<String, Integer> map;



    public void count(String dataFile)
    {
        Scanner fileReader;
        try
        {
            fileReader = new Scanner(new File(dataFile));
            while(fileReader.hasNextLine())
            {
                String line = fileReader.nextLine().trim();
                String[] data = line.split("[\\W]+");
                for(String word : data)
                {
                    this.wordCounter = map.get(word);
                    this.wordCounter = (this.wordCounter == null) ? 1 : ++this.wordCounter;
                    map.put(word, this.wordCounter);
                }
            }
            fileReader.close();
        }catch(FileNotFoundException fnfe){
            System.out.println( dataFile + " not found");
            System.exit(1);
        }
    }

    public void write(String outputFile)
    {
        FileWriter fileWriter;
        PrintWriter printWriter;
        try {
            fileWriter = new FileWriter(new File(outputFile));
            printWriter = new PrintWriter(fileWriter);
            for(Map.Entry<String, Integer> entry : map.entrySet())
            {
                printWriter.write(entry.getKey() + " was found " + entry.getValue() + " times!" + System.lineSeparator());
            }
            System.out.println("Data was transfered to: " + outputFile);
            printWriter.flush();
            fileWriter.close();
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Error " + outputFile + ": " + ex.getMessage());
            System.exit(1);
        }
    }
}


