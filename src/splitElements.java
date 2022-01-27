import java.util.ArrayList;

public class splitElements {

    ArrayList<String> splitList = new ArrayList<>();

    public ArrayList splitArrayForConvertingToBinary(ArrayList<String> arrayToSplit){

        for (int a = 0; a < arrayToSplit.size(); a++){

            String[] characters = arrayToSplit.get(a).split("");
            for (String element : characters) {
                splitList.add(element);
            }
        }
        return splitList;
    }

    public ArrayList splitArrayForConvertingToText(ArrayList<String> arrayToSplit){
        for (int a = 0; a < arrayToSplit.size(); a++){

            String[] characters = arrayToSplit.get(a).split(" ");
            for (String element : characters) {
                splitList.add(element);
            }
        }
        return splitList;
    }

}
