package me.dratii.data.schema;

import com.google.gson.annotations.Expose;

public class Data {
    @Expose
    public String owner;
    @Expose
    public String status;
    @Expose
    public String number;
    @Expose
    public Carriers carrier;
    @Expose
    public boolean finished;

    public Data(String owner, String status, String number, Carriers carrier,boolean finished) {
        this.carrier = carrier;
        this.number = number;
        this.owner = owner;
        this.status = status;
        this.finished = finished;
    }
}