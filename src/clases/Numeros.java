package clases;

public class Numeros {
    
    public static double suma(double a, double b){
        return a + b;
    }
    
    public static double resta(double a, double b){
        return a - b;
    }
    
    public static double multiplica(double a, double b){
        return a * b;
    }
    
    public double divide(double a, double b){
        return a/b;
    }
    
    public double absoluto(double a){
        return Math.abs(a);
    }
    
    public static double negativo(double a){
        return multiplica(a, -1.0);
    }

}
