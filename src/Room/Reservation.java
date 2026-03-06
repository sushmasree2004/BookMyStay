package Room;

import java.util.*;

class Reservation 
{
    String name;
    String type;

    public Reservation(String name, String type) 
    {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() 
    {
        return "Reservation for " + name + " (Room: " + type + ")";
    }
}

