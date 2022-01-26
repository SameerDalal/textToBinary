import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class readFromFile {

    ArrayList<String> arrayList = new ArrayList<>();
    int lineCounter = 0;


    public String fileName1;


    public ArrayList getInput(String fileName1) {
        this.fileName1 = fileName1;
        try {
                BufferedReader read = new BufferedReader(new FileReader(fileName1));
                String line;
                while ((line = read.readLine()) != null) {
                    arrayList.add(line);
                    lineCounter++;
                    read.lines();
                    }
                read.close();
            } catch (IOException e) {
            e.printStackTrace();

        }
        return arrayList;
    }
    public String NameOfFile(){
        return this.fileName1;


    }
}


