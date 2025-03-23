package Examples;

public class ejemplo {
    public static void main(String[] args){
        // Se crea la estructura grafica de la tabla.
        System.out.println("Numero | Cuadrado | Cubo");
        System.out.println("-------------------------");
        // En este for se realizan las potencias y luego se imprimen en orden.
        for(int i = 0; i <= 10; i++){
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d|%d|%d%n", i, cuadrado, cubo);
        }
    }
}
