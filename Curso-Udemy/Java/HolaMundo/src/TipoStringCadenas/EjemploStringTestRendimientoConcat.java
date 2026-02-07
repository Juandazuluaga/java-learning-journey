package TipoStringCadenas;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {


        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            c = c.concat(a).concat(b).concat("\n");  // 500 => 1ms,  1000 => 2ms, 10000 => 123ms, 100000 => 6036ms
            //c += a + b + "\n"; // 500 => 3ms, 1000 => 4ms, 10000 => 54ms, 100000 => 2176ms
            // sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 1ms, 100000 => 6ms

        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
