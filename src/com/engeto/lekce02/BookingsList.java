package com.engeto.lekce02;

import java.util.ArrayList;
import java.util.List;

public class BookingsList {
    private Booking booking;
    List<Booking> bookings = new ArrayList<>();





    public void addBooking(Booking newBooking){

        bookings.add(newBooking);
    }

    public void printBooking(){
        int i;
        for(i=0; i<=bookings.size()-1;i++){
            System.out.println(bookings.get(i).getDescription());

        }
    }
}
