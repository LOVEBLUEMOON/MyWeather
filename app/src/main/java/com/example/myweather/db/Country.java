package com.example.myweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {

    private int id;
    private int cityId;
    private String weatherId;
    private String countyName;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public String getWeatherId(){
        return  weatherId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }
}
