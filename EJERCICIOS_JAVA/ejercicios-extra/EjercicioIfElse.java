
import java.util.Scanner;

public class EjercicioIfElse {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese su edad : ");
        int edad = scanner.nextInt();

        if (edad < 4) {
            System.out.println("e un Bebe.");
            System.out.println("La entrada es gratis!!!! ");
        } else if (edad >= 4 && edad <= 12) {
            System.out.println("Es un Niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Es un Adolescente ");
        } else if (edad >= 65) {
            System.out.println(" Adulto Mayor ");
            System.out.println("Descuento de jubilado!!!");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }
}