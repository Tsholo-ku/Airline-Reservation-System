import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Airline myAirline = new Airline();
        while (true) {

            System.out.println("**********MENU**********");
            System.out.println("Welcome to AIRLINE!!");
            System.out.println("Please enter your details below");
            System.out.print("Name: ");
            String userName = in.next();
            System.out.print("Surname: ");
            String userSurname = in.next();
            System.out.print("Age: ");
            int userAge = in.nextInt();
            System.out.print("Destination: ");
            String userDest = in.next();
            Passenger myPassenger = new Passenger(userName, userSurname, userAge, userDest);
            int seatNumber = myAirline.reservation();
            if(seatNumber!=-1){
                System.out.println("********BOARDING PASS*******\nPassenger name: "+userName+"\nPassenger Surname: "+userSurname+"\nPasenger age: "+userAge+"\nDestination: "+userDest+"Seat number: "+myAirline.reservation());
                System.out.println("Your flight is on time");
                System.out.println("Thank you for using AIRLINE, have a safe trip!!!");
            }

        }

    }
}
