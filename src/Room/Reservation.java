package Room;

import java.util.*;

class Reservation 
{
    private String guestName;
    private String roomType;
    private String roomID;
    private List<String> services;

    public Reservation(String guestName, String roomType, String roomID, List<String> services) 
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.roomID = roomID;
        this.services = services != null ? services : new ArrayList<>();
    }

    public String getRoomType() 
    {
        return roomType;
    }
    

    @Override
    public String toString() 
    {
        return "Reservation confirmed for " + guestName +
               " (Room: " + roomType + ", ID: " + roomID +
               ", Services: " + services + ")";
    }
}

