package com.company.builder;

import com.company.builder.entities.Beer;

/**
 * Created by dominik on 09.08.16.
 */
public class BeerDirector {
    private BeerBuilder beerBuilder;

    public BeerDirector(BeerBuilder beerBuilder) {
        this.beerBuilder = beerBuilder;
    }

    public void makeBeer() {
        beerBuilder.buildBeerStyle();
        beerBuilder.buildTaste();
    }
    public Beer getBeer() {
        return this.beerBuilder.getBeer();
    }

}
