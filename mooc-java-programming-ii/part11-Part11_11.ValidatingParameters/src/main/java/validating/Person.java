package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid parameter name, name must be below 40 characters, cannot be empty and null");
        }
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid parameter age, age must be between 0 and 120");
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
}
