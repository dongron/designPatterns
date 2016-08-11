package com.company.builder.entities;



/**
 * Created by dominik on 09.08.16.
 */
public class Beer {
    private String name;
    private BeerStyle style;
    private Taste taste;

    public String getName() {
        return name;
    }

    public BeerStyle getStyle() {
        return style;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(BeerStyle style) {
        this.style = style;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", style=" + style +
                ", taste=" + taste +
                '}';
    }
}
