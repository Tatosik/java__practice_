package mirea__lab__6;

class Wardrobe extends Furniture{
    protected String contains;

    Wardrobe() {
        super.set_material("wood");
        super.set_сolor("brown");
        this.contains = "nothing";
        System.out.println("\n[+] Wardrobe object was created");
    }

    Wardrobe(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = "nothing";
        System.out.println("\n[+] Wardrobe object was created");
    }

    Wardrobe(String material, String color, String contains) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = contains;
        System.out.println("\n[+] Wardrobe object was created");
    }

    // Wardrobe contains getter
    public String get_contained() {
        return this.contains;
    }

    // Wardrobe contains setter
    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println("Wardrobe contains now: " + this.contains);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Wardrobe object: contains: " + this.contains;
    }
}
