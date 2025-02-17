import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {
        // Declaracion de las variables para el ejercicio
        // c -> grados celsius, f -> grados farenheit
        // gradosCelsius, gradosFarenheit
        double c, f, gradosCelsius, gradosFarenheit;
        // pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los grados Celsius");
        c = leer.nextDouble();
        System.out.println("Digite los grados Farenheit");
        f = leer.nextDouble();
        // calculamos las formulas para cada una de las conversines
        gradosCelsius = (f - 32.0) * (5.0 / 9.0);
        gradosFarenheit = c * (9.0 / 5.0) + 32.0;
        // mostrar los resultados de las formulas
        System.out.println("ºF -> ºC :" + gradosCelsius);
        System.out.println("ºc -> ºF :" + gradosFarenheit);

        leer.close();

    }
}
