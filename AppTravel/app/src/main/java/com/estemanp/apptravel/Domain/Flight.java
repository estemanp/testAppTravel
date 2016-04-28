package com.estemanp.apptravel.Domain;

import java.util.List;

/**
 * Created by estemanp on 26/04/16.
 */
public class Flight {
    private int id;
    private Airline airline;
    private String date;
    private String hour;
    private Journey journey;
    private List<Chair> chairList;
    private String state;

    public Flight(int id, Airline airline, String date, String hour, Journey journey, List<Chair> chairList, String state){
        this.id = id;
        this.airline = airline;
        this.date = date;
        this.hour = hour;
        this.journey = journey;
        this.chairList = chairList;
        this.state=state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Journey getJourney() {
        return journey;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    public List<Chair> getChairList() {
        return chairList;
    }

    public void setChairList(List<Chair> chairList) {
        this.chairList = chairList;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
