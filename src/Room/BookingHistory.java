package Room;

import java.util.*;

public class BookingHistory 
{
    private List<Reservation> history;

    public BookingHistory() 
    {
        this.history = new ArrayList<>();
    }

    // Add reservation to history
    public void addReservation(Reservation reservation) 
    {
        history.add(reservation);
        System.out.println("Added to history: " + reservation);
    }

    // Generate report of all reservations
    public void generateReport() 
    {
        System.out.println("\n Booking Report ");
        
        if (history.isEmpty()) 
        {
            System.out.println("No reservations found.");
            return;
        }
        
        for (Reservation r : history) 
        {
            System.out.println(r);
        }
    }

    // Count reservations by room type
    public void countByRoomType() 
    {
        Map<String, Integer> counts = new HashMap<>();
        
        for (Reservation r : history) 
        {
            counts.put(r.getRoomType(), counts.getOrDefault(r.getRoomType(), 0) + 1);
        }

        System.out.println("\nReservation Count by Room Type ");
        
        for (Map.Entry<String, Integer> entry : counts.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) 
    {
        BookingHistory history = new BookingHistory();

        // Simulate confirmed reservations with services
        Reservation r1 = new Reservation("Alice", "Single", "Single-abc123",
                                         Arrays.asList("Breakfast", "Wi-Fi"));
        Reservation r2 = new Reservation("Bob", "Double", "Double-def456",
                                         Arrays.asList("Spa"));
        Reservation r3 = new Reservation("Charlie", "Single", "Single-ghi789",
                                         Arrays.asList("Airport Pickup", "Breakfast"));

        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        // Generate reports
        history.generateReport();
        history.countByRoomType();
    }
}
