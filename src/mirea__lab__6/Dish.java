package mirea__lab__6;

abstract class Dish {
    protected String material;
    protected String color;
    protected String contains;

    Dish() {
        this.material = "unsetted";
        this.color = "unsetted";
        this.contains = "nothing";
        System.out.println("\n[+] Dish abstract object was created");
    }

    Dish(String material, String color, String contains) {
        this.material = material;
        this.color = color;
        this.contains = contains;
        System.out.println("\n[+] Dish abstract object was created");
    }

    // Dish material getter
    public String get_material() {
        return this.material;
    }

    // Dish material setter
    public void set_material(String material) {
        this.material = material;
    }

    // Dish color getter
    public String get_сolor() {
        return this.color;
    }

    // Dish color setter
    public void set_сolor(String color) {
        this.color = color;
    }

    // Dish contains getter
    public String get_contained() {
        return this.contains;
    }

    // Dish contains setter
    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println("Dish contains now: " + this.contains);
    }

    public String toString() {
        return "Dish object: material: " + this.material + ", color: " + this.color + ", contains: " + this.contains;
    }
}
