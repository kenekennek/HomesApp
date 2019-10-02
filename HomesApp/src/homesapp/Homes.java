/*
 * Jake Horner and Ken Dolan
 * 5/10/2018
 * Homes.java
 */
package homesapp;

import java.io.Serializable;

/**
 *
 * @author x16312261
 */
public class Homes implements Serializable{
    protected double annIncome;
    protected String name;
    protected String dob;
    protected String hStat;

    public Homes() {
        annIncome = 0.0;
        name = "";
        dob = "";
        hStat = "";
    }

    public Homes(double annIncome, String name, String dob, String hStat) {
        this.annIncome = annIncome;
        this.name = name;
        this.dob = dob;
        this.hStat = hStat;
    }

    public double getAnnIncome() {
        return annIncome;
    }

    public void setAnnIncome(double annIncome) {
        this.annIncome = annIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String gethStat() {
        return hStat;
    }

    public void sethStat(String hStat) {
        this.hStat = hStat;
    }
    
    public String printDetails(){
        return "Person Details: "+name+", "+dob+", "+annIncome;
    }
}
