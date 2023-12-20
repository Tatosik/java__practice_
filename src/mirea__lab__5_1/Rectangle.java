package mirea__lab__5_1;

class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.width = 0;
        this.length = 0;
        this.color = "White";
        this.filled = false;
    }
    public Rectangle(double w, double l){
        this.width = w;
        this.length = l;
    }
    public Rectangle(double w, double l, String c, boolean f){
        this.width = w;
        this.length = l;
        this.color = c;
        this.filled = f;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        this.width = w;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double l){
        this.length = l;
    }

    @Override
    public double getArea(){
        if (this.filled){return this.width * this.length;}
        else {return 0;}

    }
    @Override
    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }
    @Override
    public String toString(){
        if (this.filled){return "Длина четырёхугольника равна " + this.width + ", ширина равна " + this.length;}
        else {return "Длина прямоугольника равна " + this.width + ", ширина равна " + this.length;}
    }
}
