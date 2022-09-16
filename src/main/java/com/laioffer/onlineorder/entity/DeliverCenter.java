package com.laioffer.onlineorder.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "center")
public class DeliverCenter implements Serializable {

    private static final long serialVersionUID = 7551999649936522523L;

    @Id
    private int id;

    private String name;

    private String description;

    private String address;

    private float distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}
