package pl.zzpj2020.solid.lsp.shape;

public class Disk implements Shape{
    private double radius;

    public Disk(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculetePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius ( double radius){
        this.radius = radius;
    }
}
