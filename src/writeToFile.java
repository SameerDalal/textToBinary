import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class writeToFile {
    Scanner sc = new Scanner(System.in);
    public String toPath;

    protected void write(ArrayList<Integer> val) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(toConvertTo()));
            for (int z = 0; z < val.size(); z++) {
                write.write(val.get(z) + " ");
            }
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File changed successfully. Check updated file at the path: " + toPath);

    }

    public String toConvertTo(){
        System.out.println("Enter the file you would like to see output: ");
        toPath = sc.next();
        return toPath;
    }
}
