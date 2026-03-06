# BookMyStay

Overview

This module demonstrates Use Case 4 of the BookMyStay App:
Reservation Confirmation & Room Allocation.
It ensures that once a booking request is dequeued, 
the system assigns a unique room ID, updates inventory immediately, 
and prevents double-booking. 
This step guarantees booking integrity and consistency across the system.


Features

Assign unique room IDs to each confirmed reservation.
Prevent duplicate room allocations using a Set.
Update room counts in inventory after allocation.
Simulate synchronous allocation with delays (Thread.sleep).

Data Structures

Set<String> → Stores allocated room IDs to ensure uniqueness.

HashMap<String, Integer> → Tracks available room counts per room type.


Flow

Dequeue booking request (from UC3).
Generate a unique room ID.
Add room ID to Set to prevent duplicates.
Decrement room count in HashMap.
Confirm reservation or reject if no rooms available.