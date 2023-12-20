package mirea__lab__5_1;

class Circle extends Shape{
    protected double radius;

    public Circle(){
        this.radius = 0;
        this.color = "White";
        this.filled = false;
    }
    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r, String c, boolean f){
        this.radius = r;
        this.color = c;
        this.filled = f;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }

    @Override
    public double getArea(){
        if (this.filled){return this.radius * this.radius * 3.14;}
        else {return 0;}

    }
    @Override
    public double getPerimeter(){
        return this.radius * 2 * 3.14;
    }
    @Override
    public String toString(){
        if (this.filled){return "Радиус круга равен " + this.radius;}
        else {return "Радиус окружности равен " + this.radius;}
    }
}
