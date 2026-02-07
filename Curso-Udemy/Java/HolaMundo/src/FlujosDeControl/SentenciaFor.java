package FlujosDeControl;

public class SentenciaFor {
    static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            System.out.println("i es igual a : " + i);
        }


        for (int i = 10; i >= 0; i--) {
            System.out.println("I en decremento es igual a : " + i);
        }

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }

    }
}
