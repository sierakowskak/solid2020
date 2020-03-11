package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Shape {
    double radious;

    @Override
    public double area() {
        return radious * radious * Math.PI;
    }

    @Override
    public double circuid() {
        return 2 * Math.PI * radious;
    }
}
