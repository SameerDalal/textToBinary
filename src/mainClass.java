import java.util.Scanner;

public class mainClass {

    getInputFromTextString g = new getInputFromTextString();


    public static void main(String[] args){
        mainClass m = new mainClass();
        m.menu();
    }
    public void menu(){
        System.out.println("What would you like to do?? \n1). Convert Text to binary \n2). Convert binary to Text \nD:\\Sample\\sample.txt\nD:\\Sample\\sampleBinary.txt");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        if (choose == 1){
            g.getInput();
        } else {
            // binary to text
        }
    }
}
