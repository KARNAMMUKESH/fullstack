package com.birthdayevent.nanthags.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Addons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String addon_name;
    private String image_url;
    private int cost;
    private String description;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddon_name() {
        return addon_name;
    }
    public void setAddon_name(String addon_name) {
        this.addon_name = addon_name;
    }
    public String getImage_url() {
        return image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }      

}
