import java.io.*;
import java.util.ArrayList;
public class writeToFile {



    public String write(ArrayList<Integer> listToPrint, String toFile1, String fromFile, boolean isConvertingToText) {

        
        String returnValue = null;
        File f = new File(toFile1);
        File g = new File(fromFile);

        if (f.exists() && g.exists()) {
            try {
                try {
                    BufferedWriter write = new BufferedWriter(new FileWriter(toFile1));
                    for (int z = 0; z < listToPrint.size(); z++) {
                        if (isConvertingToText) {
                            write.write(listToPrint.get(z) + "");
                        } else {
                            write.write(listToPrint.get(z) + " ");
                        }
                    }
                    write.close();
                    returnValue = "File changed successfully. Check updated file at the path: " + toFile1;
                } catch (FileNotFoundException fnf1) {
                    System.out.println("caught2");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (f.exists() && !(g.exists())){
            returnValue = "Original file was not found at your path: " + fromFile + "\nRerun the program";
        } else if (g.exists() && !(f.exists())){
            returnValue = "The data you want to put at path: " + toFile1 + " does not exist";
        } else {
            returnValue = "Original file was not found at your path: " + fromFile + " nor was the data you want to put at path: " + toFile1;
        }
        return returnValue;
    }
}
