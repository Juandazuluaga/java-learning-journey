import java.util.Scanner;

public class IfElseNumeroPositivoNegativo {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero, puede ser positivo o negativo ");
        int numero = scanner.nextInt();


        if (numero > 0 ){
            System.out.println("El numero es Positivo : " + numero);
        }else {
            System.out.println("El numero es negativo : " + numero);
        }

    }
}
