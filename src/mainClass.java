import java.util.Scanner;

public class mainClass {

    readFromFile g = new readFromFile();
    convertToBinary cb = new convertToBinary();
    Scanner scan = new Scanner(System.in);
    writeToFile wr = new writeToFile();
    splitElements se = new splitElements();
    convertToText ct = new convertToText();

    public static void main(String[] args){
       mainClass mc = new mainClass();
       mc.menu();
    }
    public void menu(){
        System.out.println("What would you like to do?? \n1). Convert Text to binary \n2). Convert binary to Text");

        int choose = scan.nextInt();

        System.out.println("Enter file name: ");
        String fromFileName = scan.next();

        System.out.println("Enter the file you would like to see output: ");
        String toFile = scan.next();

        if (choose == 1){
            System.out.println(wr.write(cb.charToASCII(se.splitArrayForConvertingToBinary(g.getInput(fromFileName))),toFile,fromFileName,false));

        } else {
            System.out.println(wr.write(ct.binaryToASCII(se.splitArrayForConvertingToText(g.getInput(fromFileName))),toFile,fromFileName,true));
        }
    }
}
