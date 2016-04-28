package com.estemanp.apptravel.Domain;

/**
 * Created by estemanp on 26/04/16.
 */
public enum Kind {
    ECONOMY ("Economica", 1),
    BUSSINES ("Ejecutiva", 2);

    private final String name;
    private final int id;

    Kind (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }
}
