package com.example.demo.Models.Meta;

public class Meta {
    private String Count;
    private String Next;

    public Meta()
    {
    }

    public Meta(String count, String next)
    {
        this.Count = count;
        this.Next = next;
    }

    public void setCount(String count)
    {
        this.Count = count;
    }
    public void setNext(String next)
    {
        this.Next = next;
    }
}


