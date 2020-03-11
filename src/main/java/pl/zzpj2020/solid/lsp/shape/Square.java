package pl.zzpj2020.solid.lsp.shape;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculetePerimeter() {
        return 4 * side;
    }
}
