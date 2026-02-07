package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    static void main(String[] args) {


        // ejempro de la estructura ===>  variable = condicion booleana ? si es verdadera: si es falso;

        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0: ");
        matematicas = scanner.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0: ");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.printf("promedio =  %.2f\n", promedio);


        estado = promedio >= 5.2 ? "Abrobaste" : "No aprobaste";
        System.out.println(estado);

        // El operador ternario es una versión más compacta de un if
        // Seria exactamente lo mismo.
        if (promedio >= 5.2) {
            estado = "Aprobado";
        } else {
            estado = "Rechazado";

        }
        System.out.println("estado = " + estado);

    }
}
