package Room;

import java.util.*;

class Reservation {
    String guestName;
    String roomType;
    String roomID;

    public Reservation(String guestName, String roomType, String roomID) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return "Reservation confirmed for " + guestName +
               " (Room: " + roomType + ", ID: " + roomID + ")";
    }
}

