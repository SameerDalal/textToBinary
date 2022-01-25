import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class getInputFromTextString {

    Scanner sc = new Scanner(System.in);
    convertToBinary c = new convertToBinary();
    ArrayList<String> arrayList = new ArrayList<>();

    public void getInput() {
        System.out.println("Enter file name: ");
        String fileName = sc.next();
        int counter = 0;

        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = read.readLine()) != null) {
                arrayList.add(line);
                counter++;
            }
            read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        c.toASCII(arrayList, counter);
    }
}


