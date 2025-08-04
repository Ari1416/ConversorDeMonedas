import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 8)
        {
            System.out.println("""
                    ****************************************************
                    Bienvenidos al Conversor de Monedas de Arianna
                    Ingresa el numero de la conversion que desea realizar:
                    
                    1.Dollar a Pesos Argentinos
                    2.Pesos Argentinos a Dollar
                    3.Dollar a Real Brasilero
                    4.Real Brasilero a Dolar
                    5.Dollar a Peso Colombiano
                    6.Peso Colombiano a Dollar
                    7.Convertir otra moneda
                    8.Salir
                    ****************************************************
                    """);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, teclado);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, teclado);
                    break;
                case 7:
                    ConvertirMoneda.convertirMoneda(consulta, teclado);
                    break;
                case 8:
                    System.out.println("Gracias por utilizar mi conversor!!!");
                    break;
                default:
                    System.out.println("!!!!!Opcion no valida, por favor utilizar una de las opciones de nuestro sistema¡¡¡¡¡");
                    break;
            }
        }
    }
}
