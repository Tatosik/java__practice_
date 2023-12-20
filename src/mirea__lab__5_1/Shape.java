package mirea__lab__5_1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "White";
        this.filled = false;
    }
    public Shape(String c, boolean f){
        this.color = c;
        this.filled = f;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c;
    }
    public boolean isFilled(){
        if (this.filled) {return true;}
        else { return false;}
    }
    public void setFilled(boolean f){
        this.filled = f;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
