package mirea__lab__6;

class Teapot extends Dish{
    protected double volume;

    Teapot() {
        super.set_сolor("white");
        super.set_material("porcelain");
        super.set_contained("tea");
        this.volume = 0.0;
        System.out.println("[+] Teapot object was created");
    }

    Teapot(String color, String material, String contains, double volume) {
        super.set_сolor(color);
        super.set_material(material);
        super.set_contained(contains);
        this.volume = volume;
        System.out.println("[+] Teapot object was created");
    }

    void pour() {
        this.volume -= 0.2;
        System.out.println("Teapot poured one cup of " + super.get_contained());
    }

    void pour_out() {
        this.volume = 0.0;
        System.out.println("Teapot poured out all " + super.get_contained());
        super.set_contained("nothing");
    }

    // Radius getter
    double get_volume() {
        return this.volume;
    }

    // Radius setter
    void set_volume(double volume) {
        if (volume > 0 && volume < 10) {
            this.volume = volume;
            System.out.println("Teapot volume setted as: " + this.volume);
        } else {
            System.out.println("Teapot volume must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Teapot, volume: " + this.volume;
    }
}
