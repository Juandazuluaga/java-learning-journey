package FlujosDeControl;

public class SentenciaForEach {
    static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 8, 9, 11, 13, 14};
        for (int num : numeros) {
            System.out.println("numeros = " + num);
        }
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco ", "Lalo", "Bea", "Pato", "Pepa"};
        for (String nomb : nombres){
            System.out.println("nomb = " + nomb);
        }
    }

}
