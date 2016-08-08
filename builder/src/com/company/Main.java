package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Beer beer01 = new Beer.Builder().name("Rowing Jack").style("AIPA").build();
        System.out.println(beer01.toString());
    }
}
