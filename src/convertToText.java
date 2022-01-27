import java.util.ArrayList;

public class convertToText {


    ArrayList<Integer> ASCIIList = new ArrayList<>();
    ArrayList<String> textArray = new ArrayList<>();

    public ArrayList binaryToASCII(ArrayList<String> binaryList){


        for (int h = 0; h < binaryList.size(); h++) {
            ASCIIList.add(Integer.parseInt(binaryList.get(h),2));
        }

        return ASCIIToText(ASCIIList);
    }
    public ArrayList ASCIIToText(ArrayList<Integer> ASCIIList1){
        for (int c = 0; c < ASCIIList1.size(); c++) {
            textArray.add(Character.toString(ASCIIList1.get(c)));
        }
        return textArray;
    }
}
