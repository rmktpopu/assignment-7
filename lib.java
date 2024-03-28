import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

       
        double fine;
        if (daysLate <= 7) {
            fine = 0.5 * daysLate;
        } else if (daysLate <= 14) {
            fine = 1.0 * daysLate; 
        } else if (daysLate <= 21) {
            fine = 5.0 * daysLate; 
        } else {
            System.out.println("Your membership is canceled due to excessive delay.");
            scanner.close();
            return;
        }

        
        System.out.println("Fine amount: Rs. " + fine);

        scanner.close();
    }
}
