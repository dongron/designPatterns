package com.company;

/**
 * Created by dominik on 08.08.16.
 *
 * Builder + Fuent Interface pattern
 *
 */
public class Beer {
    private String name;
    private String style;

    private Beer(Builder builder){
        this.name = builder.name;
        this.style = builder.style;
    };
    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String style;

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
        public Beer build() {
            return new Beer(this);
        }
    }
}
