package com.estemanp.apptravel.Domain;

import java.util.List;

/**
 * Created by estemanp on 26/04/16.
 */
public class Reservation {

    private List<Flight> flightList;
    private int totalPrice;
    private Boolean paid;

    public Reservation(List<Flight> flightList, int totalPrice, Boolean paid){
        this.flightList = flightList;
        this.totalPrice = totalPrice;
        this.paid = paid;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
}
