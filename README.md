# BookMyStay

Overview

This module demonstrates Use Case 2 of the BookMyStay App:


Room Search & Availability Check.
It allows guests to query the hotel’s inventory without altering it. 
The system ensures accurate availability display,
prevents booking of unavailable rooms, and provides fast responses.

Features

Display available room types.
Show pricing and amenities.
Prevent booking of rooms with zero availability.
Read-only access to inventory data.

Data Structures

HashMap<String, Integer> → Maps room type to available count.
HashMap<String, Double> → Maps room type to price.


Flow

Guest sends search request.
System looks up room type in HashMap.
Filters rooms with count > 0.
Displays availability, price, and amenities.