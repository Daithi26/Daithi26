/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

/**
 *
 * @author david
 */
public class HotelRoom extends Booking {
    int RoomNumber;
    String Breakfast; 
    double Price;

    public HotelRoom(int RoomNumber, String Breakfast, String name, String date, int reference, int duration) {
        super(name, date, reference, duration);
        this.RoomNumber = RoomNumber;
        this.Breakfast = Breakfast;
    }

    public HotelRoom() {
        super();
        RoomNumber = 0;
        Breakfast = " ";
    }
    
    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getBreakfast() {
        return Breakfast;
    }

    public void setBreakfast(String Breakfast) {
        this.Breakfast = Breakfast;
    }

    @Override
    public void computePrice() {
        Price = duration*130+10;
    }
}
