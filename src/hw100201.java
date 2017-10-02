import java.util.Scanner;

public class hw100201 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char chl = scn.next().charAt(0);
        if (chl - 'A' >= 0 && chl - 'A' < 26) {
            System.out.println("uppercase");
        }
        else if (chl -'a'>=0 && chl -'a' < 26){
            System.out.println("lowercase");
        }
        else
            System.out.println("special character");
    }
}