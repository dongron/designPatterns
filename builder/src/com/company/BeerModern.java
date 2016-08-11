package com.company;

/**
 * Created by dominik on 08.08.16.
 *
 * Builder + Fuent Interface pattern
 *
 */
public class BeerModern {
    private String name;
    private String style;
    private int ibu;

    private BeerModern(Builder builder){
        this.name = builder.name;
        this.style = builder.style;
        this.ibu = builder.ibu;
    };
    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public int getIbu() {
        return ibu;
    }

    @Override
    public String toString() {
        return "BeerModern{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", ibu=" + ibu +
                '}';
    }

    public static class Builder {
        private String name;
        private String style;
        private int ibu;

        public Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder style(String style){
            this.style = style;
            return this;
        }

        public Builder ibu(int ibu){
            this.ibu = ibu;
            return this;
        }

        public BeerModern build() {
            return new BeerModern(this);
        }

    }
}
