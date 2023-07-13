import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al programa de cálculo de figuras geométricas!");

        System.out.println("Seleccione una figura:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");

        int opcionFigura = scanner.nextInt();

        FiguraGeometrica figura = null;

        switch (opcionFigura) {
            case 1:
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                figura = new Triangulo(base, altura);
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                figura = new Cuadrado(lado);
                break;
            case 3:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(radio);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        if (figura != null) {
            System.out.println("Seleccione el cálculo a realizar:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");

            int opcionCalculo = scanner.nextInt();

            switch (opcionCalculo) {
                case 1:
                    figura.calcularArea();
                    break;
                case 2:
                    figura.calcularPerimetro();
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        scanner.close();
    }
}