package com.company.model;

import com.opencsv.bean.CsvBindByName;

public class Computer {

    @CsvBindByName(column = "Country")
    private String country;

    @CsvBindByName(column = "Timescale")
    private String timescale;

    @CsvBindByName(column = "Vendor")
    private String vendor;

    @CsvBindByName(column = "Units")
    private double units;

    private double share;

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTimescale() {
        return timescale;
    }

    public void setTimescale(String timescale) {
        this.timescale = timescale;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "country='" + country + '\'' +
                ", timescale='" + timescale + '\'' +
                ", vendor='" + vendor + '\'' +
                ", units=" + units +
                ", share=" + share +
                '}';
    }
}
