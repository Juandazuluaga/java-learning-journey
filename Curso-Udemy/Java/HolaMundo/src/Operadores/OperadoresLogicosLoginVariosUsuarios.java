package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginVariosUsuarios {
    static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Juanda";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/


        // SEGUNDA FORMA DE HACER EL ARREGLO

        String[] usernames = {"Juanda", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.nextLine(); // String u = "Juanda";


        System.out.println("Ingrese el password ");
        String p = scanner.nextLine();


        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equalsIgnoreCase(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrecto. ");
            System.out.println("Lo sentimos, requiere ser autenticado");
        }

    }


}
