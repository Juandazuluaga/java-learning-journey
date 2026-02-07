import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Ingrese el tercer nombre: ");
        String nombre3 = scanner.nextLine();


        char[] arreglo1 = nombre1.toCharArray();
        int largo1 = arreglo1.length;
        char segundoChar1 = Character.toUpperCase(arreglo1[1]);
        String ultimosDos1 = "" + arreglo1[largo1 - 2] + arreglo1[largo1 - 1];
        String resultado1 = segundoChar1 + "." + ultimosDos1;


        char[] arreglo2 = nombre2.toCharArray();
        int largo2 = arreglo2.length;
        char segundoChar2 = Character.toUpperCase(arreglo2[1]);
        String ultimosDos2 = "" + arreglo2[largo2 - 2] + arreglo2[largo2 - 1];
        String resultado2 = segundoChar2 + "." + ultimosDos2;


        char[] arreglo3 = nombre3.toCharArray();
        int largo3 = arreglo3.length;
        char segundoChar3 = Character.toUpperCase(arreglo3[1]);
        String ultimosDos3 = "" + arreglo3[largo3 - 2] + arreglo3[largo3 - 1];
        String resultado3 = segundoChar3 + "." + ultimosDos3;

        // Resultado final
        String resultadoFinal = resultado1 + "_" + resultado2 + "_" + resultado3;

        System.out.println("\nResultado:");
        System.out.println(resultadoFinal);


    }
}
