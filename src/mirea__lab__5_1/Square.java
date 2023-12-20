package mirea__lab__5_1;

class Square extends Rectangle{
    public Square(){
        this.width = 0;
        this.length = 0;
        this.color = "White";
        this.filled = false;
    }
    public Square(double side){
        this.width = side;
        this.length = side;
        this.color = "White";
        this.filled = false;
    }
    public Square(double side, String c, boolean f){
        this.width = side;
        this.length = side;
        this.color = c;
        this.filled = f;
    }

    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.length = side;
    }
    public void setWidth(double w){}
    public void setLength(double l){}
    public String toString(){
        if (this.filled){return "Длина четырёхугольника равна " + this.width + ", ширина равна " + this.length;}
        else {return "Длина квадрата равна " + this.width + ", ширина равна " + this.length;}
    }
}
