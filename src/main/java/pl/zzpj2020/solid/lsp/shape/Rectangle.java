package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape{
    double a;
    double b;

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double circuid() {
        return 2*a+2*b;
    }
}
