/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class LiteracyRecord {
    private String gender;
    private String country;
    private String year;
    private double literacyRate;

    public LiteracyRecord(String gender, String country, String year, double literacyRate) {
        this.gender = gender.replace(" (%)", "");
        this.country = country;
        this.year = year;
        this.literacyRate = literacyRate;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getYear() {
        return year;
    }

    public double getLiteracyRate() {
        return this.literacyRate;
    }
}
