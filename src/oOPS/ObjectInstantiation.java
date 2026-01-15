package oOPS;

public class ObjectInstantiation {

    String name;
    String breed;
    int age;
    String color;

    // Constructor to initialize the attributes when a new object is created
    public ObjectInstantiation(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Name is: " + name
             + "\nBreed age and color are: "
             + breed + " " + age + " " + color;
    }

    public static void main(String[] args) {
        ObjectInstantiation tuffy = new ObjectInstantiation("tuffy", "papillon", 5, "white");
        System.out.println(tuffy);
    }
}