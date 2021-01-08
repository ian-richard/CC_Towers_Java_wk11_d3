import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(String name) {
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }


    public String getName() {
        return name;
    }

    public int guestListSize() {
        return this.guests.size();
    }

    public void checkInGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOutGuests() {
        this.guests.clear();
    }
}
