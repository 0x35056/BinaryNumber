import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Input binary number: ");
        String binaryNumber = scan.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.println("Output: " + decimalNumber);

    }
}
