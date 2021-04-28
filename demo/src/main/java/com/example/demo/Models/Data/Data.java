package com.example.demo.Models.Data;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {
    private String Id;
    private Name Name;
    @JsonProperty ("source_type")
    private SourceType SourceType;
    @JsonProperty ("info_url")
    private String InfoUrl;
    @JsonProperty ("modified_at")
    private String ModifiedAt;
    private Location Location;
    private Description Description;
    private List<Tag> Tags;
    @JsonProperty ("opening_hours")
    private OpeningHours OpeningHours;
    @JsonProperty ("openinghours_exception")
    private String OpeningHoursException;

    public Data(){

    }
    public void setId(String id)
    {
        this.Id = id;
    }
    public void setName(Name name)
    {
        this.Name = name;
    }
    public void setSourceType(SourceType source_Type)
    {
        this.SourceType = source_Type;
    }
    public void setInfoUrl(String infoUrl)
    {
        this.InfoUrl = infoUrl;
    }
    public void setModifiedAt(String modifiedAt){ this.ModifiedAt = modifiedAt; }
    public void setLocation(Location location){ this.Location = location; }
    public void setDescription(Description description){ this.Description = description; }
    public void setTags(List<Tag> tags){ this.Tags = tags; }
    public void setOpeningHours(OpeningHours openingHours){ this.OpeningHours = openingHours; }
    public void setOpeningHoursException(String hoursException){ this.OpeningHoursException = hoursException; }
}
