package com.estemanp.apptravel.Domain;

/**
 * Created by estemanp on 26/04/16.
 */
public class Journey {
    private City originCity;
    private City destinationCity;

    public  Journey(City originCity, City destinationCity){
        this.originCity = originCity;
        this.destinationCity = destinationCity;
    }

    public City getOriginCity() {
        return originCity;
    }

    public void setOriginCity(City originCity) {
        this.originCity = originCity;
    }

    public City getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(City destinationCity) {
        this.destinationCity = destinationCity;
    }
}
