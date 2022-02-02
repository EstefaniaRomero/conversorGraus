import java.util.Scanner;

public class conversorGraus {



   /* Escriure un conversor de Fahrenheit a Celsius. L’usuari escriu en decimals la
    temperatura en escala Fahrenheit (permet decimals) i ho mostra en graus
    Celsius.*/

    private static final double FAHRENHEIT_VALUE = 32;

    public static void main(String[] args) {

        double degree = askFahrenheit();
        double celsius = convertDegreeToCelsius(degree);
        printResult(celsius);

    }

    private static void printResult(double convert) {

        System.out.println("EL resultat es: " + convert + " graus Celsius");
    }

    private static double convertDegreeToCelsius(double degree) {

      return (degree-FAHRENHEIT_VALUE)*5/9;

    }

    private static double askFahrenheit() {

        System.out.println("Introdueix els graus en Fahrenheit:");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();

    }
}
