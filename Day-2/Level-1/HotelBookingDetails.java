public class HotelBookingDetails {

    // Main method for testing
    public static void main(String[] args) {
        // Creating a default booking
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking: " + defaultBooking);

        // Creating a parameterized booking
        HotelBooking paramBooking = new HotelBooking("Alice Johnson", "Deluxe Suite", 3);
        System.out.println("Parameterized Booking: " + paramBooking);

        // Creating a copy of the parameterized booking
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copied Booking: " + copyBooking);
    }
}

 class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard Room";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getters and Setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Overriding toString() for better representation
    @Override
    public String toString() {
        return "HotelBooking{guestName='" + guestName + "', roomType='" + roomType + "', nights=" + nights + "}";
    }
}
