# BookMyStay

Overview

This module demonstrates Use Case 3 of the BookMyStay App:

Booking Request Handling.
It ensures fairness when multiple guests attempt to book rooms simultaneously
by processing requests in the order they arrive. The system uses a queue to 
enforce FIFO (First-In-First-Out) ordering, preventing race conditions and inconsistent allocations.

Features

Accept booking requests from guests.
Store requests in a queue.
Process requests sequentially in arrival order.
Simulate synchronous handling with delays (Thread.sleep).


Data Structures
Queue<Reservation> (LinkedList) → Stores booking requests in FIFO order.


Flow
Guest submits booking request.
Request is enqueued.
Requests are processed one by one in FIFO order.
Each request is handled with simulated delay to mimic real-world operations.