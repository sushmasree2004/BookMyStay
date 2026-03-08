# BookMyStay


Overview

This module demonstrates Use Case 6 of the BookMyStay App:
Booking History & Reporting.
It stores all confirmed reservations (from UC4) along with optional services 
(from UC5) into a booking history log. The system can then generate reports for management, 
such as a full booking list or aggregated counts by room type.


Features

Maintain a booking history of all reservations.
Store guest details, room type, unique room ID, and selected services.
Generate reports showing all reservations.
Provide summary counts by room type.

Data Structures

List<Reservation> → Stores all reservations in chronological order.
Map<String, Integer> → Used for reporting counts by room type.


.

Flow

Reservation confirmed in UC4.
Services attached in UC5.
Reservation stored in booking history.
Reports generated for management.

