# BookMyStay

Overview

This module demonstrates Use Case 5 of the BookMyStay App:
Add-On Service Selection.
It allows guests to enhance their confirmed reservations
 (from UC4) with optional services such as breakfast, spa, airport pickup, or Wi-Fi. 
The system uses a Map to attach multiple services to a single reservation, ensuring flexibility and personalization.



Features

Attach optional services to confirmed reservations.
Support multiple services per guest.
Store services in a structured way for easy retrieval.

Data Structures
Map<String, List<String>> → Maps reservation IDs to a list of selected services.


Flow

Guest confirms reservation (UC4).
Guest selects optional services.
System maps reservation ID to selected services.
Services are stored and can be retrieved for billing or reporting.

