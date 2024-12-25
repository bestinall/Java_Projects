public class Booking {

    private String userName;
    private int roomNumber;
    private String checkIn;
    private String checkOut;

    public Booking (String userName,int roomNumber,String checkIn,String checkOut){
        this.userName=userName;
        this.roomNumber=roomNumber;
        this.checkIn=checkIn;
        this.checkOut=checkOut;
    }

    @Override
    public String toString() {
        return "Booking by " + userName + " for Room " + roomNumber +
                " from " + checkIn + " to " + checkOut;
    }

}
