package com.company.builder.entities;

/**
 * Created by dominik on 09.08.16.
 */
public class BeerStyle {
    private String name;
    private int ibu;
    private String color;

    public String getName() {
        return name;
    }

    public int getIbu() {
        return ibu;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIbu(int ibu) {
        this.ibu = ibu;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "BeerStyle{" +
                "name='" + name + '\'' +
                ", ibu=" + ibu +
                ", color='" + color + '\'' +
                '}';
    }
}
