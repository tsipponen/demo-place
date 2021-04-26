package com.example.demo.Place;

public class Place {
    private String Name;
    private String Address;
    private boolean Open;

    public Place()
    {

    }

    public Place(String name, String address, boolean open)
    {
        this.Name = name;
        this.Address = address;
        this.Open = open;
    }

    public String getName()
    {
        return Name;
    }

    public String getAddress()
    {
        return Address;
    }

    public Boolean getOpen()
    {
        return Open;
    }
}
