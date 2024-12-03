import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaObjetivo, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaObjetivo);
        System.out.println("Ingresa la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = "
        + cantidadConvertida + " " + moneda.target_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("""
                --Ingresa el codigo como moneda base--
                ******
                Ejm: 'USD'
                """);
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("""
                --Ingresa el codigo como moneda objetivo--
                ******
                Ejm: 'USD'
                """);
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
