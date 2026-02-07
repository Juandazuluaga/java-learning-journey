import java.util.Scanner;

public class PagoHorasExtras {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = scanner.nextInt();
        int sueldoSemanal;
        int sueldoSemanalExtras;
        if (horasTrabajadas <= 40) {
            sueldoSemanal = horasTrabajadas * 12;
            System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
        } else if (horasTrabajadas >= 41) {
            sueldoSemanalExtras = (horasTrabajadas * 16) - 160;
            System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanalExtras + " euros");
        }
    }
}