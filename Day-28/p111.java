
import java.util.Scanner;

class TicketBooking {
    private final boolean[] seats;

    public TicketBooking(int totalSeats) {
        seats = new boolean[totalSeats];
    }

    // Display available seats
    public void displaySeats() {
        System.out.println("\nSeat Status:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.println("Seat " + (i + 1) + " : Booked");
            } else {
                System.out.println("Seat " + (i + 1) + " : Available");
            }
        }
    }

    // Book a seat
    public void bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number.");
            return;
        }

        if (seats[seatNumber - 1]) {
            System.out.println("Seat already booked.");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " booked successfully.");
        }
    }

    // Cancel booking
    public void cancelSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number.");
            return;
        }

        if (!seats[seatNumber - 1]) {
            System.out.println("Seat is not booked.");
        } else {
            seats[seatNumber - 1] = false;
            System.out.println("Seat " + seatNumber + " booking cancelled.");
        }
    }

    // Show booked seats
    public void bookedSeats() {
        System.out.println("\nBooked Seats:");
        boolean found = false;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.print((i + 1) + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No seats booked.");
        } else {
            System.out.println();
        }
    }
}

public class p111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketBooking booking = new TicketBooking(10); // 10 seats

        while (true) {

            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. View Seat Status");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Booked Seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    booking.displaySeats();
                    break;

                case 2:
                    System.out.print("Enter seat number to book (1-10): ");
                    int bookSeat = sc.nextInt();
                    booking.bookSeat(bookSeat);
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel (1-10): ");
                    int cancelSeat = sc.nextInt();
                    booking.cancelSeat(cancelSeat);
                    break;

                case 4:
                    booking.bookedSeats();
                    break;

                case 5:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}