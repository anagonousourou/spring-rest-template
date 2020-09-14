package com.neurone.axon.models;

import org.springframework.data.annotation.Id;


public class Commande {

    private String articleId;
    private String quantite;
    @Id
    private String id;

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }


    public String getArticleId() {
        return articleId;
    }

    public String getQuantite() {
        return quantite;
    }
    
    
}
