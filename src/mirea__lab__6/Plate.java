package mirea__lab__6;

class Plate extends Dish{
    protected double radius;

    Plate() {
        super.set_сolor("white");
        super.set_material("porcelain");
        this.radius = 1;
        System.out.println("[+] Plate object was created");
    }

    Plate(double radius) {
        super.set_сolor("white");
        super.set_material("porcelain");
        this.radius = radius;
        System.out.println("[+] Plate object was created");
    }

    Plate(double radius, String color, String material, String contains) {
        super.set_сolor(color);
        super.set_material(material);
        super.set_contained(contains);
        this.radius = radius;
        System.out.println("[+] Plate object was created");
    }

    // Radius getter
    double get_radius() {
        return this.radius;
    }

    // Radius setter
    void set_radius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Plate radius setted as: " + this.radius);
        } else {
            System.out.println("Plate radius must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Plate, radius: " + this.radius;
    }
}
