package com.engeto.lekce02;

import java.util.ArrayList;
import java.util.List;

public class BookingsList {
    private Booking booking;
    List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking){
        bookings.add(this.booking);
    }

    public void printBooking(){
        int i;
        for(i=0; i<bookings.size()-1;i++){
            System.out.println(bookings.get(0).getDescription());

        }
    }
}
