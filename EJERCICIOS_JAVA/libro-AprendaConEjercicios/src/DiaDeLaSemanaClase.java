import java.util.Scanner;

public class DiaDeLaSemanaClase {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana sin ");

        String diaSemana = scanner.nextLine();



       switch ( diaSemana.toLowerCase()){

           case "lunes":
               System.out.println(diaSemana + " Clase de Informática");
               break;
           case "martes":
               System.out.println(diaSemana + " Clase de Matemáticas");
               break;
           case "miercoles":
               System.out.println(diaSemana + " Clase de deportes");
               break;
           case  "jueves":
                   System.out.println(diaSemana + " Clase de Ingles");
                   break;
           case "viernes":
               System.out.println(diaSemana + " Clase de Español");
               break;
           default:
               System.out.println("Día no valido");
       }
    }
}
