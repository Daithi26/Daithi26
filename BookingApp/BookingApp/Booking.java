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
public abstract class Booking {
    private String name;
    private String date;
    private int reference;
    int duration;

    public Booking(String name, String date, int reference, int duration) {
        this.name = name;
        this.date = date;
        this.reference = reference;
        this.duration = duration;
    }
    
    public Booking(){
        name = " ";
        date = " ";
        reference = 0;
        duration = 0;
    }
            

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDetails(){
        return "Client Details:"+ reference +","+ date +","+ name +","+ duration;
    }
     public abstract void computePrice();
}
