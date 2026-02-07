import java.util.Scanner;

public class CalculadoraDeDescuentos {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el número de camisas compradas");
        int numeroCamisas = s.nextInt();

       int precioCamisa = 20;

       double totalPagar = numeroCamisas * precioCamisa;

       double porcentaje;

        if (numeroCamisas <= 5){
            System.out.println("No hay descuento, el precio a pagar es: " + totalPagar);
        }else if ( numeroCamisas >= 6 && numeroCamisas <= 10){
            porcentaje = (totalPagar * 10 ) / 100;
            System.out.println("Tienes un descuento del 10%, el precio a pagar es: " + (totalPagar - porcentaje) );
        }else if (numeroCamisas >10){
            porcentaje = (totalPagar * 20 ) / 100;
            System.out.println("Tienes un descuento del 20%, el precio a pagar es: " + (totalPagar - porcentaje) );
        }

    }
}
