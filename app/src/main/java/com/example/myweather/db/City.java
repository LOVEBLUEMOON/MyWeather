package com.example.myweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;
    private int cityCode;
    private int provinceId;
    private String cityName;

    public int getId(){
        return id;
    }

    public String getCityName(){
        return cityName;
    }

    public  void setCityName(String cityName){
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getCityCode(){
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}