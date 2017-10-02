import java.util.Scanner;

public class hw100202 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char chl = scn.next().charAt(0);
        if (chl - 'A' >= 0 && chl - 'A' < 26) {

            System.out.println(Character.toString(chl).toLowerCase());
        }
        else if (chl -'a'>=0 && chl -'a' < 26){
            System.out.println(Character.toString(chl).toUpperCase());
        }
        else
            System.out.println("special character");
    }
}