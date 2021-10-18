package com.engeto.lekce02;
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Guest guest01=new Guest("Adéla", "Maříková", LocalDate.of(1993, 3, 13));
        Guest guest02=new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
Room room01=new Room(1, 1, true, true,1000);
Room room02=new Room(2, 1, true, true,1000);
Room room03=new Room(3, 3, true, false,2400);

guest01.getDescription();
guest02.getDescription();
room01.getDescription();
room02.getDescription();
room03.getDescription();

Booking booking=new Booking(guest01, room01, LocalDate.of(2021, Month.JULY, 19), LocalDate.of(2021, Month.JULY, 26));
//booking.addGuest(guest02);
        System.out.println(booking.getDescription());
BookingsList bookings=new BookingsList();
bookings.addBooking(booking);
bookings.printBooking();
    }
}
