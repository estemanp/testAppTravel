package com.estemanp.apptravel.Domain;

/**
 * Created by estemanp on 26/04/16.
 */
public class Chair {
    private String name;
    private Kind kind;

    public Chair(String name, Kind kind){
        this.name=name;
        this.kind=kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public int getPrice(){
        if(kind.equals(Kind.BUSSINES)){
            return 30000;
        }else{
            return 15000;
        }
    }
}
