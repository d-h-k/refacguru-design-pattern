package prototype_persudo;

public class Circle extends Shape{
    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    private int radius;

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }




    //getter, setter, toString
    //===========================================================


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
