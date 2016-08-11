package com.company.builder;

import com.company.builder.entities.Beer;

/**
 * Created by dominik on 08.08.16.
 *
 * Classic builder - builder
 *
 */
public interface BeerBuilder {

    public void buildBeerStyle();

    public void buildTaste();

    public Beer getBeer();

}
