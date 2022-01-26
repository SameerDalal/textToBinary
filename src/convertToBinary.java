import java.util.ArrayList;
import java.util.Arrays;

public class convertToBinary {

    readFromFile rf = new readFromFile();
    ArrayList<Integer> ASCIIList = new ArrayList<>();
    ArrayList<Integer> BinaryList = new ArrayList<>();

    public ArrayList toASCII(ArrayList<String> arrayList) {

            String[] split = arrayList.get(rf.lineCounter).split("");
            ArrayList<String> charList = new ArrayList<>(Arrays.asList(split));

            for (int i = 0; i < charList.size(); i++) {
                ASCIIList.add((int) charList.get(i).charAt(0));
            }
        return toBinary();
    }

    private ArrayList toBinary() {
        for (int z = 0; z < ASCIIList.size(); z++){
            BinaryList.add(Integer.parseInt(Integer.toBinaryString(ASCIIList.get(z))));
        }
        return BinaryList;
    }
}
