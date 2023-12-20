package mirea__lab__21;

public class QueueTest {
    public static void main(String[] args) {
        // Тесты для класса ArrayQueue
        ArrayQueue queue = new ArrayQueue();

        // Тест enqueue и element
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.element()); // Ожидаемый результат: 1

        // Тест dequeue
        System.out.println(queue.dequeue()); // Ожидаемый результат: 1
        System.out.println(queue.dequeue()); // Ожидаемый результат: 2

        // Тест size и isEmpty
        System.out.println(queue.size()); // Ожидаемый результат: 1
        System.out.println(queue.isEmpty()); // Ожидаемый результат: false

        // Тест clear и isEmpty
        queue.clear();
        System.out.println(queue.isEmpty()); // Ожидаемый результат: true

    }
}
