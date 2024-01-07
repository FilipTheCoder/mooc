/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Book {
    
    private String name;
    
    private int numberOfPages;
    
    private int yearOfRelease;
    
    public Book(String name, int numberOfPages, int yearOfRelease) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    @Override
    public String toString() {
        return this.name + ", " + this.numberOfPages + " pages, " + this.yearOfRelease;
    }
    
    
}
