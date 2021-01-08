import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private RoomType type;
    private double nightlyRate;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, RoomType roomType, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = roomType ;
        this.nightlyRate = nightlyRate;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public RoomType getType() {
        return type;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public int guestListSize(){
        return this.guests.size();
    }

    public void checkInGuest(Guest guest) {
        if (this.guestListSize() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public void checkOutGuests() {
        if (!this.isVacant()) {
            this.guests.clear();
        }
    }

    public boolean isVacant() {
        return this.guestListSize() == 0;
    }


}
