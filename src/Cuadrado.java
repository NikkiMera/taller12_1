public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }
}