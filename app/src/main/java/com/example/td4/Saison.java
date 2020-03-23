package com.example.td4;

import java.io.Serializable;

class Saison implements Serializable {
    private String saison;

    public Saison(String saison) {
        this.saison = saison;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    @Override
    public String toString() {
        return saison;
    }
}
