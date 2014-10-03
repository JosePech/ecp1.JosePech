package clases;

public class Numeros {
    
    public static double suma(Object a, Object b){
        return (double)a + (double)b;
    }        
    
    public static double resta(Object a, Object b){
        return (double)a - (double)b;
    }
    
    public static double multiplica(double a, double b){
        return a * b;
    }
    
    public double divide(double a, double b){
        return a/b;
    }
    
    public static double absoluto(double a){
        return Math.abs(a);
    }
    
    public static double negativo(double a){
        return multiplica(a, -1.0);
    }
    
    public static double potencia(double a, double b){
        return Math.pow(a,b);
    }
    
    

}
