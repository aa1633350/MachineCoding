package BusReservationSystem;

public class Seat {

    private int seatNumber;
    private int rowNumber;
    private boolean reserved;

    public Seat(int rowNumber,int seatNumber) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.reserved = false;

    }

    public boolean isReserved() {
        return this.reserved;
    }

    public void setReserved() {
        this.reserved = true;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
