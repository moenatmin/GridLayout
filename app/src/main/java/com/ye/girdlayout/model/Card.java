package com.ye.girdlayout.model;

/**
 * Created by ye on 6/4/16.
 */
public class Card {
    private String urlImage;
    private String textCard;

    public Card(String urlImage, String textCard) {
        this.urlImage = urlImage;
        this.textCard = textCard;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getTextCard() {
        return textCard;
    }
}
