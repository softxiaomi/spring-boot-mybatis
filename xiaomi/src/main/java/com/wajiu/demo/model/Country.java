package com.wajiu.demo.model;
public class Country extends BaseModel {
   
    private String countryname;
  
    private String countrycode;
   
    public String getCountryname() {
        return countryname;
    }
   
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
    public String getCountrycode() {
        return countrycode;
    }
   
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
