package com.example.demo.Models.Data;

import java.util.List;

public class Description {
    private String Intro;
    private String Body;
    private List<Image> Images;

    public void setIntro(String intro)
    {
        this.Intro = intro;
    }
    public void setBody(String body)
    {
        this.Body = body;
    }
    public void setImages(List<Image> images)
    {
        this.Images = images;
    }

}
