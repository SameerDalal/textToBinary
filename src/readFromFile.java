import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class readFromFile {

    ArrayList<String> arrayList = new ArrayList<>();


    public ArrayList getInput(String fileName1) {
        try {
            try {
                BufferedReader read = new BufferedReader(new FileReader(fileName1));
                String line;
                while ((line = read.readLine()) != null) {
                    arrayList.add(line);
                }
                read.close();
            } catch (FileNotFoundException fnf) {
                for (int x = 0; x <arrayList.size(); x++){
                    arrayList.add(x,"");
                    // if there is an exception then the arrayList is cleared
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}


