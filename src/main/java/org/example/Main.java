package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 8){
            System.out.println("****************************\n" +
                    "Bienvenidos al Conversor de monedas\n\n"+
                    "Ingrese la conversion que desea realizar\n\n"+
                    "1. Dollar a peso Argentino\n"+
                    "2. Peso Argentino A Dollar\n"+
                    "3. Dollar a Real Brasilero¸\n"+
                    "4. Real Brasilero a Dollar\n"+
                    "5. Dollar a Peso Colombiano\n"+
                    "6. Peso Colombiano a Dollar\n"+
                    "7. Convertir a otra moneda\n"+
                    "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir( "USD", "ARS",consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir( "ARS", "USD",consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir( "USD", "BRL",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir( "BRL", "USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir( "USD", "COP",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir( "COP", "USD",consulta,lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,lectura);
                    break;
                case 8:
                    System.out.println("saliendo...");
                default:
                    System.out.println("opcion no validad");
                    break;
            }
        }

    }
}