package Room;


import java.util.HashMap;

public class RoomSearch 
{
    private HashMap<String, Integer> counts;
    private HashMap<String, Double> prices;

    public RoomSearch(HashMap<String, Integer> counts, HashMap<String, Double> prices) 
    {
        this.counts = counts;
        this.prices = prices;
    }

    // Display available rooms 
    public void searchRooms() 
    {
        System.out.println("Available Rooms:");
        for (String type : counts.keySet()) 
        {
            int count = counts.get(type);
            if (count > 0) 
            { 
                System.out.println(type + " - " + count + " available at ₹" + prices.get(type));
            }
        }
    }

    public static void main(String[] args) 
    {
        
        HashMap<String, Integer> counts = new HashMap<>();
        HashMap<String, Double> prices = new HashMap<>();

        counts.put("Single", 8);
        counts.put("Double", 5);
        counts.put("Suite", 0); // fully booked

        prices.put("Single", 2000.0);
        prices.put("Double", 3500.0);
        prices.put("Suite", 7500.0);

        RoomSearch search = new RoomSearch(counts, prices);
        search.searchRooms();
    }
}
