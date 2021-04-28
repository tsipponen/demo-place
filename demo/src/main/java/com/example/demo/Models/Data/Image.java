package com.example.demo.Models.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {
    private String Url;
    @JsonProperty("copyright_holder")
    private String CopyrightHolder;
    @JsonProperty("license_type")
    private LicenseType LicenceType;

    public void setUrl(String url){ this.Url = url; }
    public void setCopyrightHolder(String copyrightHolder){ this.CopyrightHolder = copyrightHolder; }
    public void setLicenceType(LicenseType licenceType){ this.LicenceType = licenceType; }
}
