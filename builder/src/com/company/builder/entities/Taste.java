package com.company.builder.entities;

/**
 * Created by dominik on 09.08.16.
 */
public class Taste {
    private String bitter;
    private String body;

    public String getBitter() {
        return bitter;
    }

    public String getBody() {
        return body;
    }

    public void setBitter(String bitter) {
        this.bitter = bitter;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Taste{" +
                "bitter='" + bitter + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
