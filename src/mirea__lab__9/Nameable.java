package mirea__lab__9;


// Интерфейс Nameable
interface Nameable {
    String getName();
}

// Класс, описывающий планету
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Класс, описывающий машину
class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Main_1 {
    public static void main(String[] args) {
        // Создаем объекты планеты и машины
        Planet earth = new Planet("Earth");
        Car ferrari = new Car("Ferrari");

        // Используем интерфейс Nameable для получения и вывода имени объектов
        System.out.println("Name of the planet: " + earth.getName());
        System.out.println("Name of the car: " + ferrari.getName());
    }
}

