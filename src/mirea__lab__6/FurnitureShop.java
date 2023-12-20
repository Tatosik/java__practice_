package mirea__lab__6;
import java.util.*;
class FurnitureShop {
    private List<Furniture> furniture_shop_array = new ArrayList<Furniture>();

    {
        System.out.println("\n[+] Furniture shop object was created");
    }

    // Add one Furniture
    public void add_furniture(Furniture furniture) {
        this.furniture_shop_array.add(furniture);
        System.out.println(furniture + ". This furniture added into the furniture shop successfully");
    }

    // Add many Furnitures
    public void add_furnitures(Furniture furniture_array[]) {
        this.furniture_shop_array.addAll(new ArrayList<Furniture>(Arrays.asList(furniture_array)));
        System.out.println("Furnitures: " + Arrays.toString(furniture_array) + " added into the furniture shop successfully");
    }

    public String toString() {
        if (!this.furniture_shop_array.isEmpty())
            return "Furniture shop: " + this.furniture_shop_array;
        else
            return "Furniture shop empty!";
    }
}
