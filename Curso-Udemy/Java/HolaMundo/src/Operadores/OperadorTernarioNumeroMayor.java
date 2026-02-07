package Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int num1 = s.nextInt();

        System.out.println("Ingrese un segundo número ");
        int num2 = s.nextInt();

        System.out.println("Ingrese un Tercer número ");
        int num3 = s.nextInt();

        System.out.println("Ingrese un Tercer número ");
        int num4 = s.nextInt();

        //Buscar el máximo valor con un operador ternario.

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num3 = " + num4);

        System.out.println("El número máximo es: " + max);

        //Así sería con un if
        if (num1 > num2 && num1 > num3) {
            max = num1;

        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num2 && num3 > num4) {
            max = num3;

        } else {
            max = num4;
        }
        System.out.println("El número máximo en el if es: " + max);
    }
}
