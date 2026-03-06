package Room;


import java.util.HashMap;

public class RoomInventory 
{
	
    //  room type -> available count
    private HashMap<String, Integer> counts;
    
    //  room type -> price
    private HashMap<String, Double> prices;

    public RoomInventory() 
    {
        counts = new HashMap<>();
        prices = new HashMap<>();
    }

    // Initialize room type 
    public void addRoomType(String type, int count, double price) 
    {
       counts.put(type, count);
       prices.put(type, price);
    }

    // Update room count dynamically
    public void updateCount(String type, int newCount)
    {
        if (counts.containsKey(type)) 
        {
            counts.put(type, newCount);
        }
    }

    // Update room price dynamically
    public void updatePrice(String type, double newPrice) 
    {
        if (prices.containsKey(type)) 
        {
            prices.put(type, newPrice);
        }
    }

    // Get real-time availability
    public void showAvailability() 
    {
        for (String type : counts.keySet()) 
        {
            System.out.println(type + " Rooms: " + counts.get(type) +
                               " available at ₹" + prices.get(type));
        }
    }

    public static void main(String[] args) 
    {
        RoomInventory inventory = new RoomInventory();
        
        inventory.addRoomType("Single", 10, 2000.0);
        inventory.addRoomType("Double", 5, 3500.0);
        inventory.addRoomType("Suite", 2, 8000.0);

        inventory.showAvailability();

        // Update example
        inventory.updateCount("Single", 8);
        inventory.updatePrice("Suite", 7500.0);

        System.out.println("\nAfter updates:");
        inventory.showAvailability();
    }
}


