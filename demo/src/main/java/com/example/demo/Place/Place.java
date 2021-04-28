package com.example.demo.Place;

import com.example.demo.Models.Data.Data;
import com.example.demo.Models.Meta.Meta;
import com.example.demo.Models.Tags.Tags;

import java.util.List;

public class Place {

    private List<Data> Data;
    private Meta Meta;
    private Tags Tags;

    public Place(){}

    public Place(List<Data> data, Meta meta, Tags tags){
        this.Data = data;
        this.Meta = meta;
        this.Tags = tags;
    }

    public List<Data> getData(){
        return Data;
    }
    public void setData(List<Data> data){ this.Data = data; }

    public Meta getMeta(){
        return Meta;
    }
    public void setMeta(Meta meta){ this.Meta = meta; }

    public Tags getTags(){
        return Tags;
    }
    public void setTags(){}
}
