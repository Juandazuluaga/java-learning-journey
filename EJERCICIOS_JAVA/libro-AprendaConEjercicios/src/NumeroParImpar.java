import java.util.Scanner;

public class NumeroParImpar {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un número" );
        int numeroUno = s.nextInt();


        if (numeroUno  % 2 == 0 ){
            System.out.println(numeroUno + " Es par");

        }else {
            System.out.println(numeroUno + " Es impar");
        }
    }
}
