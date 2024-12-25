import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws Exception {

        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("--------------------");
            System.out.println("Hotel Reservation System");
            System.out.println("   " + "1.View available rooms.");
            System.out.println("   " + "2.Book a room.");
            System.out.println("   " + "3.View all booking details.");
            System.out.println("   " + "4.Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter your name:");
                    String userName = sc.next();
                    System.out.print("Enter room number: ");
                    int roomNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter check in date(YYYY:MM:DD):");
                    String checkIn = sc.nextLine();
                    System.out.print("Enter check out date(YYYY:MM:DD):");
                    String checkOut = sc.nextLine();
                    hotel.bookRoom(userName, roomNumber, checkIn, checkOut);
                    break;
                case 3:
                    hotel.displayBookings();
                    break;
                case 4:
                    System.out.println("Exiting.....Thank you");
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        } while (choice!=4);
//        while (choice != 4);
    }
}