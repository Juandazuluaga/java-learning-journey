import java.util.Scanner;

public class HoraReloj {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" Ingrese una hora entre las 0 y las 24");
        int hora = s.nextInt();

        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas Tardes");
        } else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5) ) {
            System.out.println("Buenas noches");

        }else {
            System.out.println("Error !!!  Ingrese una hora entre las 0 y las 24 ");
        }
    }
}
