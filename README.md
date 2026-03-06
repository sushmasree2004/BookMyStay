# BookMyStay

 Overview
This module demonstrates Use Case 1 of the BookMyStay App:

Room Inventory Setup & Management.
It establishes a single source of truth for hotel room inventory using Java collections. 
The system ensures fast lookups, consistent data, and prevents overbooking errors caused by manual tracking.

 Features

Initialize room types (Single, Double, Suite).
Store room counts and prices.
Support dynamic updates to inventory.
Provide real-time availability status.
O(1) lookup using HashMap


Data Structures

HashMap<String, Integer> → Maps room type to available count.
HashMap<String, Double> → Maps room type to price.

 Flow

Add room type.
Store in HashMap.
Update count/price.
Confirm changes.