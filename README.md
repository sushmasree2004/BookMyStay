# BookMyStay

# BookMyStay


Overview

The BookMyStay App is a Core Java project designed to simulate a hotel booking system. 
It demonstrates six incremental Use Cases (UC1–UC6), 
each building on the previous one to create a complete workflow 
from room inventory setup to booking history and reporting.


Use Case Flow

UC1 – Room Inventory Setup  
Initialize room types, counts, and prices using HashMap.

UC2 – Room Search & Availability Check  
Guests query available rooms; system displays only bookable options.

UC3 – Booking Request (Queue)  
Requests are enqueued and processed in FIFO order to ensure fairness.

UC4 – Reservation Confirmation & Room Allocation  
Assign unique room IDs, update inventory, and confirm reservations.

UC5 – Add-On Service Selection  
Guests attach optional services (e.g., breakfast, spa, Wi-Fi) to reservations.

UC6 – Booking History & Reporting  
Store confirmed reservations with services and generate reports.




Features

Inventory Management → Prevents overbooking.
Availability Check → Guests see only valid options.
Fair Queueing → First-come-first-served booking.
Unique Allocation → No duplicate room IDs.
Service Add-ons → Personalized guest experience.
Reporting → Booking history and analytics by room type.