package TipoStringCadenas;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre = " + nombre.charAt(1));
        System.out.println("nombre = " + nombre.charAt(5));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(5) = " + nombre.substring(5));

        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length() - 1));

        //SEGUNDA PARTE

        String trabaLenguas = "trabaLenguas";
        System.out.println("trabaLengua = " + trabaLenguas.replace("a", "."));
        System.out.println("trabaLenguas.indexOf('a') = " + trabaLenguas.indexOf('a'));
        System.out.println("trabaLenguas.lastIndexOf('a') = " + trabaLenguas.lastIndexOf('a'));
        System.out.println("trabaLenguas.indexOf('z') = " + trabaLenguas.indexOf("Lenguas"));
        System.out.println("trabaLenguas.contains(\"Lenguas\") = " + trabaLenguas.contains("Lenguas"));
        System.out.println("trabaLenguas.startsWith(\"traba\") = " + trabaLenguas.startsWith("traba"));
        System.out.println("trabaLenguas.endsWith(\"uas\") = " + trabaLenguas.endsWith("uas"));
        System.out.println("  trabaLenguas ");
        System.out.println("  trabaLenguas ".trim());


    }
}
