
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(!(other instanceof Person)) {
            return false;
        }
        Person otherPerson = (Person) other;
        
        return this.birthday.equals(otherPerson.birthday) && this.height == otherPerson.height && this.weight == otherPerson.weight && this.name.equals(otherPerson.name);
    }
}
