import java.util.Scanner;

public class Airline {
    public int[] seats = new int[10];
    public int i;
    public int choice;


    // Reservation
    public void reservation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type 1 for First Class:\n Please type 2 for Economy Class: ");
        int choice = in.nextInt();

        if(choice== 1){
            firstClass();
        }
        else if(choice== 2){
            economyClass();
        }
        else {
            System.out.println("Invalid selection!");
        }
    }

    public void firstClass() {

        for (i = 0; i < 5; i++) {
            if (seats[i] == 0) {
                seats[i] = 1;
                System.out.println("Your seat number is " + i + 1 + " in First Class");
                break;
                }
            }

        }
        public void economyClass(){
            for (i = 5; i < 10; i++) {
                if (seats[i] == 0) {
                    seats[i] = 1;
                    System.out.println("Your seat number is " + i + 1 + " in Economy Class");
                    break;
                }
            }
        }

    }
