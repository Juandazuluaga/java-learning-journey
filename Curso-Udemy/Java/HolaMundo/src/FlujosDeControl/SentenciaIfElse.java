package FlujosDeControl;

import java.util.Scanner;

public class SentenciaIfElse {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta la nota final de tu materia ");

        float promedio = scanner.nextFloat();


        if (promedio == 10.0) {
            System.out.println("Felicidades!! sacaste la nota máxima. ");

        } else if (promedio >= 8.0) {
            System.out.println("Excelente, tu puntaje es alto, felicitaciones.  ");

        } else if (promedio >= 6.5) {
            System.out.println("Pasaste con buen puntaje, animo, puedes mejorar. ");
        } else if (promedio >= 5.1) {
            System.out.println("Pasaste con puntaje bajo, te tienes que esforzar más. ");
        } else {
            System.out.println("Reprobaste la materia.");
        }


        System.out.println("Tu promedio es:  " + promedio);

    }
}
