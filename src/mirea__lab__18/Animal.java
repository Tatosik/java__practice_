package mirea__lab__18;

import java.io.Serializable;

public interface Animal {
    // Метод для издания звука, характерного для животного
    void makeSound();

    // Метод для получения названия вида животного
    String getSpecies();

    // Метод для получения информации о возрасте животного
    int getAge();

    // Метод для установки возраста животного
    void setAge(int age);

}

class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Type of T: " + t.getClass().getName());
        System.out.println("Type of V: " + v.getClass().getName());
        System.out.println("Type of K: " + k.getClass().getName());
    }
}

