package mirea__lab__9;


interface Priceable {
    String getPrice();
}

// Класс, описывающий планету
class Coffee implements Priceable {
    private String price;

    public Coffee(String price) {
        this.price = price;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

// Класс, описывающий машину
class Tea implements Priceable {
    private String price;

    public Tea(String price) {
        this.price = price;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

class Main_2 {
    public static void main(String[] args) {
        // Создаем объекты планеты и машины
        Coffee capuchino = new Coffee("250");
        Tea green = new Tea("120");

        // Используем интерфейс Nameable для получения и вывода имени объектов
        System.out.println("Price of the coffee: " + capuchino.getPrice());
        System.out.println("Price of the tea: " + green.getPrice());
    }
}
