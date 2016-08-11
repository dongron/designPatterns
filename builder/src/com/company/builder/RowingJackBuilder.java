package com.company.builder;

import com.company.builder.entities.Beer;
import com.company.builder.entities.BeerStyle;
import com.company.builder.entities.Taste;

/**
 * Created by dominik on 09.08.16.
 */
public class RowingJackBuilder implements BeerBuilder {
    private Beer beer;

    public RowingJackBuilder() {
        this.beer = new Beer();
        beer.setName("Rowing Jack");
    }

    @Override
    public void buildBeerStyle() {
        BeerStyle beerStyle = new BeerStyle();
        beerStyle.setName("AIPA");
        beerStyle.setIbu(120);
        beerStyle.setColor("Amber");
        beer.setStyle(beerStyle);
    }

    @Override
    public void buildTaste() {
        Taste taste = new Taste();
        taste.setBitter("middle-hight");
        taste.setBody("middle sweet");
        beer.setTaste(taste);
    }

    @Override
    public Beer getBeer() {
        return beer;
    }
}
