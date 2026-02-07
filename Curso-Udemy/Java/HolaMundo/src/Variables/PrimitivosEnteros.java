package Variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo bite corresponde en byte a = " + Byte.BYTES);
        System.out.println("tipo bite corresponde en bytes a = " + Byte.SIZE);
        System.out.println("valor máximo de un byte  = " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte  = " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo Short corresponde en byte a = " + Short.BYTES);
        System.out.println("tipo Short corresponde en bytes a = " + Short.SIZE);
        System.out.println("valor máximo de un Short  = " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un Short  = " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a = " + Integer.BYTES);
        System.out.println("tipo Int corresponde en bytes a = " + Integer.SIZE);
        System.out.println("valor máximo de un Int  = " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un Int  = " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en byte a = " + Long.BYTES);
        System.out.println("tipo long corresponde en bytes a = " + Long.SIZE);
        System.out.println("valor máximo de un Long  = " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un Long  = " + Long.MIN_VALUE);

        float numeroFloat = 3.4028235E38f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en byte a = " + Float.BYTES);
        System.out.println("tipo float corresponde en bytes a = " + Float.SIZE);
        System.out.println("valor máximo de un float  = " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float  = " + Float.MIN_VALUE);

        double numeroDouble = 1.7976931348623157E308d;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en byte a = " + Double.BYTES);
        System.out.println("tipo double corresponde en bytes a = " + Double.SIZE);
        System.out.println("valor máximo de un double  = " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double  = " + Double.MIN_VALUE);

        var numeroVar = 2147483647;


    }
}
