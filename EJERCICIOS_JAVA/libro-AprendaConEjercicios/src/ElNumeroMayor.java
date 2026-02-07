import java.util.Scanner;

public class ElNumeroMayor {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        int numeroUno = s.nextInt();
        System.out.println("Ingresa el segundo número");
        int numeroDos = s.nextInt();

        if (numeroUno > numeroDos){
            System.out.println("El número mayor es: " + numeroUno);
        }else if (numeroDos > numeroUno){
            System.out.println("El número mayor es: " + numeroDos);
        }else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
