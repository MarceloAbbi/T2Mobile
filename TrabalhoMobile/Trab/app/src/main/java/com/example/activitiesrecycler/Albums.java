package com.example.activitiesrecycler;

public class Albums
{
    private String title;
    private String id;

    public Albums(String title, String body)
    {
        this.title = title;
        this.id = body;
    }

    public String getTitle()
    {
        return title;
    }

    public String getBody()
    {
        return id;
    }
}

