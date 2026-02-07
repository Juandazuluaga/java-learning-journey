import java.util.Scanner;

public class IfElseNombreCapital {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese en nombre de la capital de Colombia");
        String nombre = scanner.nextLine();

        if (nombre.equalsIgnoreCase("Bogotá")){
            System.out.println("Perfecto, la capital de Colombia es: " + nombre);
        }else {
            System.out.println("Lo siento, pero la Capital de Colombia es Bogotá.");
        }
    }
}
