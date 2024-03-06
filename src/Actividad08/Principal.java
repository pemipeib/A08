package Actividad08;

import java.util.Scanner;

public class Principal extends Zonas implements Descuento {

    //    Constantes
//    Localidades de la  zona
    final int LOCALIDADES = 200;
    //    Zona
    final Zona ZONA= Zona.Principal;
    //    Precio de la zona
    final float PRECIO= 25f;
    //     Precio reducido de la zona
    final float PRECIOREDUCIDO= 17.5f;
    //    Precio con descuento de la zona
    final float PRECIOREDESCUENTO= PRECIO / 100 * Descuento.DESCUENTO;

    //    Constructor
    public Principal(int entradasVendidas, String numeroEntrada) {
        this.entradasVendidas= entradasVendidas;
        this.numeroEntrada = numeroEntrada;
    }

    //    Añadir el precio de la xona
    public void precio(){

        int opt= 0;
        float precio= 0.00f;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Elije precio\n" +
                "1. Normal\n" +
                "2. Abonado\n" +
                "3. Descuento\n";

        do {
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while (opt < 1 || opt > 3);

        switch (opt){
            case 1:
                precio= this.PRECIO;
                break;
            case 2:
                precio= this.PRECIOREDUCIDO;
                break;
            case 3:
//                precio= calcularDescuento(this.PRECIO);
                precio= this.PRECIOREDESCUENTO;
                break;
        }

        this.precio= precio;
    }

//    Calculo de las entradas que quedan
    public void entradasRestentes(){
        this.entradasRestantes= this.LOCALIDADES - this.entradasVendidas;
    }

    //    Muestra la entrada
    @Override
    public String toString() {
        return
                "zona= " + ZONA +
                        "\nnumero de entrada= " + numeroEntrada +
                        "\nprecio= " + precio +
                        "\nentradas restantes= " + entradasRestantes + "\n"
                ;
    }

    //    Para el informe de zona
    public String informeZona() {
        return
                "zona= " + ZONA +
                        "\nlocalidades vendidas= " + entradasVendidas +
                        "\nLocalidades restantes " + entradasRestantes +
                        "\nRecaudado= " + total + "\n"
                ;
    }

    public static void imprimir(String datos){
        System.out.println(datos);
    }
}
