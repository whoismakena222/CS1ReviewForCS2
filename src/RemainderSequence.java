import java.util.Scanner;

        public class RemainderSequence {
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the starting number (n): ");
            int n = scanner.nextInt();  //enter starting number

            System.out.print("Enter the divisor (m): ");
            int m = scanner.nextInt();  //enter number to divide by

            while (true) {
                int remainder = n % m;    //
                System.out.print(remainder + " ");    //WHAT IS THIS DOING AND WHY(4)

                if (remainder == 0) {
                    break;		//WHAT IS THIS DOING AND WHY(5)
                }

                n = remainder;		//WHAT IS THIS DOING AND WHY(6)
                }

            scanner.close();  // Close the scanner
               }
}
