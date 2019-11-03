import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class DuplicateRemover {
    private Set<String> uniqueWords;
    public void remove(String dataFile) throws FileNotFoundException
    {
        String word;
        uniqueWords = new HashSet<String>();
        Scanner scnr =new Scanner(new File(dataFile));
        while(scnr.hasNext())
        {
            word=scnr.next();
            uniqueWords.add(word);
        }
        scnr.close();


    }

    public void Write(String outputFile) throws IOException
    {
        File file = new File(outputFile);
        FileWriter fileWriter;

        if(file.exists()) {
            fileWriter = new FileWriter(file, true);
            Iterator iterator=uniqueWords.iterator();

            while(iterator.hasNext())
            {
                String str=(String)iterator.next();
                fileWriter.write(str+"\n");
            }
            fileWriter.close();
            System.out.println("Finished");

        }
        else
        {
            file.createNewFile();
            fileWriter =new FileWriter(file);
            Iterator itr=uniqueWords.iterator();

            while(itr.hasNext())
            {
                String str=(String)itr.next();
                fileWriter.write(str+"\n");
            }
            fileWriter.close();
            System.out.println("Finished");
        }

    }

}

