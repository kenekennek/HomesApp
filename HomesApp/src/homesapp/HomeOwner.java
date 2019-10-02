/*
 * Jake Horner and Ken Dolan
 * 5/10/2018
 * HomeOwner.java
 */
package homesapp;

import java.io.Serializable;

/**
 *
 * @author x16312261
 */
public class HomeOwner extends Homes implements Serializable{
    private int pplInHouse;
    private String mStat;

    public HomeOwner() {
        super();
        pplInHouse = 0;
        mStat = "";
    }

    public HomeOwner(int pplInHouse, String mStat, double annIncome, String name, String dob, String hStat) {
        super(annIncome, name, dob, hStat);
        this.pplInHouse = pplInHouse;
        this.mStat = mStat;
    }

    public int getPplInHouse() {
        return pplInHouse;
    }

    public void setPplInHouse(int pplInHouse) {
        this.pplInHouse = pplInHouse;
    }
    
    public String getmStat() {
        return mStat;
    }

    public void setmStat(String mStat) {
        this.mStat = mStat;
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
    
    @Override
    public String printDetails(){
        return super.printDetails()+", "+pplInHouse;
    }
    
}
