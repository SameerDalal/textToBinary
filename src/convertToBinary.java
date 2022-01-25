import java.util.ArrayList;
import java.util.Arrays;

public class convertToBinary {

    writeToFile wr = new writeToFile();
    ArrayList<Integer> ASCIIList = new ArrayList<>();
    ArrayList<Integer> BinaryList = new ArrayList<>();

    public void toASCII(ArrayList<String> arrayList, int counter1) {

        String[] split = arrayList.get(counter1 - 1).split("");
        ArrayList<String> charList = new ArrayList<>(Arrays.asList(split));

        for (int i = 0; i < charList.size(); i++) {
            ASCIIList.add((int) charList.get(i).charAt(0));
        }
        toBinary();
    }

    private void toBinary() {
        for (int z = 0; z < ASCIIList.size(); z++){
            BinaryList.add(Integer.parseInt(Integer.toBinaryString(ASCIIList.get(z))));
        }
        wr.write(BinaryList);
    }
}
