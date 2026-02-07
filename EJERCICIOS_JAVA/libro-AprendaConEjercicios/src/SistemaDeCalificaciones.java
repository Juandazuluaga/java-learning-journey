import java.util.Scanner;

public class SistemaDeCalificaciones {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa tu nota entre 0 al 100 ");

        double nota = s.nextDouble();


        if (nota > 100 || nota < 0) {
            System.out.println("Nota invalida");

        } else if (nota >= 90) {
            System.out.println("Excelente (A)");
        } else if (nota >= 80) {
            System.out.println("Bueno (B)");
        } else if (nota >= 70) {
            System.out.println("Regular(C) ");
        } else if (nota < 70) {
            System.out.println("Reprobado (F) ");
        }

        // Esta fué mi logica.
        /*if (nota < 70){
            System.out.println("Reprobado (F) ");
        }else if (nota >= 70 && nota <= 79 ){
            System.out.println("Regular(C) ");

        }else if (nota >= 80 && nota <= 89){
            System.out.println("Bueno (B)");

        }else if (nota >= 90 && nota <= 100){
            System.out.println("Excelente (A) ");
        }else {
            System.out.println("Nota invalida, por favor ingrese un valor entre 0 y 100");*/
    }
}

