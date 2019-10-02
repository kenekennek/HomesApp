/*
 * Jake Horner and Ken Dolan
 * 5/10/2018
 * Renting.java
 */
package homesapp;

import java.io.Serializable;

/**
 *
 * @author x16312261
 */
public class Renting extends Homes implements Serializable{
    private double rent;

    public Renting() {
        super();
        rent = 0.0;
    }

    public Renting(double rent, double annIncome, String name, String dob, String hStat) {
        super(annIncome, name, dob, hStat);
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
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
    
    
    
}
