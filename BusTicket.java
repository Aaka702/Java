import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input passenger details
        System.out.println("Enter passenger name:");
        String passengerName = scanner.nextLine();

        System.out.println("Enter departure point:");
        String departurePoint = scanner.nextLine();

        System.out.println("Enter destination:");
        String destination = scanner.nextLine();

        System.out.println("Enter ticket price:");
        double ticketPrice = scanner.nextDouble();

        // Calculate service charge (10% of ticket price)
        double serviceCharge = ticketPrice * 0.10;

        // Calculate total charge
        double totalCharge = ticketPrice + serviceCharge;

        // Print ticket
        System.out.println("\n------------------------");
        System.out.println("      BUS TICKET");
        System.out.println("------------------------");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Departure Point: " + departurePoint);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Service Charge: $" + serviceCharge);
        System.out.println("Total Charge: $" + totalCharge);
        System.out.println("------------------------");
    }
}
