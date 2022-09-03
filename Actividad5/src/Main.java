import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creamos las variables en las que se guardarán los números que de el usuario
        float x;
        float y;

        //Creamos variablez para guardar los resultados de las operaciones
        float suma;
        float resta;
        float multiplicacion;
        float division;
        float modulo;

        //Creamos una variable más para poder leer las variables que de el usuario
        Scanner scan = new Scanner(System.in);

        //Le pedimos los números
        System.out.println("Por favor introduzca su primer número");
        x=scan.nextFloat();

        System.out.println("Por favor introduzca su segundo número");
        y=scan.nextFloat();

        //Se ejecutaran las operaciones
        suma = x + y;
        resta = x - y;
        multiplicacion = x * y;
        division = x / y;
        modulo = x % y;

        //Imprime los resultados
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Suma = "+suma);
        System.out.println("Resta = "+resta);
        System.out.println("Multiplicación = "+multiplicacion);
        System.out.println("División = "+division);
        System.out.println("Módulo = "+modulo);

    }
}
