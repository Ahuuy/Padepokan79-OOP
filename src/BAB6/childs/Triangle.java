package BAB6.childs;

import BAB6.parents.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {

    }

    public Triangle(double base, double height, String color) {
        setColor(color);
        this.base = base;
        this.height = height;
    }

    //override dan implementasi abstrac getArea
    @Override
    public double getArea() {
        double area = 0.5 * base * height;
        return area;
    }
}
