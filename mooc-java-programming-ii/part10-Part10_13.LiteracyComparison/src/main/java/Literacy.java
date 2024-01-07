/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Literacy implements Comparable<Literacy> {
    private String sex;
    private String country;
    private int year;
    protected double literacyPercent;

    public Literacy(String sex, String country, int year, double literacyPercent) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
    public static Literacy parseLine(String line) {
        //Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513
        String[] tokens = line.split(",");
        String sex = tokens[2].replace(" (%)", "").trim();
        String country = tokens[3];
        int year = Integer.valueOf(tokens[4]);
        double p = Double.valueOf(tokens[5]);
        return new Literacy(sex, country, year, p);
        
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
    }

    @Override
    public int compareTo(Literacy other) {
        
        if(this.literacyPercent < other.literacyPercent) {
            return -1;
        } else if(this.literacyPercent == other.literacyPercent) {
            return 0;
            
        } else {
            return 1;
        }
        
    }
}
