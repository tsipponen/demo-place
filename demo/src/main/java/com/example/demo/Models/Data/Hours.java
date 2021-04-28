package com.example.demo.Models.Data;

public class Hours {
    private int WeekdayId;
    private String Opens;
    private String Closes;
    private Boolean Open24h;

    public void setWeekdayId(int weekdayId){ this.WeekdayId = weekdayId; }
    public void setOpens(String opens){ this.Opens = opens; }
    public void setCloses(String closes){ this.Closes = closes; }
    public void setOpen24h(Boolean open24h){ this.Open24h = open24h; }
}
