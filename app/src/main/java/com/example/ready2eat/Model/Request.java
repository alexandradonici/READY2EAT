package com.example.ready2eat.Model;

import java.util.List;

public class Request {
    private String id;
    private String phone;
    private String name;
    private String hour;
    private String total;
    private List<Order> foods; // list of food order
    private String status;

    public Request(){}

    public Request(String id, String phone, String name, String hour, String total, List<Order> foods) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.hour = hour;
        this.total = total;
        this.foods = foods;
        this.status = "0"; //"0" = Placed; "1" = Delivery; "2" = "Delivered"
    }

    public Request(String phone, String name, String hour, String total, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.hour = hour;
        this.total = total;
        this.foods = foods;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
