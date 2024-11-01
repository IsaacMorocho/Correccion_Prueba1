import FigurasRegulares.Circulo;
import FigurasRegulares.Cuadrado;
import FigurasRegulares.Triangulo;
import FigurasRegulares.Rectangulo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear de objetos vacios
        Cuadrado cuad = new Cuadrado();
        Rectangulo rect = new Rectangulo();
        Circulo circ = new Circulo();
        Triangulo trian = new Triangulo();

        // Peticion al usuario de los atributos del cuadrado
        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();
        cuad.setLado(lado);
        cuad.mostrarCuadrado();

        // Peticion al usuario de los atributos del rectangulo
        System.out.println("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();
        rect.setBase(base);
        rect.setAltura(altura);
        rect.mostrarRectangulo();

        // Peticion al usuario de los atributos del circulo
        System.out.println("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        circ.setRadio(radio);
        circ.mostrarCirculo();

        // Peticion al usuario de los atributos del triangulo
        System.out.println("Ingrese la base del triangulo: ");
        double base1 = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        double altura1 = sc.nextDouble();
        System.out.println("Ingrese el lado del triangulo: ");
        double lado1 = sc.nextDouble();
        trian.setLado(lado1);
        trian.setBase(base1);
        trian.setAltura(altura1);
        trian.mostrarTriangulo();

        // Mostrar sumatoria de las 4 areas
        double sumatoria = cuad.area()+rect.area()+circ.area()+trian.area1();
        System.out.println("La suma de las 4 areas es: "+sumatoria);
        sc.close();
    }
}