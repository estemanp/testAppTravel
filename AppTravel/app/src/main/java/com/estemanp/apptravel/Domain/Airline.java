package com.estemanp.apptravel.Domain;

/**
 * Created by estemanp on 26/04/16.
 */
public class Airline {
    private String trademark;
    private int price;

    public Airline(String trademark, int price){
        this.trademark=trademark;
        this.price=price;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
