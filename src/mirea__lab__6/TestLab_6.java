package mirea__lab__6;
import java.util.*;

public class TestLab_6 {
    public static void main(String[] args) {

        // Plate class test
        Plate plate = new Plate(4);
        System.out.println(plate);
        plate.set_contained("Обед");
        System.out.println(plate);

        // Teapot class test
        Teapot teapot = new Teapot("black", "plastic", "tea", 2);
        System.out.println(teapot);
        teapot.pour();
        System.out.println(teapot);
        teapot.pour_out();
        System.out.println(teapot);

        // Hound class test
        Hound hound = new Hound("Bobik", 6);
        System.out.println(hound);

        // Furniture and FurnitureShop classes test
        Wardrobe wardrobe = new Wardrobe("plastic", "white");
        System.out.println(wardrobe);
        wardrobe.set_contained("skeleton");
        System.out.println(wardrobe);

        Table table = new Table("wood", "black", "dinner");

        FurnitureShop furniture_shop = new FurnitureShop();
        furniture_shop.add_furniture(wardrobe);
        furniture_shop.add_furniture(table);
        System.out.println(furniture_shop);
    }
}
