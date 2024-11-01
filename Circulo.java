package FigurasRegulares;

public class Circulo{
    private double radio;
    private double pi = 3.14;
    //Constructor con atributos
    public Circulo(double radio) {
        this.radio = radio;
    }
    //Constructor vacio
    public Circulo() {

    }
    //Getters
    public double getRadio() {
        return radio;
    }
    public double getPi() {
        return pi;
    }    
    //Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    //Area
    public double area() {
        return pi*radio*radio;
    }
    //Perimetro
    public double perimetro() {
        return 2*pi*radio;
    }
    //Metodo personalizado
    public void mostrarCirculo(){
        System.out.println("Radio del circulo: "+ getRadio());
        System.out.println("El area del circulo es: " + area());
        System.out.println("El perimetro del circulo es: " + perimetro());
    }
}
