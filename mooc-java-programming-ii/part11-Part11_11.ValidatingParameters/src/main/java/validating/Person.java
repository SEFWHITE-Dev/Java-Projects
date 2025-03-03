package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.isEmpty() || name == null || name.length() > 40) {
            throw new IllegalArgumentException("Name is empty or is null or has over 40 characters");
        }
        if (age < 0 || age > 120 ) {
            throw new IllegalArgumentException("age should be between 0 and 120");
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
