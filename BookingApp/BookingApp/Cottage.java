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
public class Cottage extends Booking {
   private String KeyCollectionPoint;
   private String Address;
   double Price;

    public Cottage(String KeyCollectionPoint, String Address, String name, String date, int reference, int duration) {
        super(name, date, reference, duration);
        this.KeyCollectionPoint = KeyCollectionPoint;
        this.Address = Address;
    }

    public Cottage() {
        super();
        KeyCollectionPoint = " ";
        Address = " ";
    }

    public String getKeyCollectionPoint() {
        return KeyCollectionPoint;
    }

    public void setKeyCollectionPoint(String KeyCollectionPoint) {
        this.KeyCollectionPoint = KeyCollectionPoint;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public void computePrice() {
        Price = duration*60+50;
    }
   
}
