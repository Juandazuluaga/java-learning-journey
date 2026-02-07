import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre de la factura :");
        String nombreFactura = scanner.nextLine();

        System.out.println("Por vaflor ingrese el precio de tu producto");
        double precio1 = scanner.nextDouble();

        System.out.println("Por valor ingrese el precio de tu segundo producto");
        double precio2 = scanner.nextDouble();

        System.out.println("Por valor ingrese el precio de tu tercer producto");
        double precio3 = scanner.nextDouble();

        double totalProductos = precio1 + precio2 + precio3;

        double tasaImpuesto = 0.19;
        double valorImpuesto = totalProductos * tasaImpuesto;
        double precioTotal = totalProductos + valorImpuesto;
        System.out.println("La factura producto de " + nombreFactura + " tiene un total bruto de " + totalProductos + "con un impuesto de " + valorImpuesto + " Y el monto después de impuesto es de " + precioTotal);


    }
}
