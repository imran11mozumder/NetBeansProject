/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Shape shape = new Rectangle(3.0, 10.0);
        double area = shape.getArea();
        System.out.println("The area of the rectangle is " + area);
    }

}
