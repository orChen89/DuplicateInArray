import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInArray {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

           System.out.println("Please enter the array length: ");

           final int[] numOfArr = new int[SCANNER.nextInt()];

           System.out.println("Please enter the array values: ");

        for (int i =  0; i < numOfArr.length; i++) {

            numOfArr[i] = SCANNER.nextInt();
        }
           System.out.println();
           System.out.println("The values which are repeated in the array are: ");

        for (int i = 0; i < numOfArr.length - 1; i++){

            if (numOfArr[i] == numOfArr[i+1]) {

            System.out.print(" "+ numOfArr[i]);
        }

      }
   }
}



