package br.com.reebrando.undergoundapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 26/06/2017.
 */

public class Line {

    @SerializedName("cor")
    private String color;

    @SerializedName("numero")
    private int number;

    @SerializedName("urlImagem")
    private String urlImage;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
