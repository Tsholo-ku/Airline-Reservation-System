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
        Scanner in = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            if (seats[i] == 0) {
                seats[i] = 1;
                System.out.println("Your seat number is " + (i + 1) + " in First Class");
                break;
                }
            }
        if(i>4){
            System.out.println("First Class is currently at capacity, would you like to be placed in Economy Class? \n Please type Y/N:  ");
            change = in.next();
            if(change=="y"){
                economyClass();
            }
            else{
                System.out.println("Next flight is in 3 hours");
            }
        }

        }
        public void economyClass(){
            Scanner in = new Scanner(System.in);
            for (i = 5; i < 10; i++) {
                if (seats[i] == 0) {
                    seats[i] = 1;
                    System.out.println("Your seat number is " + (i + 1) + " in Economy Class");
                    break;
                }
            }
            if(i>9){
                System.out.println("Economy Class is currently at capacity, would you like to be placed in First Class? \n Please type Y/N: ");
                change = in.next();
                if(change=="y"){
                    firstClass();
                }
                else{
                    System.out.println("Next flight leaves in 3 hours");
                }
            }
        }
        in.close();
    }
