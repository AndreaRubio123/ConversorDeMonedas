import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();


        int opcion = 0;
        while (opcion != 8){
            System.out.println("""
                    ********************
                    --Elija la converción que deceas realizar--
                    1 - Peso Argentino -> Dólar estadounidense
                    2 - Boliviano Boliviano -> Dólar estadounidense
                    3 - Real Brasileño -> Dólar estadounidense
                    4 - Peso Chileno -> Dólar estadounidense
                    5 - Peso Colombiano -> Dólar estadounidense
                    6 - Peso Mexicano -> Dólar estadounidense
                    7 - Convertir otra moneda
                    8 - Salir
                    ********************
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("BOB", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }

        }
    }
}
