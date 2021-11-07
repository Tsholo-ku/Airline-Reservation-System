import java.util.Scanner;

public class Airline {
    private int[] seats = new int[10];
    private int i;
    private int choice;
    private String change;

    // Reservation
    public void reservation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type 1 for First Class:\n Please type 2 for Economy Class: ");
        int choice = in.nextInt();

        if (choice == 1) {
            firstClass();
        } else if (choice == 2) {
            economyClass();
        } else {
            System.out.println("Invalid selection!");
        }
        in.close();
    }

    public int firstClass() {
        Scanner in = new Scanner(System.in);
        boolean seatAvailable = false; // use a flag to indicate if a seat is availabe or not

        for (i = 0; i < 5; i++) {
            if (this.seats[i] == 0) {
                this.seats[i] = 1;
                System.out.println("Your seat number is " + (i + 1) + " in First Class");
                seatAvailable = true; // set flag to true if found a seat available
                break;

            }
        }

        if (!seatAvailable) {
            System.out.println(
                    "First Class is currently at capacity, would you like to be placed in Economy Class? \n Please type Y/N:  ");
            change = in.next();
            if (change == "y") {
                return economyClass();
            } else {
                System.out.println("Next flight is in 3 hours");
                return -1; // indicates no seat available
            }
        } else {
            return (i + 1); // return the seat number
        }

    }

    public int economyClass() {
        Scanner in = new Scanner(System.in);
        boolean seatAvailable = false;

        for (i = 5; i < 10; i++) {
            if (this.seats[i] == 0) {
                this.seats[i] = 1;
                System.out.println("Your seat number is " + (i + 1) + " in Economy Class");
                seatAvailable = true;
                break;

            }
        }
        if (!seatAvailable) {
            System.out.println(
                    "Economy Class is currently at capacity, would you like to be placed in First Class? \n Please type Y/N: ");
            change = in.next();
            if (change == "y") {
                return firstClass();
            } else {
                System.out.println("Next flight leaves in 3 hours");
                return -1; // indicates no seat available
            }
        } else {
            return (i + 1); // returns the seat available
        }
    }

}
