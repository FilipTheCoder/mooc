
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Room {
    
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList();
        
    }
    
    public void add(Person person) {
        people.add(person);
    }
    public boolean isEmpty() {
        return people.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    public Person shortest() {
        if(this.isEmpty()) {
            return null;
        }
        Person shortest = people.get(0);
        
        for(Person person : people) {
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
            
        }
        return shortest;
    }
    public Person take() {
        Person shortest = this.shortest();
        if(shortest == null) {
            return null;
        }
        
        people.remove(shortest);
        return shortest;
        
    }
    
}
