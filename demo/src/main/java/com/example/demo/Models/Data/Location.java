package com.example.demo.Models.Data;

public class Location {
    private Double Lat;
    private Double Lon;
    private Address Address;

    public void setLat(Double lat)
    {
        this.Lat = lat;
    }
    public void setLon(Double lon)
    {
        this.Lon = lon;
    }
    public void setAddress(Address address)
    {
        this.Address = address;
    }
}
