package com.engeto.lekce02;

public class Room {
    private int roomNumber;
    private int bedsQty;
    private boolean isSeaView;
    private boolean isBalcony;
    private int roomPrice;

    public Room(int roomNumber, int bedsQty, boolean isSeaView, boolean isBalcony, int roomPrice) {
        this.roomNumber = roomNumber;
        this.bedsQty = bedsQty;
        this.isSeaView = isSeaView;
        this.isBalcony = isBalcony;
        this.roomPrice = roomPrice;
    }

    public void getDescription(){
        System.out.println("Pokoj č. "+roomNumber);
        System.out.println("Počet lůžek: "+bedsQty);
        if (isSeaView) System.out.println("s výhledem na moře");
        if (isBalcony) System.out.println("s balkónem");
        System.out.println("Cena: "+roomPrice+" CZK/pokoj/noc");
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedsQty() {
        return bedsQty;
    }

    public void setBedsQty(int bedsQty) {
        this.bedsQty = bedsQty;
    }

    public boolean isSeaView() {
        return isSeaView;
    }

    public void setSeaView(boolean seaView) {
        isSeaView = seaView;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }
}
