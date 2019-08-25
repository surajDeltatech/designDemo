package com.notebook.surajkadel.com.designpractise.Model;

public class RecyclerDetail {
    private String place, time, travels, description, bustype,previousrate,newrate;

    public RecyclerDetail(){}

    public RecyclerDetail(String place, String time, String travels, String description, String bustype, String previousrate, String newrate) {
        this.place = place;
        this.time = time;
        this.travels = travels;
        this.description = description;
        this.bustype = bustype;
        this.previousrate = previousrate;
        this.newrate = newrate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTravels() {
        return travels;
    }

    public void setTravels(String travels) {
        this.travels = travels;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getPreviousrate() {
        return previousrate;
    }

    public void setPreviousrate(String previousrate) {
        this.previousrate = previousrate;
    }

    public String getNewrate() {
        return newrate;
    }

    public void setNewrate(String newrate) {
        this.newrate = newrate;
    }
}
