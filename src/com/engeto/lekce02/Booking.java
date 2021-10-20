package com.engeto.lekce02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Booking {
private Guest mainGuest;
List<Guest> otherGuests= new ArrayList<>();
private Room room;
private LocalDate dateFrom;
private LocalDate dateTo;
private int i;
private TypeOfStay typeOfStay;
    Scanner sc = new Scanner(System.in);

    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }

    public Booking(Guest mainGuest, Room room, LocalDate dateFrom, LocalDate dateTo, TypeOfStay typeOfStay) {
        this.mainGuest = mainGuest;
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.typeOfStay=typeOfStay;
    }

    public Booking(Guest mainGuest, Room room, TypeOfStay typeOfStay){
        this.mainGuest=mainGuest;
        this.room=room;
        this.typeOfStay=typeOfStay;
        if (this.typeOfStay==TypeOfStay.HOLIDAY) {
            this.dateFrom=LocalDate.now();
            this.dateTo=LocalDate.now().plusDays(6);
        } else {
            System.out.println("Zadej datum příjezdu ve formátu d.m.rrr:");
            String datum=sc.nextLine();
            this.dateFrom = LocalDate.parse(datum, DateTimeFormatter.ofPattern("d.M.yyyy"));
            System.out.println("Zadej datum odjezdu ve formátu d.m.rrr:");
            datum=sc.nextLine();
            this.dateTo = LocalDate.parse(datum, DateTimeFormatter.ofPattern("d.M.yyyy"));
        }

    }

    public void addGuest(Guest otherGuest){
        otherGuests.add(otherGuest);
    }
public void otherGuestName(){
        otherGuests.get(0).getName();
    }

    public String getDescription(){
        String popis="Pokoj: "+room.getRoomNumber();
        popis=popis+"\n Příjezd: "+dateFrom.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        popis=popis+"\n Odjezd: "+dateTo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        popis=popis+"\n Druh pobytu: "+typeOfStay;

        popis=popis + "\n Host";
        if (otherGuests.size()>0) popis=popis+"é: \n"; else popis=popis+": ";
                popis=popis+ mainGuest.getName()+" "+mainGuest.getSurname();
        if (otherGuests.size()>0) {
            for (i = 0; i < otherGuests.size() - 1; i++) ;
            {
                popis = popis + "\n" + otherGuests.get(i).getName() + " " + otherGuests.get(i).getSurname();
            }
        }
return popis;
    }


    public Guest getMainGuest() {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}
