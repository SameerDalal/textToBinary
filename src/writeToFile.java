import java.io.*;
import java.util.ArrayList;
public class writeToFile {
    readFromFile rff = new readFromFile();



    public String write(ArrayList<Integer> val, String toFile1) {

        
        String returnValue = null;
        File f = new File(toFile1);
        File g = new File(rff.NameOfFile());

        if (f.exists() && g.exists()) {
            try {

                BufferedWriter write = new BufferedWriter(new FileWriter(toFile1));
                for (int z = 0; z < val.size(); z++) {
                    write.write(val.get(z) + " ");
                }
                write.close();
                returnValue = "File changed successfully. Check updated file at the path: " + toFile1;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (f.exists() && !(g.exists())){
            returnValue = "Original file was not found at your path: " + rff.NameOfFile() + "\nRerun the program";
        } else if (g.exists() && !(f.exists())){
            returnValue = "The data you want to put at path: " + toFile1 + " does not exist";
        } else {
            returnValue = "Original file was not found at your path: " + rff.NameOfFile() + " nor was the data you want to put at path: " + toFile1;
        }
        return returnValue;
    }
}
