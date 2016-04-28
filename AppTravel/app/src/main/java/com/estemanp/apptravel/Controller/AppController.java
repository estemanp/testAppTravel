package com.estemanp.apptravel.Controller;

import com.estemanp.apptravel.Domain.Airline;
import com.estemanp.apptravel.Domain.Chair;
import com.estemanp.apptravel.Domain.City;
import com.estemanp.apptravel.Domain.Flight;
import com.estemanp.apptravel.Domain.Journey;
import com.estemanp.apptravel.Domain.Kind;
import com.estemanp.apptravel.Domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by estemanp on 26/04/16.
 */
public class AppController {
    private static AppController _instance;
    private List<Person> users;
    private List<Airline> airlines;
    private List<Chair> chairs;
    private List<City> cities;
    private List<Journey> journeys;
    private List<Flight> flights;

    private AppController()
    {
        users=new ArrayList<Person>();
        setAirlines(new ArrayList<Airline>());
        chairs=new ArrayList<Chair>();
        setCities(new ArrayList<City>());
        journeys=new ArrayList<Journey>();
        flights=new ArrayList<Flight>();
        this.fillDateBases();
    }
    public static AppController getInstance()
    {
        if (_instance == null)
        {
            _instance = new AppController();
        }
        return _instance;
    }

    private void fillDateBases(){
        //Add users
        fillUsers();
        //Add Airlines
        fillAirlines();
        //Add chairs
        fillChairs();
        //add cities and journeys
        fillCitiesAndJourneys();

        //add flights
        fillFlights();
    }
    private void fillUsers(){
        Person person1=new Person("Andres","Perez","estemanp","1234",24);
        users.add(person1);

        Person person2=new Person("Jessica","Ramirez","jessica","1234",16);
        users.add(person2);

        Person person3=new Person("Angela","Gallego","angela","9876",20);
        users.add(person3);
    }

    private void fillAirlines(){
        Airline avianca=new Airline("Avianca",100000);
        Airline lan=new Airline("Lan", 80000);
        Airline vivaColombia=new Airline("VivaColombia",40000);
        getAirlines().add(avianca);
        getAirlines().add(lan);
        getAirlines().add(vivaColombia);
    }

    private void fillChairs(){
        Chair chair=new Chair("A1",Kind.BUSSINES);
        Chair chair2=new Chair("A2",Kind.BUSSINES);
        Chair chair3=new Chair("A3",Kind.BUSSINES);

        Chair chair4=new Chair("B1",Kind.ECONOMY);
        Chair chair5=new Chair("B2",Kind.ECONOMY);
        Chair chair6=new Chair("B3",Kind.ECONOMY);

        chairs.add(chair);
        chairs.add(chair2);
        chairs.add(chair3);
        chairs.add(chair4);
        chairs.add(chair5);
        chairs.add(chair6);
    }

    private void fillCitiesAndJourneys(){
        City bogota=new City(1,"Bogota",20000);
        City medellin=new City(2,"Medellin",20000);
        City panama=new City(3,"Panama",40000);
        City aires=new City(4,"Buenos Aires",40000);
        City paris=new City(5,"Paris",1000000);

        getCities().add(bogota);
        getCities().add(medellin);
        getCities().add(panama);
        getCities().add(aires);
        getCities().add(paris);

        Journey journey1=new Journey(bogota,medellin);
        Journey journey2=new Journey(medellin,bogota);
        Journey journey3=new Journey(medellin,panama);
        Journey journey4=new Journey(medellin,aires);
        Journey journey5=new Journey(aires,panama);
        Journey journey6=new Journey(aires,bogota);
        Journey journey7=new Journey(bogota,paris);
        Journey journey8=new Journey(panama,medellin);
        Journey journey9=new Journey(panama,bogota);


        journeys.add(journey1);
        journeys.add(journey2);
        journeys.add(journey3);
        journeys.add(journey4);
        journeys.add(journey5);
        journeys.add(journey6);
        journeys.add(journey7);
        journeys.add(journey8);
        journeys.add(journey9);
    }

    private void  fillFlights(){
        Flight flight1=new Flight(1, getAirlines().get(0),"29/04/2016","08:00",journeys.get(0),chairs,"disponible");
        Flight flight2=new Flight(2, getAirlines().get(0),"29/04/2016","08:00",journeys.get(3),chairs,"disponible");
        Flight flight3=new Flight(3, getAirlines().get(1),"30/04/2016","10:00",journeys.get(4),chairs,"disponible");
        Flight flight4=new Flight(4, getAirlines().get(2),"01/05/2016","08:00",journeys.get(1),chairs,"disponible");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
    }

    public boolean isValidUser(String username, String password){
        Boolean resp=false;
        for (Person person:users) {
            if(username.equals(person.getUserName())){
                if(password.equals(person.getPassword())){
                    resp=true;
                }
            }
        }
        return resp;
    }

    public boolean addPerson(Person person){
        if(!isValidUser(person.getUserName(),person.getPassword())){
            users.add(person);
            return true;
        }
        return false;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
