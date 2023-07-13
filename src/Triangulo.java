public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = base + (2 * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2)));
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }
}

