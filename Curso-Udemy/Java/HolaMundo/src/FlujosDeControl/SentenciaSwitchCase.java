package FlujosDeControl;

public class SentenciaSwitchCase {
    static void main(String[] args) {

        int num = 2;

        switch (num) {
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
        }

        String nombre = "pepito";

        switch (nombre) {
            case "admin":
                System.out.println("Bienvenido : admin ");
                break;
            case "juanda":
                System.out.println("Bienvenido : juanda ");
                break;
            case "Pepe":
                System.out.println("Bienvenido: Pepe ");
                break;

            default:
                System.out.println("Bienvenido usuario desconocido " + nombre);

        }
    }
}
