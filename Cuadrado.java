package FigurasRegulares;

public class Cuadrado{
    private double lado;
    //Constructor con atributos
    public Cuadrado(int lado){
        this.lado = lado;
    }

    //Constructor vacio
    public Cuadrado(){

    }
    //Getter
    public double getLado(){
        return lado;
    }
    //Setter
    public void setLado(double lado){
        this.lado = lado;
    }

    //Area
    public double area(){
        return lado*lado;
    }
    //Perimetro
    public double perimetro(){
        return 4*lado;
    }
     //Metodo Personalizado
    public void mostrarCuadrado() {
        System.out.println("Lado del cuadrado: " + getLado());
        System.out.println("El area del cuadrado es: " + area());
        System.out.println("El perimetro del cuadrado es: " + perimetro());
    }
}
