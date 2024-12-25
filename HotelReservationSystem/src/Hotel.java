import java.util.ArrayList;

public class Hotel {

    ArrayList<Room> rooms=new ArrayList<>();
    ArrayList<Booking> bookings=new ArrayList<>();

    public Hotel(){
        rooms.add(new Room(101,"Single",1000));
        rooms.add(new Room(102,"Double",2000));
        rooms.add(new Room(103,"Suite",5000));
    }
    public void displayAvailableRooms(){
        System.out.println("Available rooms:");
        for(Room room:rooms){
            if(room.isAvailable()){
                System.out.println(room);
            }
        }
    }
    public void bookRoom(String userName, int roomNumber, String checkIn, String checkOut){
        for (Room room:rooms){
            if (room.getRoomNumber()==roomNumber && room.isAvailable()) {
                room.setAvailable(false);
                bookings.add(new Booking(userName, roomNumber, checkIn, checkOut));
                System.out.println("Room number "+roomNumber+" booked successfully");
                return;
            }
        }
        System.out.println("Room not available or invalid room number.");
    }
    public void displayBookings(){
        System.out.println("All booking details:");
        for (Booking booking:bookings){
            System.out.println(booking);
        }
    }
}
