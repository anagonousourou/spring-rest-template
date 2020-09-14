package com.neurone.axon.models;

import org.springframework.data.annotation.Id;


public class Article {

    private String label;
    private String imageUrl;
    private String type;
    private int prix;

    @Id
    private String id;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public String getLabel() {
        return label;
    }

    public int getPrix() {
        return prix;
    }

    public String getType() {
        return type;
    }
    
}
