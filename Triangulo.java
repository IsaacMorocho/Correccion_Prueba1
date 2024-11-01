package FigurasRegulares;uloe
public class Triangulo {
    private double base1;
    private double altura1;
    private double lado1;
    //Constructor con atributos
    public Triangulo(int base1, int altura1, double lado1) {
        this.base1 = base1;
        this.altura1 = altura1;
        this.lado1 = lado1;
    }
    //Cnstructor vacio
    public Triangulo() {
    }
    //Getters
    public double getBase1() {
        return base1;
    }
    public double getAltura1() {
        return altura1;
    }  
    public double getLado1() {
        return lado1;
    }   

    //Setters   
    public void setBase1(double base1) {
        this.base1 = base1;
    }
    public void setAltura1(double altura1) {
        this.altura1 = altura1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    //Area
    public double area1(){
        return (base1*altura1)/2;
    }

    //Perimetro
    public double perimetro(){
        return lado1 + lado1 + lado1;
    }
    
    //Metodo Personalizado
    public void mostrarTriangulo(){
        System.out.println("Base del triangulo: " + getBase());
        System.out.println("Altura del triangulo: " + getAltura());
        System.out.println("Lado del triangulo: " + getLado());
        System.out.println("El area del triangulo es: " + area());
        System.out.println("El perimetro del triangulo es: " + perimetro());
    }
}
