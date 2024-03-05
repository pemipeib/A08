package Actividad08;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class A08 {

//    Variables
//    Numero de Entrada
    static int localidadesPalco = 1, localodadesPrincipal= 1, localodadesCentral= 1, localodadesLateral= 1;
//    NÚmero máximo entradas
    static int maxLocalidadesPalco=40, maxLocalidadesPrincipal=200, maxLocalidadesCentral=400, maxLocalidadesLateral=100;

//    Objetos
    static Palco palco;

//    Arraylist
    static ArrayList<Palco> palcoArrayList= new ArrayList<Palco>();

    public static void main(String[] args) {

        int opt= 0;

       do {
           opt= menu();
           opcion(opt);
       }while (opt != 4);

    }

//    Menú principal
    public static int menu(){
        int opt= 0;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Elije una opción\n" +
                "1. Vender entrada\n" +
                "2. Consulta entrada\n" +
                "3. Informe de zona\n" +
                "4. Finalizar\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 4);

        return opt;
    }
//    Opciones del menú principal
    public static void opcion(int opt){
        switch (opt){
            case 1:
                opcionVentas();
                break;
            case 2:
                opcionConsulta();
                break;
            case 3:
                opcionZona();
                break;
        }
    }

//   Venta de entradas
    public static int menuVentas(){
    int opt= 0;

    Scanner pedirDatos= new Scanner(System.in);

    String menu= "Elije una zona\n" +
            "1. Palco\n" +
            "2. Principal\n" +
            "3. Central\n" +
            "4. Lateral\n" +
            "5. Menú principal\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 5);

        return opt;
    }

//    Opciones de venta
    public static void opcionVentas(){

        int opt= menuVentas();

        switch (opt){

//            ventas Palco
            case 1:
                if (localidadesPalco == maxLocalidadesPalco){
                    imprimir("Ya no quedan entradas de palco");
                }else {
                    imprimir("Vender entrada palco");
                    int entrada= localidadesPalco;
                    String numeroEntrada= "palco" + localidadesPalco;
                    palco= new Palco(entrada, numeroEntrada);
                    palco.precio();
                    palco.entradasRestentes();
                    imprimir(palco.toString());
                    palcoArrayList.add(palco);
                    localidadesPalco++;
                    opcionVentas();
                }
                break;

//            ventas Principal
            case 2:
                imprimir("2");
                break;

//            ventas Central
            case 3:
                imprimir("3");
                break;

//            ventas Lateral
            case 4:
                imprimir("4");
                break;
            case 5:
                menu();
                break;
        }
    }


//    Consulta entradas
    public static int menuConsulta(){
        int opt= 0;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Elije una opción\n" +
                "1. Verificar entrada palco\n" +
                "2. Verificar entrada principal\n" +
                "3. Verificar entrada central\n" +
                "4. Verificar entrada lateal\n" +
                "5. Menú principal\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 5);

        return opt;
    }

//    Opciones de consulta
    public static void opcionConsulta(){

        int opt= menuConsulta();

        switch (opt){
            case 1:
                if (localidadesPalco > 1){
                    comprobarEntrada();
                    opcionConsulta();
                }else {
                    noEntradas("palco");
                    opcionConsulta();
                }
                break;
            case 2:
                imprimir("2");
                break;
            case 3:
                imprimir("3");
                break;
            case 4:
                imprimir("4");
                break;
            case 5:
                menu();
                break;
        }
    }

    public static void comprobarEntrada(){//No funciona siempre muestra la última entrada

        boolean correcto= false;

        Scanner pedirDatos= new Scanner(System.in);

        for (Zonas palco1 : palcoArrayList) {
            imprimir(palco1.toString());
        }

        imprimir("Dime el numero de entrada");
        String numeroEntrada= pedirDatos.nextLine();

        for (Zonas palco1 : palcoArrayList) {

            if (Objects.equals(numeroEntrada, palco1.getNumeroEntrada())){
                imprimir("La entrada es correcta\n" + palco1.toString());
                imprimir("");
                correcto= true;
                break;
            }

        }

        if (!correcto){
            imprimir("No hay ninguna entrada con ese número");
        }
    }

//    Informe de Zonas

//    Opciones de Zona
    public static int menuZona(){
        int opt= 0;

        Scanner pedirDatos= new Scanner(System.in);

        String menu= "Informe zonas\n" +
                "1. Zona palco\n" +
                "2. Zona principal\n" +
                "3. Zona central\n" +
                "4. Zona lateral\n" +
                "5. Menú principal\n";

        do{
            imprimir(menu);
            opt= pedirDatos.nextInt();
        }while(opt < 1 || opt > 5);

        return opt;
    }

    public static void opcionZona(){

        int opt= menuZona();

        switch (opt){
            case 1:
                if (localidadesPalco > 1){
                    float total= 0;
                    for (int i = 0; i < palcoArrayList.size(); i++) {
                        total= total +  palcoArrayList.get(i).precio;
                    }
                    palco.setTotal(total);
                    imprimir(palco.informeZona());
                    palco.setTotal(0.00f);
                    opcionZona();
                }else {
                    noEntradas("palco");
                    opcionZona();
                }
                break;
            case 2:
                imprimir("2");
                break;
            case 3:
                imprimir("3");
                break;
            case 4:
                imprimir("4");
                break;
            case 5:
                menu();
                break;
        }
    }

    public static void noEntradas(String entrada){
        imprimir("No se han vendido entradas de " + entrada);
    }

    public static void imprimir(String datos){
        System.out.println(datos);
    }

}
