package com.example.td4;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Previsions implements Serializable {
    private List<Prevision> list;
    private City city;

    public Previsions(List<Prevision> list, City city) {
        this.list = list;
        this.city = city;
    }

    public List<Prevision> getList() {
        return list;
    }

    public void setList(List<Prevision> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public ArrayList<Prevision> getPrevisionsArrayList(){
        ArrayList<Prevision> previsionList = new ArrayList<>();
        for(Prevision prevision : this.list){
            Prevision w = new Prevision(prevision.getDt(),prevision.getMain(), prevision.getWeather(), prevision.getClouds(), prevision.getWind(), prevision.getSys(), prevision.getDt_txt());
            previsionList.add(w);
        }
        return previsionList;
    }
}
