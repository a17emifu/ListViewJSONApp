package com.example.brom.listviewjsonapp;

/**
 * Created by Emiko on 4/12/2018.
 */

public class Mountains {

    private String name;
    private int height;
    private String location;

    public Mountains(String name, int height, String location){
        this.name = name;
        this.height = height;
        this.location = location;
    }

    public String ToastText(){return name + " is part of the " + location + " mountain range and is " + height + " m high."; }
}
