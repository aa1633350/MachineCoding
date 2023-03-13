package BusReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

    private static List<Seat> bookSeats(int numOfSeats, Seat [] seats) {
        List<Seat> reservedSeats = new ArrayList<>();
        // Continuous allocation of seats.
        int continuousSeats = 0;
        int startIndex = -1;
        for (int i=0;i<seats.length;i++) {
            if(!seats[i].isReserved()) {
                continuousSeats++;
                reservedSeats.add(seats[i]);
                if(startIndex == -1) {
                    startIndex = i;
                }
                if(continuousSeats>=numOfSeats) {
                    System.out.println("Continuous seats founds for you");
                    for (int j=startIndex;j<=i;j++) {
                        seats[j].setReserved();
                    }
                    return reservedSeats;
                }
            } else {
                continuousSeats=0;
                startIndex = -1;
                reservedSeats.clear();
            }
        }
        // Random allocation of seats.
        int randomAllocatedSeats = 0;
        if(continuousSeats < numOfSeats) {
            for (Seat seat : seats) {
                if(!seat.isReserved()) {
                    randomAllocatedSeats++;
                    reservedSeats.add(seat);
                    seat.setReserved();
                    if(randomAllocatedSeats>=numOfSeats) {
                        break;
                    }
                }
            }
        }
        return reservedSeats;
    }
    public static void main(String[] args) {
        // Create a new bus.

        Bus bus = new Bus("KA123",4,2);
        Seat [] seats = bus.getSeats();
        List<Seat> reservedSeats = bookSeats(2, seats);
        System.out.println("User 1 seats allocated to you are");
        for (Seat reservedSeat : reservedSeats) {
            System.out.println("Seat " + reservedSeat.getSeatNumber() + " is allocated to you");
        }

        reservedSeats = bookSeats(2, seats);
        System.out.println("User 2 seats allocated to you are");
        for (Seat reservedSeat : reservedSeats) {
            System.out.println("Seat " + reservedSeat.getSeatNumber() + " is allocated to you");
        }
    }


}
