package mirea__lab__6;

abstract class Dog {
    private String name;
    private int age;

    Dog() {
        this.name = "unsetted";
        this.age = 1;
        System.out.println("\n[+] Dog object with name: " + this.name + " was created");
    }
    // Init
    Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("\n[+] Dog object with name: " + this.name + " was created");
    }

    // Age setter
    public void set_age(int age) {
        if (age > 0 && age < 31) {
            this.age = age;
            System.out.println("Dog age setted as: " + this.age);
        }
    }

    // Age getter
    public int get_age() {
        return this.age;
    }

    // Name setter
    public void set_name(String name) {
        this.name = name;
        System.out.println("Dog name setted as: " + this.name);
    }

    // Name getter
    public String get_name() {
        return this.name;
    }

    // Dog age as human age getter
    public int get_human_age() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog " + this.name + " with age " + this.age;
    }
}
