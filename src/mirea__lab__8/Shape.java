package mirea__lab__8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape() {
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        this.x = rand.nextInt(400);
        this.y = rand.nextInt(400);
    }

    public abstract void draw(Graphics g);
}

class RectangleShape extends Shape {
    private int width, height;

    public RectangleShape() {
        super();
        Random rand = new Random();
        this.width = rand.nextInt(100);
        this.height = rand.nextInt(100);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class CircleShape extends Shape {
    private int radius;

    public CircleShape() {
        super();
        Random rand = new Random();
        this.radius = rand.nextInt(50); // Maximum radius
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}

class DrawingPanel extends JPanel {
    private Shape[] shapes;

    public DrawingPanel(int numShapes) {
        shapes = new Shape[numShapes];
        for (int i = 0; i < numShapes; i++) {
            if (i % 2 == 0) {
                shapes[i] = new RectangleShape();
            } else {
                shapes[i] = new CircleShape();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        // Создание окна с фигурами
        JFrame frame1 = new JFrame("Random Shapes");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(600, 600);
        frame1.add(new DrawingPanel(20));
        frame1.setVisible(true);

    }
}

