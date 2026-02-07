import java.util.Scanner;

public class ForTablaDeMultiplicar {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10 ");
        int numero = s.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
