package BusReservationSystem;

public class Bus {

    private String busId;
    private Seat [] seats;
    private int rows;
    private int seatsPerRow;

    public Bus(String busId, int rows, int seatsPerRow) {
        this.busId = busId;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        this.seats = new Seat[rows*seatsPerRow];
        int seatNum = 1;
        for (int i=1;i<=rows;i++) {
            for (int j=1;j<=seatsPerRow;j++) {
                seats[seatNum-1] = new Seat(i,j);
                seatNum++;
            }
        }
    }

    public Seat[] getSeats() {
        return seats;
    }
}
