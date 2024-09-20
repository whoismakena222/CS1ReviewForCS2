import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Variable to hold the sum of digits
        int sum = 0;	//WHAT IS THIS DOING AND WHY(1)

        // While loop to process each digit of the number
        while (number > 0) {	// while the number is more than 0
            sum += number % 10;  // add the remainder of number/10 to sum
            number /= 10;        // set number = number/10 with chopped off decimal
        }

        // Output the result
        System.out.println("The sum of the digits is: " + sum); // 612 = 9 , etc

        // Close the scanner
        scanner.close();
        }
	}

