package FlujosDeControl;

public class SentenciaWhile {
    static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
        //El while es pre prueba, primero evalua, después ejecuta e intera.
        i = 0;
        boolean prueba = true;
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }
        // el do while es post-prueba. primero ejecuta al menos una vez y luego evalua la condición
        prueba = false;
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (false);

        prueba = true;
        i = 0;

        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;

        } while (prueba);
    }
}


