package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco ", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pePa".toLowerCase())){

                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre.");
        System.out.println("Buscar = " + buscar);

        boolean encontrado = false;

        for (int i = 0; i < count; i++){
        if (nombres[i].equalsIgnoreCase(buscar)){
            encontrado = true;
            break;
        }
            System.out.println("nombres = " + nombres);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado !");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema! ");
        }
    }
}
