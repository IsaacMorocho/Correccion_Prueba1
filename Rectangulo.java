package FigurasRegulares;

public class Rectangulo {
    private double base;
    private double altura;
    //Constructor con atributos
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Constructor vacio
    public Rectangulo() {

    }
    //Getters
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    //Setters    
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Area
    public double area() {
        return base*altura;
    }
    //Perimetro
    public double perimetro() {
        return (2*base)+(2*altura);
    }
    //Metodo Personalizado
    public void mostrarRectangulo(){
        System.out.println("Base del rectangulo: " +getBase());
        System.out.println("Altura del rectangulo: " + getAltura());
        System.out.println("El area del rectangulo es: " + area());
        System.out.println("El perimetros del rectangulo es: " + perimetro());
    }
}
