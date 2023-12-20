package mirea__lab__4;

public class Circle {
        private float radius;
        private String color;
        public Circle(float r, String c) {
            radius = r;
            color = c;
        }
        public Circle(){
            radius = 0;
            color = "White";
        }
        public float getRadius() {
            return radius;
        }
        public String getColor() {
            return color;
        }
        public void setRadius(float r) {
            this.radius = r;
        }
        public void setColor(String c) {
            this.color = c;
        }

}
