/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Book implements Comparable<Book> {
    private String name;
    private int age;

    public Book(String name, int age) throws IllegalArgumentException {
        if(age < 0) {
            throw new IllegalArgumentException("Negative age: " + age);
        }
        this.name = name;

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.name + " (recommended for "+this.age+" year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        return this.age - o.age;
    }
    
    
}
