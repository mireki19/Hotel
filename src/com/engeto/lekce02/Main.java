package com.engeto.lekce02;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Guest guest01=new Guest("Adéla", "Maříková", LocalDate.of(1993, 3, 13));
        Guest guest02=new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        TypeOfStay typeOfStay=TypeOfStay.HOLIDAY;
Room room01=new Room(1, 1, true, true,1000);
Room room02=new Room(2, 1, true, true,1000);
Room room03=new Room(3, 3, true, false,2400);

        System.out.println("výpis dvou hostů");
guest01.getDescription();
guest02.getDescription();
        System.out.println("výpis tří pokojů");
room01.getDescription();
room02.getDescription();
room03.getDescription();
        System.out.println();


Booking booking=new Booking(guest01, room01, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26),typeOfStay );
booking.addGuest(guest02);
        BookingsList bookings=new BookingsList();
        System.out.println("Výpis první rezervace");
        System.out.println(booking.getDescription());


bookings.addBooking(booking);

booking = new Booking(guest01, room03, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14),TypeOfStay.HOLIDAY);
booking.addGuest(guest02);
bookings.addBooking(booking);
        System.out.println("Výpis všech rezervací: \n");
bookings.printBooking();
        System.out.println("Testovací rezervace při default zadání rekreačního pobytu\n" +
                "rezervace pro Jana Dvořáčka na pokoj č. 2");
        Booking testHoliday=new Booking(guest02, room02, TypeOfStay.HOLIDAY);
        System.out.println(testHoliday.getDescription());

    }
}
