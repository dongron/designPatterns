package com.company;

import com.company.builder.BeerBuilder;
import com.company.builder.BeerDirector;
import com.company.builder.RowingJackBuilder;
import com.company.builder.entities.Beer;

public class Main {

    public static void main(String[] args) {
	    // Fluent Builder DP
        BeerModern beer01 = new BeerModern.Builder().name("Rowing Jack").style("AIPA").ibu(120).build();
        System.out.println(beer01.toString());

        // Builder DP
        BeerBuilder rowingJackBuilder = new RowingJackBuilder();
        BeerDirector beerDirector = new BeerDirector(rowingJackBuilder);
        beerDirector.makeBeer();

        Beer madeBeer = beerDirector.getBeer();
        System.out.println(madeBeer);

    }
}
