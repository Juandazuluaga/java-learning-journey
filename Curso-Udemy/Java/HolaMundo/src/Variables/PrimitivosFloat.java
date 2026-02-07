package Variables;

public class PrimitivosFloat {
    static void main(String[] args) {
        /*float realFloat = 2.12e3f; //2120f; n
        System.out.println("realFloat = " + realFloat);*/

        float realFloat = 3.4028235E38f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("flotat corresponde en byte a  = " + Float.BYTES);
        System.out.println("flotat corresponde en bytes a  = " + Float.SIZE);
        System.out.println("máximo valor para flotat   = " + Float.MAX_VALUE);
        System.out.println("minimo valor para flotat   = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a  = " + Double.BYTES);
        System.out.println("double corresponde en bytes a  = " + Double.SIZE);
        System.out.println("máximo valor para double   = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double   = " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);


    }
}
