package com.example.demo.Models.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    @JsonProperty("street_address")
    private String StreetAddress;
    @JsonProperty("postal_code")
    private String PostalCode;
    private String Locality;

    public void setStreetAddress(String streetAddress)
    {
        this.StreetAddress = streetAddress;
    }
    public void setPostalCode(String postalCode)
    {
        this.PostalCode = postalCode;
    }
    public void setLocality(String locality)
    {
        this.Locality = locality;
    }
}
