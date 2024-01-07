
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Employees {
    private List<Person> employees = new ArrayList();
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }
    public void print() {
        Iterator<Person> employeeIter = this.employees.iterator();
        while(employeeIter.hasNext()) {
            System.out.println(employeeIter.next());
        }
    }
    public void print(Education education) {
        Iterator<Person> employeeIter = this.employees.iterator();
        while(employeeIter.hasNext()) {
            Person employee = employeeIter.next();
            if(employee.getEducation() == education) {
                System.out.println(employee);
            }
            
        }
    }
    public void fire(Education education) {
        Iterator<Person> employeeIter = this.employees.iterator();
        while(employeeIter.hasNext()) {
            Person employee = employeeIter.next();
            if(employee.getEducation() == education) {
                employeeIter.remove();
            }
        }
    }
}
