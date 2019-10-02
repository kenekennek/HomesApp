/*
 * Jake Horner and Ken Dolan
 * 5/10/2018
 * Homeless.java
 */
package homesapp;

import java.io.Serializable;

/**
 *
 * @author x16312261
 */
public class Homeless extends Homes implements Serializable{
    private String whyHomeless;

    public Homeless() {
        super();
        whyHomeless = "";
    }

    public Homeless(String whyHomeless, double annIncome, String name, String dob, String hStat) {
        super(annIncome, name, dob, hStat);
        this.whyHomeless = whyHomeless;
    }

    public String getWhyHomeless() {
        return whyHomeless;
    }

    public void setWhyHomeless(String whyHomeless) {
        this.whyHomeless = whyHomeless;
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
