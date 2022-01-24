import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class convertToBinary {
    ArrayList<String> binaryList = new ArrayList<>();


    public void toASCII(ArrayList<String> arrayList, int counter1, String fileName1) {
        String string = arrayList.get(counter1 - 1);
        String[] split = string.split("");
        ArrayList<String> charList = new ArrayList<>(Arrays.asList(split));


        for (int i = 0; i < charList.size(); i++) {
            String stringInArr = charList.get(i);
            System.out.println(charList.get(i));
            char character = stringInArr.charAt(0);
            int toASCII = character;
            toBinary(toASCII,fileName1);
        }
    }

    public void toBinary(int valueASCII,String fileName2) {
        String binaryVal = Integer.toBinaryString(valueASCII);
        binaryList.add(binaryVal);
        writeToFile(binaryList,fileName2);
    }
    public void writeToFile(ArrayList<String> val, String fileName3){
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("D:\\Sample\\sampleBinary.txt"));
            for(int z = 0; z < val.size(); z++) {
                write.write(val.get(z) + " ");
            }
                write.close();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
