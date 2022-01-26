import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class mainClass {

    readFromFile g = new readFromFile();
    convertToBinary cb = new convertToBinary();
    Scanner scan = new Scanner(System.in);
    writeToFile wr = new writeToFile();



    public static void main(String[] args){
       mainClass mc = new mainClass();
       mc.menu();
    }
    public void menu(){
        System.out.println("What would you like to do?? \n1). Convert Text to binary \n2). Convert binary to Text \nD:\\Sample\\sample.txt\nD:\\Sample\\sampleBinary.txt");

        int choose = scan.nextInt();

        if (choose == 1){
            System.out.println("Enter file name: ");
            String fromFileName = scan.next();


            System.out.println("Enter the file you would like to see output: ");
            String toFile = scan.next();

            System.out.println(wr.write(cb.toASCII(g.getInput(fromFileName)),toFile));


        } else {
            // binary to text
        }
    }
}
