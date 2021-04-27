package com.example.demo.Place;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Place {
    private String Name;
    private String Address;
    private boolean Open;
    private JsonNode Details;
    Map<String, Object> Others = new LinkedHashMap<>();

    @JsonAnySetter
    void setDetail(String key, Object value){
        Others.put(key, value);
    }
    public Place()
    {

    }

    public Place(String name, String address, boolean open, JsonNode details)
    {
        this.Name = name;
        this.Address = address;
        this.Open = open;
        this.Details = details;
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

    public JsonNode getDetails()
    {
        return Details;
    }
    public String getData(){
        return Others.get("data").toString();
    }
}
