package Room;

import java.util.*;

public class RoomAllocator 
{
	
    private HashMap<String, Integer> roomCounts;
    private Set<String> allocatedRoomIDs;

    public RoomAllocator(HashMap<String, Integer> counts) 
    {
        this.roomCounts = counts;
        this.allocatedRoomIDs = new HashSet<>();
    }

    // Generate unique room ID
    private String generateRoomID(String roomType) 
    {
        return roomType + "-" + UUID.randomUUID().toString().substring(0, 6);
    }

    // Confirm reservation 
    public synchronized Reservation confirmReservation(String guestName, String roomType) 
    {
        if (roomCounts.getOrDefault(roomType, 0) > 0) 
        {
            String roomID = generateRoomID(roomType);

            // Ensure uniqueness
            while (allocatedRoomIDs.contains(roomID)) 
            {
                roomID = generateRoomID(roomType);
            }

            allocatedRoomIDs.add(roomID);
            roomCounts.put(roomType, roomCounts.get(roomType) - 1);

            Reservation reservation = new Reservation(guestName, roomType, roomID);
            System.out.println(reservation);

            try 
            {
                // Simulate allocation delay (e.g., DB update, payment confirmation)
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }

            return reservation;
        }
        else 
        {
            System.out.println("No rooms available for type: " + roomType);
            return null;
        }
    }

    public static void main(String[] args) 
    {
        HashMap<String, Integer> counts = new HashMap<>();
        counts.put("Single", 2);
        counts.put("Double", 1);

        RoomAllocator allocator = new RoomAllocator(counts);

        // Simulate multiple confirmations
        allocator.confirmReservation("Alice", "Single");
        allocator.confirmReservation("Bob", "Single");
        allocator.confirmReservation("Charlie", "Single"); // should fail
    }
}
