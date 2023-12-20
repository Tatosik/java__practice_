package mirea__lab__6;

class Table extends Furniture{
    protected String contains;

    Table() {
        super.set_material("wood");
        super.set_сolor("brown");
        this.contains = "nothing";
        System.out.println("\n[+] Table object was created");
    }

    Table(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = "nothing";
        System.out.println("\n[+] Table object was created");
    }

    Table(String material, String color, String contains) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = contains;
        System.out.println("\n[+] Table object was created");
    }

    // Table contains getter
    public String get_contained() {
        return this.contains;
    }

    // Table contains setter
    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println(this.contains + " on table now");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Table object: on table: " + this.contains;
    }
}
