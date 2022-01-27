import java.util.ArrayList;

public class convertToBinary {

    ArrayList<Integer> ASCIIList = new ArrayList<>();
    ArrayList<Integer> BinaryList = new ArrayList<>();

    public ArrayList charToASCII(ArrayList<String> charList) {
        try {
            for (int i = 0; i < charList.size(); i++) {
                ASCIIList.add((int) charList.get(i).charAt(0));
            }
        } catch (Exception e) {}
        return toBinary();
    }
    private ArrayList toBinary() {
        for (int z = 0; z < ASCIIList.size(); z++){
            BinaryList.add(Integer.parseInt(Integer.toBinaryString(ASCIIList.get(z))));
        }
        return BinaryList;
    }
}
