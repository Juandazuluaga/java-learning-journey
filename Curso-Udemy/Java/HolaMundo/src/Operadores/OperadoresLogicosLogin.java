package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    static void main(String[] args) {

        String username = "Juanda";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.nextLine(); // String u = "Juanda";


        System.out.println("Ingrese el password ");
        String p = scanner.nextLine();


        boolean esAutenticado = false;


        if (username.equalsIgnoreCase(u) && password.equals(p) || username2.equalsIgnoreCase(u) && password2.equals(p)) {
            esAutenticado = true;
        } else {
            System.out.println("Usuario o contraseña incorrecto. ");
        }


        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo sentimos, requiere ser autenticado");
        }

    }


}
