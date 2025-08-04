
import java.util.Scanner;

public class ConvertirMoneda {


        public static void convertir(String mondedaBase, String monedaConvertida, ConsultarMoneda consulta, Scanner teclado){

            double cantidad;
            double cantidadConvertida;

            Moneda moneda = consulta.buscarMoneda(mondedaBase, monedaConvertida);
//            System.out.println("La tasa de cambio para hoy es: " + mondedaBase + "=" + moneda.conversion_rate()+" "+monedaConvertida);
            System.out.println("Ingrese la cantidad de " + mondedaBase);
            cantidad = Double.parseDouble(teclado.nextLine());
            cantidadConvertida = cantidad * moneda.conversion_rate();
            System.out.println(cantidad + " " + mondedaBase + " = " + cantidadConvertida+ " " + monedaConvertida);
        }
        public static void convertirMoneda(ConsultarMoneda consulta, Scanner teclado){
            System.out.println("Ingrese el codigo de la moneda base: ");
            String monedasBase = teclado.nextLine().toUpperCase();
            System.out.println("Ingrese la moneda obejtivo: ");
            String monedaObjetivo = teclado.nextLine().toUpperCase();
            convertir(monedasBase, monedaObjetivo, consulta, teclado);

        }


}
